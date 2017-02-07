package epn;

public class NodoC {
	private String compras;
	private NodoC siguiente;

	public NodoC() {
		super();
		this.compras = "";
		this.siguiente = null;

	}

	public String getCompras() {
		return compras;
	}

	public void setCompras(String compras) {
		this.compras = compras;
	}

	public NodoC getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoC siguiente) {
		this.siguiente = siguiente;
	}


}
