package TAD_Establecimiento;

import Entidad.Establecimiento;

public class ListaEnlazadaImplEstablecimiento implements ListaInterfaceEstablecimiento {

	public NodoEstablecimiento cabeza;

	public ListaEnlazadaImplEstablecimiento() {
		this.cabeza = null;
	}

	@Override
	public void insertar(Establecimiento establecimiento) {
		NodoEstablecimiento nuevoNodo = new NodoEstablecimiento(establecimiento);
		if (cabeza == null) {
			cabeza = nuevoNodo;
		} else {
			NodoEstablecimiento actual = cabeza;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevoNodo);
		}
	}

	@Override
	public boolean eliminar(String Ruc_Estab) {
		if (cabeza == null) {
			return false;
		}
		if (cabeza.getEstablecimiento().getRuc_Estab().equals(Ruc_Estab)) {
			cabeza = cabeza.getSiguiente();
			return true;
		}
		NodoEstablecimiento actual = cabeza;
		while (actual.getSiguiente() != null) {
			if (actual.getSiguiente().getEstablecimiento().getRuc_Estab().equals(Ruc_Estab)) {
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				return true;
			}
			actual = actual.getSiguiente();
		}
		return false;
	}

	@Override
	public Establecimiento buscar(String Ruc_Estab) {
		NodoEstablecimiento actual = cabeza;
		while (actual != null) {
			if (actual.getEstablecimiento().getRuc_Estab().equals(Ruc_Estab)) {
				return actual.getEstablecimiento();
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	@Override
	public void mostrar() {
		NodoEstablecimiento actual = cabeza;
		while (actual != null) {
			Establecimiento establecimiento = actual.getEstablecimiento();
			System.out.println("RUC: " + establecimiento.getRuc_Estab() + ", Giro: "
					+ establecimiento.getGiro_Actividad() + ", Área: " + establecimiento.getArea_Estab()
					+ ", Licencia: " + establecimiento.getTipo_Licencia());
			actual = actual.getSiguiente();
		}
	}

	@Override
	public boolean estaVacia() {
		return cabeza == null;
	}

	public NodoEstablecimiento getCabeza() {
		return cabeza;
	}

	public void setCabeza(NodoEstablecimiento cabeza) {
		this.cabeza = cabeza;
	}
}