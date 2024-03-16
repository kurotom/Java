package com.alura.jdbc.models;



// Se encarga de representar cada item producto

public class Producto {
	
	private String nombre;
	private String descripcion;
	private int cantidad;
	private Categoria categoria;
	private int id;
	
	
//	Constructor con sobre-carga
	public Producto(String nombre, String descripcion, int cantidad, Categoria categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;	
		this.categoria = categoria;
	}
	
	public Producto(int id, String nombre, String descripcion, int cantidad, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}
	
	public Producto(Integer id, String nombre, Integer cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
//
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCategoriaId() {
		return this.categoria.getId();
	}

	public String getCategoria() {
		return this.categoria.getNombre();
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return String.format("Id: %d, Nombre: %s, Descripcion: %s, Cantidad: %d, Categoria: %s", this.id, this.nombre, this.descripcion, this.cantidad, this.categoria.getNombre());
	}
}
