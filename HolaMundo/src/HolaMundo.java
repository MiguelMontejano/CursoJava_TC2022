
public class HolaMundo {
	/*
	 * Los niveles de visibilidad (public, private) tienen como objetivo
	 * proteger los métodos o los atributos para que desde fuera no se pueda acceder a ellos
	 * es un pilar fundamental para el encapsulamiento en programación
	 * 
	 * */

	/*
	 * El metodo main es bastante particular porque tiene el static,
	lo que hace que para invocarlo no haga falta instanciar un objeto de la clase,
	es decir no hace falta hacer un new HolaMundo para poder llamar al método 
	*
	*El codigo que generemos en Java se eecuta sobre una maquina emulada, no en nuestro propio ordenador,
	*para cada uno de los miles de tipos de dispositivos en los que se ejecuta java se ha fenerado una version
	*de la máquina de Java para que de esta manera de igual la arquitectura y Java se pueda ejecutar en millones
	*de dispositivos
	*
	*Si solo queremos ejecutar aplicaciones Java nos bajamos el JRE que es lo indispensable y por tanto pesa menos,
	*sin embargo si vamos a desarrollar aplicaciones java nos bajamos el JDK
	*
	*La diferencia en memoria de un tipo de dato por valor y otro por referencia es que por referencia es 
	*simplemente un puntero a una dirección de memoria, pero un tipo de dato por valor vive en una posición de memoria
	*asignada para el.
	*
	*Los tipos de datos primitivos viven en el Stack 
	*Las variables de tipo objeto ocupan siempre 4 bytes y se crean (cuando hacemos un new) en otro lugar de la memoria que se llama Heap
	*En el Heap se crean las instacias de la variable que son referenciadas desde el Stack, donde tengo las referencias o punteros a mis instancias
	*
	* */
	
	
	
	
	public static void main(String[] args) {
		//Tipos de datos primitivos
		//variables en camelCase en Java, hay que respetarlo 
		byte cortito = 2; //1 byte = 8 bits
		short corto = 2; //2 bytes
		int numero = 3; //4 bytes
		long largo = 55; //8 bytes
		double doblePrecision = 19.5;
		float flotante = 32;
		boolean booleano = true;
		char caracter = 'c';
		
		//Tipos de datos por referencia u objeto
		String cadena = "Hola";
		HolaMundo d = new HolaMundo(); //En este caso no tendria mucho sentido porque la clase no tiene metodos ni nada de momento
		
		//Java está completamente orientado a objetos
		Integer number = 3;
		cadena = null;
		
		System.out.println("Hola Mundo :D " + "Version 2");
		System.out.println(numero + 4);
		
		String cadenaEjemplo = "Cadena de Ejemplo";
		
		System.out.println("Longitud de mi cadena: " + cadenaEjemplo.length());
		System.out.println("Mi cadena en mayuscula es: " + cadenaEjemplo.toUpperCase());
		System.out.println("\" de\" esta en la posicion: " + cadenaEjemplo.indexOf(" de"));
		
		int a = 3;
		int b = 4;
		
		if(a > b) {
			System.out.println("a es mayor que b");
		} else if(b > a) {
			System.out.println("b es mayor que a");
		} else {
			System.out.println("a es igual que b");
		}
		
		int mayor = Math.max(a, b);
		
		int azar = (int) (Math.random() * 20);
		System.out.println(azar);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
		}
		
		System.out.println("");
		int i = 1;
		while (i <= 10) {
			System.out.print(i +",");
			i++;
		}
		
		System.out.println("");
		i = 1;
		do {
			System.out.print(i++ + ","); //esto se podria haber hecho en el resto pero lo hemos hecho en los dos sitios de manera diferente para ver ambas formas
		} while (i <= 10);
	}

}
