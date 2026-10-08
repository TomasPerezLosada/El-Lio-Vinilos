package com.elliovinilos.model;

public class Articulo {

	private int codigo;
	
	private String nombre;
	
	private String artista;
	
	private String genero;
	
	private double precio;
	
	private String descripcion;
	
	private int unidades_stock;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
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

	public Articulo(int codigo, String nombre, String artista, String genero, double precio, String descripcion, int unidades_stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.artista = artista;
		this.genero = genero;
		this.precio = precio;
		this.descripcion = descripcion;
		this.unidades_stock = unidades_stock;
	}
	
	// Constructor adicional sólo con datos básicos para adecuarse a consigna actual;
	
	public Articulo(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", artista=" + artista + ", genero=" + genero + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", unidades_stock=" + unidades_stock + "]";
	}

		
}
