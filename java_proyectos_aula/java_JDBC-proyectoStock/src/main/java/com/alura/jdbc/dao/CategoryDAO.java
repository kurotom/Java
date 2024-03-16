package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.models.Categoria;
import com.alura.jdbc.models.Producto;




public class CategoryDAO implements InterfaceCategorias {
	
	private Connection conexion;
	
	
	public CategoryDAO(Connection conexion) {
		this.conexion = conexion;
	}
	
	
	@Override
	public List<Categoria> listar() {
		
		List<Categoria> lista = new ArrayList<>();
		
		String query = "Select * from categorias;";
		
		try {
			PreparedStatement sentencia = this.conexion.prepareStatement(query);
			
			sentencia.execute();
			
			final ResultSet resultado = sentencia.getResultSet();
			
			try (resultado) {
				
				while (resultado.next()) {
					lista.add(new Categoria(
							resultado.getInt("ID"),
							resultado.getString("NOMBRE")
						));
				}
				
				return lista;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	public Categoria obtenerCategoria(int id) {
		String query = "SELECT * FROM categorias WHERE id = ?;";
		
		try {
			PreparedStatement sentencia = this.conexion.prepareStatement(query);
			
			sentencia.setInt(1, id);
			
			sentencia.execute();
			
			final ResultSet resultado = sentencia.getResultSet();
			
			while (resultado.next()) {
				return new Categoria(
						resultado.getInt("ID"),
						resultado.getString("NOMBRE")
						);
			}
			return null;
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	public int getCatID(String nombre) {
		
		String query = "SELECT * FROM categorias WHERE nombre = ?";
		
		try {
			PreparedStatement sentencia = this.conexion.prepareStatement(query);
			sentencia.setString(1, nombre);
			
			sentencia.execute();
			
			final ResultSet resultado = sentencia.getResultSet();
			
			try (resultado) {
				
				while(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			return -1;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}


	public List<Categoria> listarProductos() {
		
//		Este método toma la query que une las relaciones y filtra, junta en listas separadas por categoria
//		la agrega a una lista de la clase de Categoria (una categoria puede tener muchos productos)
//		filtra y agrupa por cada objeto "Producto" creado usando "categoriaIterator".
//		Retorna una lista de productos agrupados por categoría.
		
		List<Categoria> resultado = new ArrayList<>();
		
		
		try {
			
			String query = "SELECT categorias.id AS catid, "
					+ "categorias.nombre AS catname, datos.id AS prodid, "
					+ "datos.nombre AS prodname, datos.cantidad "
					+ "FROM datos, categorias WHERE categorias.id = datos.categoria_id "
					+ "GROUP BY categorias.id, categorias.nombre, datos.id, datos.nombre, categorias.nombre;";
			
			
			final PreparedStatement sentencia = this.conexion.prepareStatement(query);
			
			try (sentencia) {
				
				System.out.println(sentencia);
				
				final ResultSet resultQuery = sentencia.executeQuery();
				
				try (resultQuery) {
					while (resultQuery.next()) {
						
						int categoriaID = resultQuery.getInt("CATID");
						String nombreCat = resultQuery.getString("CATNAME");
						
						
						Categoria categoriaIterador = resultado.stream()
												  .filter(item -> item.getId().equals(categoriaID))
//								                  .filter(cat -> Integer.valueOf(cat.getId()).equals(categoriaID))
								                  .findAny().orElseGet(() -> {
								                	  Categoria cat = new Categoria(
									                			  categoriaID,
									                			  nombreCat
								                			  );
								                	  resultado.add(cat);
								                	  return cat;
								                  });
						
						Producto producto = new Producto(
									resultQuery.getInt("PRODID"),
									resultQuery.getString("PRODNAME"),
									resultQuery.getInt("CANTIDAD")
								);
								                  
						
						categoriaIterador.agregarProductos(producto);
						
						
					}
				}
			}
			
			return resultado;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	

}
