package org.indra.model;

//Esta clase es una clase abstracta, ya que no quiero instanciar objetos de este tipo, esta hecha para que la hereden
public abstract class EntidadSistemaFicheros {
	
	protected static IObserver miradoPor = null; //Esto es quien me mira
	//Con static hago que el atributo sea de la clase y no de los objetos
	//Cuando algo es privado se ve solo dentro de la clase, cuando es protected lo puedeo ver dentro de la clase y ademas dentro de las subclases 
	//asi el que me mira también puede verse en la carpeta y en el archivo
	
	public static void registrarQuienMira(IObserver obs) {
		miradoPor = obs;
	}
	
	private String nombre = null;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract int calcularTamaño(); //Este metodo no lo implementamos aquí, porque cada sublclase lo implementara de su forma, esto es lo que se llama polimorfismo, ponemos el metodo como abstract y ya esta
}
