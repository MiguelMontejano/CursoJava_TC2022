package indra.banco;

import java.time.LocalDate;
import java.util.Scanner;

import indra.banco.models.Banco;
import indra.banco.models.Cliente;
import indra.banco.models.Cuenta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			/*
			//Agrupamos las variables en el concepto del cliente
			Cliente cliente = new Cliente();
			
			System.out.println("Introduzca su nombre");
			cliente.setNombre(sc.nextLine());
			
			System.out.println("Introduzca su apellido");
			cliente.setApellido(sc.nextLine());
			
			System.out.println("Ingrese su fecha de nacimiento en el formato YYYY-MM-DD");
			cliente.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
			
			System.out.println(cliente);*/
			Banco banco = new Banco();
			
			System.out.println("Introduzca su nombre");
			String nombre = sc.nextLine();
			
			System.out.println("Introduzca su apellido");
			String apellido = sc.nextLine();
			
			System.out.println("Ingrese su fecha de nacimiento en el formato YYYY-MM-DD");
			LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
			
			Cliente cliente = new Cliente(nombre, apellido, fechaNacimiento);
			banco.registrarNuevoCliente(cliente);
			
			Cuenta cuenta = banco.abrirCuentaNueva(cliente);
			cuenta.depositar(1000);
			
			System.out.println(cliente);
			
		} 
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}

/*
 * Una clase e suna plantilla para crear varios objetos.
 * Una clase es un conjunto de métodos y atributos mientras que un objeto es una instancia de una clase
 * Los objetos que tienen que ver con el problema que estamos resolviendo son objetos de negocio u objetos del dominio del problema
 * Es importante por estos objetos de negocio ponernos de acuerdo con la terminología, en un banco hablaremos de clientes, facturas...
 * Cuando bajamos la problemática a un problema de ordenador nos apareceran otros objetos que se denominan objetos técnicos,
 * aquí están objetos como los sockets, los buffers, objetos de la interfaz de usuario...
 * */