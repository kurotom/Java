package com.alura.jdbc.dao;

import java.util.List;

import com.alura.jdbc.models.Categoria;



public interface InterfaceCategorias {
	
	public List<Categoria> listar();

	public int getCatID(String nombre);
	
	public Categoria obtenerCategoria(int id);

}
