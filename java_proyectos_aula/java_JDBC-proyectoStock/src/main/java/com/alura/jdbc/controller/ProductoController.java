package com.alura.jdbc.controller;

//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;

import java.util.List;

import com.alura.jdbc.conexion.ConexionDB;
import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.models.Producto;



public class ProductoController {
	
// Para cada uso del pool se debe instanciar y obtener la conexion, crear las sentencias, procesarlas y cerrar la conexion.
// Para hacer esto automáticamente, se debe crear la clase que maneja el pool de conxion se debe implementar "AutoCloseable"
// permitiendo usar try-catch con recursos, al igual que los ResultSet.

// Utilizar "commit" manual para realizar las transacciones exitosas y permitir hacer "rollback" en caso de error.
//	Deshabilitar "auto-commit".
	
//	importa y usa clase ProductoDAO, crea un nuevo objeto y le entrega la conexión única disponible
	
	
	private ProductoDAO productoDAO;
	
	public ProductoController() {
		ConexionDB conexion = new ConexionDB();
		this.productoDAO = new ProductoDAO(conexion.getConnection());
	}

	
	public int modificar(Integer id, String nombre, String descripcion, Integer cantidad) {
		// TODO
		return this.productoDAO.modificar(id, nombre, descripcion, cantidad);
	}

	
	public void eliminar(Integer id) {
		// TODO
		this.productoDAO.eliminar(id);
	}

	
	public List<Producto> listar() {
		// TODO
		return this.productoDAO.listar();
	}

	
    public void guardar(Producto producto) {
		// TODO
    	this.productoDAO.guardar(producto);
	}

}
