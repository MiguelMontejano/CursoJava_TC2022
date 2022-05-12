package indra.banco.models;

import java.time.LocalDate;

public class Cliente extends Entidad { //La clase cliente hereda directamente de java.lang.object, como todos los objetos, por lo que tienen heredado el m�todo toString
	//atributos
	private String apellido;
	private LocalDate fechaNacimiento;
	
	//getters y setters
	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento) {
		super(nombre);
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//otros metodos
	//La redefinici�n de un m�todo existente se llama Override o sobrecarga, y que un m�todo tenga diferentes comportamientos segun el objeto es polimorfismo
	@Override
	public String toString() {
		return String.format("Hola soy %s %s y nac� el %s", this.getNombre(), apellido, fechaNacimiento); //el this.getNombre() es porque el metodo es privado en la entidad y tengo que acceder asi
		
	}
	
}
