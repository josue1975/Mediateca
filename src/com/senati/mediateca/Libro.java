package com.senati.mediateca;

public class Libro extends Soporte{
	//Para heredar atributos de una clase superior
	//Extends Superclase
	int nropag;
	int nroidbn;
	
	//COnstructores llenos
	public Libro(int id, String titulo, String autor, float precio, int nropag, int nroidbn) {
		super(id, titulo, autor, precio);
		this.nropag = nropag;
		this.nroidbn = nroidbn;
	}
	//Constructores vacios
	public Libro(int id, String titulo, String autor, float precio) {
		super(id, titulo, autor, precio);
	}
	
	
	public int getNropag() {
		return nropag;
	}
	public void setNropag(int nropag) {
		this.nropag = nropag;
	}
	public int getNroidbn() {
		return nroidbn;
	}
	public void setNroidbn(int nroidbn) {
		this.nroidbn = nroidbn;
	}
	
	@Override
	public String toString() {
		return "Libro [nropag=" + nropag + ", nroidbn=" + nroidbn + ", id=" + id + ", titulo=" + titulo + ", autor="
				+ autor + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	
}
