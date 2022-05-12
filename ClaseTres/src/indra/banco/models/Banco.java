package indra.banco.models;

import java.util.*;

public class Banco {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void registrarNuevoCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public Cuenta abrirCuentaNueva(Cliente c) throws Exception { //abre una cuenta nueva y la devuelve
		if(!this.clientes.contains(c)) {
			throw new Exception(c + " no está registrado en el banco y no puede abrir una cuenta");
		}
		
		Cuenta nueva = new Cuenta(generarIbanNuevo(), c);
		this.cuentas.add(nueva);
		
		return nueva;
	}

	private String generarIbanNuevo() {
		//Como no tenemos lógica para generar un iban nuevo por el momento generamos uno aleatorio
		//return Integer.valueOf(((int) Math.abs(Math.round(Math.random()) * 1000000))).toString(); //usamos integer en vez de el tipo primitivo que es int porque queremos usar el toString, que es un metodo propio de objetos
		return UUID.randomUUID().toString();
	}
}
