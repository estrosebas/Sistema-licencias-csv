package ListaGenerica;

public class Nodo<T> {
	private T data; //Data representa el objeto almacenado en el nodo actual de la lista enlazada.
	private Nodo<T> siguiente;

	public Nodo(T data) {
		this.data = data;
		this.siguiente = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
}