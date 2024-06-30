package TAD_Establecimiento;

import Entidad.Establecimiento;

public class NodoEstablecimiento {
	
	private Establecimiento establecimiento;
	private NodoEstablecimiento siguiente;

	public NodoEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
		this.siguiente = null;
	}

	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public NodoEstablecimiento getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoEstablecimiento siguiente) {
		this.siguiente = siguiente;
	}
}

