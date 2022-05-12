package org.indra.model;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends EntidadSistemaFicheros {
	
	public Carpeta(String nombre) {
		super(nombre);
		if(miradoPor != null) miradoPor.notificar("Creando carpeta " + nombre);
	}

	private List<EntidadSistemaFicheros> hijos = new ArrayList<EntidadSistemaFicheros>(); //Una carpeta puede contener ficheros u otras carpetas
	
	public void addHijo(EntidadSistemaFicheros hijo) {
		if (!hijos.contains(hijo)) { //validamos que no este ya añadido antes de agregarlo
			if(miradoPor != null) miradoPor.notificar("Agregando " + hijo.getNombre() + " a la carpeta " + this.getNombre());
			this.hijos.add(hijo);	
			
		}
	}

	@Override
	public int calcularTamaño() {
		int tamaño = 0;
		for(EntidadSistemaFicheros hijo : hijos) {
			tamaño += hijo.calcularTamaño();
		}
		return tamaño;
	}
	
}
