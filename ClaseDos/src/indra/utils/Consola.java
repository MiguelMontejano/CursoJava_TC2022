package indra.utils;

import java.util.Scanner;

public class Consola {

	public static String leerEntrada (String titulo) {
		System.out.println(titulo);
		
		Scanner teclado = new Scanner(System.in);
		try {
			String entrada = teclado.nextLine();

			while(entrada.isEmpty() || MetodosNumericos.esNumero(entrada)) {
				System.out.println("Ingresa de nuevo");
				entrada = teclado.nextLine();
			}			
			
			return entrada;
		} finally {
			//teclado.close(); ESTO DA ERROR
		}

	}
	
	public static int leerNumero (String titulo) {
		   System.out.println(titulo); 
		   Scanner teclado = new Scanner(System.in);
		   String numero = teclado.nextLine();
		    
		   while(numero.isEmpty() || !MetodosNumericos.esNumero(numero)){
		       System.out.println("Por favor, ingresa un valor numérico");
		       numero = teclado.nextLine();
		   }
		   
		   //teclado.close();
		   return Integer.parseInt(numero);
	}
}
