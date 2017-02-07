package epn;

import java.util.StringTokenizer;

public class NodoA {

	private Alumno element;
	private NodoA next;
	
	public NodoA() {
		
	}

	public NodoA(Alumno element, NodoA next) {
		super();
		this.element = element;
		this.next = next;
	}

	public Alumno getElement() {
		return element;
	}

	public void setElement(Alumno element) {
		this.element = element;
	}

	public NodoA getNext() {
		return next;
	}

	public void setNext(NodoA next) {
		this.next = next;
	}

}
