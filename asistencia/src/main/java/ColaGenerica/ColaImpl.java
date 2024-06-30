package ColaGenerica;

import ListaGenerica.Nodo;

public class ColaImpl<T> implements ColaInterface<T> {
	private Nodo<T> frente;
	private Nodo<T> fin;

	public ColaImpl() {
		this.frente = null;
		this.fin = null;
	}

	@Override
	public void encolar(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<>(elemento);
		if (estaVacia()) {
			frente = nuevoNodo;
			fin = nuevoNodo;
		} else {
			fin.setSiguiente(nuevoNodo);
			fin = nuevoNodo;
		}
	}

	@Override
	public T desencolar() {
		if (estaVacia()) {
			System.out.println("La cola está vacía, no se puede desencolar.");
			return null;
		}
		T elemento = frente.getData();
		frente = frente.getSiguiente();
		if (frente == null) {
			fin = null;
		}
		return elemento;
	}

	@Override
	public T frente() {
		if (estaVacia()) {
			System.out.println("La cola está vacía, no hay frente.");
			return null;
		}
		return frente.getData();
	}

	@Override
	public boolean estaVacia() {
		return frente == null;
	}

	@Override
	public void mostrar() {
		if (estaVacia()) {
			System.out.println("La cola está vacía.");
			return;
		}
		Nodo<T> actual = frente;
		while (actual != null) {
			System.out.println(actual.getData());
			actual = actual.getSiguiente();
		}
	}
}