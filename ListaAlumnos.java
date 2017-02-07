package epn;

public class ListaAlumnos {

	protected NodoA inicio;
	private int tamanio;

	public boolean estaVacia() {
		return inicio == null && tamanio == 0;
	}

	public void AgregarAlumno(Alumno a) {
		NodoA Q = new NodoA();
		if (BuscarAlumno(a.getCedula()) == null) {
			Q.setElement(a);
			Q.setNext(inicio);
			inicio = Q;
			tamanio++;
		} else {
			System.out.println("Alumno ya registrado\n");
		}
	}

	public Alumno BuscarAlumno(String cedula) {
		if (!estaVacia()) {
			NodoA Q = inicio;
			Q = inicio.getNext();
			while (Q != null) {
				if (cedula.equals(Q.getElement().getCedula())) {
					return Q.getElement();
				}
				Q = Q.getNext();
			}
			return null;
		}
		return null;
	}

	public String toString() {
		NodoA Q;
		String salida = "";
		Q = this.inicio;
		while (Q != null) {
			salida += Q.getElement().toString() + "\n";
			Q = Q.getNext();
		}
		return salida;
	}

}
