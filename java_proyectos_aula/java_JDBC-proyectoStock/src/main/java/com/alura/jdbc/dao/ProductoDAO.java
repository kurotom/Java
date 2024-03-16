package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alura.jdbc.models.Categoria;
import com.alura.jdbc.models.Producto;


// Se encarga de implementar los métodos CRUD de la interface InterfaceProductoDAO
// Es responsable de las operaciones CRUD.


public class ProductoDAO implements InterfaceProductoDAO {
	
	private Connection conexion;

//	Constructor requiere de una conexion, esta conexión se utilizará para toda la aplicación mientras esté en uso.
	public ProductoDAO(Connection con) {
		this.conexion = con;
	}
	

	@Override
	public List<Producto> listar() {
		
		List<Producto> lista = new ArrayList<> ();
		
		try {
			
			this.conexion.setAutoCommit(false);
			
			String query = "SELECT datos.id, datos.nombre, datos.descripcion, datos.cantidad, categorias.id AS cateid, categorias.nombre AS categoria FROM datos, categorias WHERE datos.categoria_id = categorias.id;";

			
			PreparedStatement sentencia = this.conexion.prepareStatement(query);
			sentencia.execute();
			final ResultSet resultado = sentencia.getResultSet();

			try (resultado) {
				
				while (resultado.next()) {
					
					String categoria = "Select * from categorias WHERE id = ?;";
					PreparedStatement categoriaStatement = this.conexion.prepareCall(categoria);
					categoriaStatement.setInt(1, Integer.valueOf(resultado.getString("CATEID")));
					
					categoriaStatement.execute();
					
					ResultSet res = categoriaStatement.getResultSet();
					
					try (res) {
						while (res.next()) {
							
							lista.add(new Producto(
								resultado.getInt("Id"),
								resultado.getString("NOMBRE"),
								resultado.getString("DESCRIPCION"),
								resultado.getInt("CANTIDAD"),
								new Categoria(
										Integer.valueOf(res.getString("ID")),
										res.getString("NOMBRE")
									)
								)
							);
						}
					}
				}
				
				conexion.commit();
				
				lista.sort(new Comparator<Producto>() {
					
					public int compare(Producto o1, Producto o2) {
						if (o1.getId() == o2.getId()) {
							return 0;
						} else if (o1.getId() > o2.getId()) {
							return 1;
						} else {
							return -1;
						}
					}
					
				});
				
				
				return lista;
				
			} catch (Exception e) {
				// TODO: handle exception
				
				conexion.rollback();
				
				e.printStackTrace();
				throw new RuntimeException(e); 
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	
	@Override
	public int modificar(Integer id, String nombre, String descripcion, Integer cantidad) {
		// TODO Auto-generated method stub
				
		try {
			
			String modificar = String.format("UPDATE datos SET nombre = ?, descripcion = ?, cantidad = ? WHERE id = ?");
			
			final PreparedStatement preparandoSQL = this.conexion.prepareStatement(modificar, PreparedStatement.RETURN_GENERATED_KEYS);
			
			try (preparandoSQL) {
				preparandoSQL.setString(1, nombre);
				preparandoSQL.setString(2, descripcion);
				preparandoSQL.setInt(3, cantidad);
				preparandoSQL.setInt(4, id);	
				
				preparandoSQL.execute();
				
				final ResultSet keyItem = preparandoSQL.getGeneratedKeys();
				
				try (keyItem) {
					int num = -1;
		        	while (keyItem.next()) {
		        		num = keyItem.getInt(keyItem.getRow());
		        		System.out.println("Registro modificado, ID: " + num);
		        	}
		        	
		        	this.conexion.commit();
		        	
		        	return num;

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

	
	
	@Override
	public void eliminar(int idProducto) {
		// TODO Auto-generated method stub
		
		try {
			
			this.conexion.setAutoCommit(false);
			
			String query = "DELETE FROM datos WHERE id = ?;";
			
			
			final PreparedStatement preparandoSQL = this.conexion.prepareStatement(query);
			
			try (preparandoSQL) {
				
				preparandoSQL.setInt(1, idProducto);
				
				preparandoSQL.execute();
				
				this.conexion.commit();
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				this.conexion.rollback();
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		} catch (SQLException e) {
			// TODO: handle exception			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

	
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
    	
    	try {
    		
    		this.conexion.setAutoCommit(false);
    		
        	String save = "INSERT INTO datos (nombre, descripcion, cantidad, categoria_id) VALUES (?, ?, ?, ?);";

			
			PreparedStatement prep = conexion.prepareStatement(save, PreparedStatement.RETURN_GENERATED_KEYS);
			
			
			prep.setString(1, producto.getNombre());
			prep.setString(2, producto.getDescripcion());
			prep.setInt(3, producto.getCantidad());
			prep.setInt(4, producto.getCategoriaId());
			
			prep.execute();

			final ResultSet keysProductos = prep.getGeneratedKeys();

			try (keysProductos) {
	        	
				while (keysProductos.next()) {
					producto.setId(keysProductos.getInt(1));
	        	}
				
				conexion.commit();
	        	
	        	System.out.println("Producto guardado: " + producto);
	        	
			} catch (SQLException e) {
				// TODO: handle exception	
				conexion.rollback();
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	

}
