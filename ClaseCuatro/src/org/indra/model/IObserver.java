package org.indra.model;

//Este lo unico que quiere es que le notifiquen cuando haya cambios, es un observador
public interface IObserver {
	void notificar(Object cambio); //Ponemos el tipo object como argumento para que me puedan pasar lo que sea, asi es un método muy genérico
		
}

/*
 * El que va a notificar va a ser la vista (Program) y los que van a ser observados van a ser los objetos dle tipo EntidadSistemaFicheros
 */
