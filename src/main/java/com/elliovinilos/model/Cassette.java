package com.elliovinilos.model;

public class Cassette extends Articulo {

	private int longitud_cinta;
	
	private int tipo_cinta;
	// tape type, tipo I, II, más¿?
	
	
	public int getLongitud_cinta() {
		return longitud_cinta;
	}

	public void setLongitud_cinta(int longitud_cinta) {
		this.longitud_cinta = longitud_cinta;
	}

	public int getTipo_cinta() {
		return tipo_cinta;
	}

	public void setTipo_cinta(int tipo_cinta) {
		this.tipo_cinta = tipo_cinta;
	}

	
	public Cassette(int id, String nombre, String artista, double precio, String descripcion, int unidades_stock, int longitud_cinta, int tipo_cinta) {
		super(id, nombre, artista, descripcion, precio, descripcion, unidades_stock);
		this.longitud_cinta = longitud_cinta;
		this.tipo_cinta = tipo_cinta;
	}
	
}
