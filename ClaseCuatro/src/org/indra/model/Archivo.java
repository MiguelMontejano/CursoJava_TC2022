package org.indra.model;

public class Archivo extends EntidadSistemaFicheros {

	private int tama�o;
	
	public Archivo(String nombre, int tama�o) {
		super(nombre);
		this.tama�o = tama�o;
		if(miradoPor != null) miradoPor.notificar("Creando archivo con nombre " + nombre + " de tama�o " + tama�o);
	}
	
	public Archivo(String nombre) { //sobrecarga de constructores
		super(nombre);
		this.tama�o = 0;
		if(miradoPor != null) miradoPor.notificar("Creando archivo vacio con nombre " + nombre);
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public int calcularTama�o() {
		return tama�o;
	}

}
