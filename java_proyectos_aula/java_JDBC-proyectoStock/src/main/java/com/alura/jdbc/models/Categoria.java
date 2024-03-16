package com.alura.jdbc.models;

import java.util.ArrayList;
import java.util.List;

// Representa la Categoria

public class Categoria {
	
	private String nombre;
	private int id;
	private List<Producto> productos = new ArrayList<>();
	
	
	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void agregarProductos(Producto producto) {
		// TODO Auto-generated method stub
		this.productos.add(producto);
	}
	public List<Producto> getProductos() {
		return this.productos;
	}
	

	
	@Override
	public String toString() {
		return String.format("ID: %d, Categoria: %s", this.id, this.nombre);
	}

}
