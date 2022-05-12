package indra.banco.models;

public class Cuenta {
	private String iban;

	private Entidad titular;
	
	private double saldo = 0;
	
	//getters y setters
	public double getSaldo() {
		return saldo;
	}
	
	public String getIban() {
		return iban;
	}

	public Entidad getTitular() {
		return titular;
	}

	//constructores
	public Cuenta(String iban, Entidad titular) {
		super();
		this.iban = iban;
		this.titular = titular;
	}
	
	//metodos
	public void depositar(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void retirar(double cantidad) throws Exception {
		if(cantidad > saldo) {
			throw new Exception("No hay saldo suficiente en la cuenta");
		}
		
		this.saldo -= cantidad;
	}
	
}
