package indra.cursojava.clasedos;

import java.util.*;
import indra.utils.Consola;
import indra.utils.MetodosNumericos;

public class ClaseDos {
	
	
	public static void main(String[] args) {
		/*System.out.println("Bienvenidos a la segunda clase");
		
		String nombre = Consola.leerEntrada("Hola cual es tu nombre");
		
		String edad = Consola.leerEntrada("Cual es tu edad");
		
		if(MetodosNumericos.esNumero(edad)) {
			//System.out.println("Bienvenido " + nombre + edad);
			System.out.println(String.format("Bienvenido %s de %s", nombre, edad)); //Mas eficiente que el de arriba
		} else {
			System.out.println(String.format("Bienvenido %s. No entendi tu edad", nombre));
		} */
	
		//sacar numeor aleatorio y te da 5 oportunidades paraa adivinar el numero diciendo si el que ha pensado la maquina es mayor o menor
		/*System.out.println("Bienvenido al juego de la adivinanza, tienes 5 oportunidades para adivinar el numero que he oensado entre 1 y 100");
		System.out.println("Generando el numero...");
		
		int numeroAleatorio = MetodosNumericos.valorAlAzar(1, 100);
		
		int oportunidades = 5;
		boolean acertado = false;
		
		while(oportunidades > 0 && !acertado) {
			int numeroJugador = Consola.leerNumero("Dime un numero");
			
			if(numeroJugador == numeroAleatorio) {
				acertado = true;
				
			} else if(numeroJugador > numeroAleatorio) {
				System.out.println("No, el numero que he pensado es menor");
				oportunidades--;
			} else {
				System.out.println("No, el numero que he pensado es mayor");
				oportunidades--;
			}
		}
		
		if(acertado) {
			System.out.println("has acertado");
		} else {
			System.out.println(String.format("Lo siento, has perdido, el numero que habia pensado es %d", numeroAleatorio));
		}*/
		
		int primero = Consola.leerNumero("Ingresa el primer numero");
		int segundo = Consola.leerNumero("Ingresa el segundo numero");
		
		int operacion = Consola.leerNumero("1 es sumar, 2 es restar, 3 multiplicar y 4 dividir");
		
		/*switch (operacion) {
		case 1:
			System.out.println(primero + segundo);
			break;
		case 2:
			System.out.println(primero - segundo);
			break;
		case 3:
			System.out.println(primero * segundo);
			break;
		case 4:
			System.out.println(primero / segundo);
			break;
		default:
            System.out.println("no coincide");
		}*/
		
		int resultado = switch (operacion) {
		case 1 -> primero + segundo;
		case 2 -> primero - segundo;
		case 3 -> primero * segundo;
		case 4 -> primero / segundo;
		default -> 0;
		};
		
		System.out.println(resultado);
		
		//Programa que inicializa un arreglo de nombres y lo muestra por pantalla
		String[] array = {"juan", "pepe", "arturo", "miguel"};
		
		/*for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");
		}*/
		
		for(String n:array) System.out.print(n + " - ");
		
		/*int longitud = Consola.leerNumero("Cuantos elementos quieres");
		
		int[] arrayNumeros = new int[longitud];
		
		for(int i = 0; i < longitud; i++) {
			arrayNumeros[i] = Consola.leerNumero("ingresa el numero " + i);
		}
		
		int maximo, minimo;
		maximo = arrayNumeros[0];
		minimo = arrayNumeros[0];
		double suma = 0.0;
		for(int i:arrayNumeros) {	
			if(i > maximo) {
				maximo = i;
			}
			
			if(i < maximo) {
				minimo = i;
			}
			
			suma += i;
		}
		System.out.println(maximo);
		System.out.println(minimo);
		System.out.println(suma/longitud);*/
		
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		String nombreAñadir = Consola.leerEntrada("Ingresa un nombre o teclea fin");
		
		while(!nombreAñadir.equals("fin")) {
			System.out.println(nombreAñadir);
			nombres.add(nombreAñadir);
			nombreAñadir = Consola.leerEntrada("Ingresa un nombre o teclea fin");

			
		}
		
		for(String n:nombres) {
			
			String nombreAlReves = new StringBuilder(n).reverse().toString();
			
			System.out.print(n + " - " + n.length() + " - " + nombreAlReves);
			System.out.println();
		}
		
		//Nueva forma en Java, parecida a javascript y muy usada en la actualidad
		nombres.forEach(n -> {
			String nombreAlReves = new StringBuilder(n).reverse().toString();
			
			System.out.print(n + " - " + n.length() + " - " + nombreAlReves);
			System.out.println();
		});
		
		//Septimo ejercicio
		/*String a = "string 1";
		String b = "string 2";
		String c = "string 3";
		
		String res = a+b+c;
		System.out.println(res);*/
		
		//es mas eficiente, a partir de mas de 4 strings, en este caso essolo de ejemplo pero lo mas eficiente es...
		StringBuilder builder = new StringBuilder();
		
		builder.append("String 1");
		builder.append("String 2");
		builder.append("String 3");
		
		String res = builder.toString();
		
		System.out.println(res);

	}

}
