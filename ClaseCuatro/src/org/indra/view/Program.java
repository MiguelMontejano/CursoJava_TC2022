package org.indra.view;

import org.indra.model.*;

public class Program {

	public static void main(String[] args) {

		System.out.println("Bienvenidos a la clase 4: Hoy vamos a ver un ejemplo del composite");
		
		FileSystemWatcher observer = new FileSystemWatcher();
		EntidadSistemaFicheros.registrarQuienMira(observer);
		
		//EntidadSistemaFicheros carpetaRaiz = new Carpeta("root"); -> Si lo hicisemos de este modo no tendriamos los metodos propios de las otras clases como piede ser por ejemplo el metodo addHijo de la clase carpeta
		System.out.println("Creando carpeta raiz...");
		Carpeta carpetaRaiz = new Carpeta("root");
		System.out.println("Creando carpeta temp...");
		Carpeta temp = new Carpeta("temp");
		System.out.println("Creando carpeta trash...");
		Carpeta trash = new Carpeta("trash");
		System.out.println("Creando archivo autoexec.bat con 100 bytes...");
		Archivo autoexec = new Archivo("autoexec.bat", 100);
		System.out.println("Creando archivo imagen.jpg vacio...");
		Archivo imagen = new Archivo("imagen.jpg");
		System.out.println("Cambiando el tamaño de imagen.jpg a 350 bytes...");
		imagen.setTamaño(350);//Puedo asignar tamaño de las ddos formas porque la forma en que hemos programado nos da flexiblidad
		
		System.out.println("Agregando temp a raiz...");
		carpetaRaiz.addHijo(temp);
		System.out.println("Agregando autoexec a temp...");
		temp.addHijo(autoexec);
		System.out.println("Agregando trash a temp...");
		temp.addHijo(trash);
		System.out.println("Agregando imagen a trash...");
		trash.addHijo(imagen);
		
		/*
		 * root
		 *   /temp
		 *   	autoexec.bat
		 *   	/trash
		 *   		imagen.jpg
		 */
				
		EntidadSistemaFicheros root = carpetaRaiz; //root y carpetaRaiz son lo mismo, en memoria lo que tengo es dos referencias que apuntan al mismo objeto, es decir hacer un cambio desde uno o de otro es lo mismo
		System.out.println("El tamaño total es " + root.calcularTamaño());
	}

}
