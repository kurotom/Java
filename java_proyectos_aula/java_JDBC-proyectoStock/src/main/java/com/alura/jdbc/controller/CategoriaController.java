package com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import com.alura.jdbc.conexion.ConexionDB;
import com.alura.jdbc.dao.CategoryDAO;
import com.alura.jdbc.models.Categoria;

//import com.alura.jdbc.models.Producto;
//import java.util.ArrayList;


public class CategoriaController {
	
	private CategoryDAO categoriaDAO;

	public CategoriaController() {
		ConexionDB connect = new ConexionDB();
		Connection con = connect.getConnection();
		this.categoriaDAO = new CategoryDAO(con);
	}
	

	public int catID(String categoria) {
		return this.categoriaDAO.getCatID(categoria);
	}
	
	public Categoria obtenerCategoria(int id) {
		return this.categoriaDAO.obtenerCategoria(id);
	}
	
	
	

	public List<Categoria> listar() {
		// TODO
		return this.categoriaDAO.listar();
	}

    public List<Categoria> cargaReporte() {
        // TODO
        return this.categoriaDAO.listarProductos();
    }

}
