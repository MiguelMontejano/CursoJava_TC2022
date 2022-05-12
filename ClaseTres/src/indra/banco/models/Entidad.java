package indra.banco.models;

//una clase abstracta no se puede instanciar que es lo que queremos ya que no tiene sentido instanciar Entidades, sino clientes y Empresas
public abstract class Entidad { //cosas en comun entre empresas y clientes, tanto uno como otro son entidades, en nuestro caso es el nombre
	private String nombre;

	public Entidad(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
		
}
