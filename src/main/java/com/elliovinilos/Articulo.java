package com.elliovinilos;

public abstract class Articulo {

	private int id;
	
	private String nombre;
	
	private String artista;
	
	private int precio;
	
	private String descripcion;
	
	private int unidades_stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades_stock() {
		return unidades_stock;
	}

	public void setUnidades_stock(int unidades_stock) {
		this.unidades_stock = unidades_stock;
	}

	public Articulo(int id, String nombre, String artista, int precio, String descripcion, int unidades_stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.artista = artista;
		this.precio = precio;
		this.descripcion = descripcion;
		this.unidades_stock = unidades_stock;
	}

		
}
