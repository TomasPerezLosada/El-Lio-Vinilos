package com.elliovinilos.model;

public class Vinilo extends Articulo {

	private int longitud_lp;
	
	private boolean paquete_original;
	// si el vinilo viene con solapa original o un slip blanco genérico.
	
	public int getLongitud_lp() {
		return longitud_lp;
	}

	public void setLongitud_lp(int longitud_lp) {
		this.longitud_lp = longitud_lp;
	}

	public boolean isPaquete_original() {
		return paquete_original;
	}

	public void setPaquete_original(boolean paquete_original) {
		this.paquete_original = paquete_original;
	}

	public Vinilo(int id, String nombre, String artista, String genero, double precio, String descripcion, int unidades_stock, int longitud_lp, boolean paquete_original) {
		super(id, nombre, artista, genero, precio, descripcion, unidades_stock);
		this.longitud_lp = longitud_lp;
		this.paquete_original = paquete_original;
	}

}
