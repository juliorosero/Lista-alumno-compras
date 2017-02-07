package epn;

public class Alumno {

	private String nombre;
	private String cedula;

	public Alumno() {

	}

	public Alumno(String nombre, String cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Alumno [nombre: " + nombre + ", cedula: " + cedula + "]";
	}

}
