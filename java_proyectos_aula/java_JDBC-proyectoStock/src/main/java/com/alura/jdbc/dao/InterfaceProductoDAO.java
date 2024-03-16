package com.alura.jdbc.dao;


import java.util.List;

import com.alura.jdbc.models.Producto;


// Interface que abstrae los métodos CRUD para ser implementados en la clase.
// indica los requisitos de las que clases que la implementarán


public interface InterfaceProductoDAO {
	
	public void guardar(Producto producto);
	
	public List<Producto> listar();
	
	public int modificar(Integer id, String nombre, String descripcion, Integer cantidad);
	
	public void eliminar(int idProducto);
	
	

}
