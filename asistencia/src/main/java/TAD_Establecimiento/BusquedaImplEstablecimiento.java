package TAD_Establecimiento;

public class BusquedaImplEstablecimiento implements BusquedaBinariaEstablecimiento {

	private ListaEnlazadaImplEstablecimiento lista;

	public BusquedaImplEstablecimiento(ListaEnlazadaImplEstablecimiento lista) {
		this.lista = lista;
	}

	private int length() { // Para obtener el tamaño de la lista
		int length = 0;
		NodoEstablecimiento actual = lista.cabeza;
		while (actual != null) {
			length++;
			actual = actual.getSiguiente();
		}
		return length;
	}

	private NodoEstablecimiento getMiddle(NodoEstablecimiento inicio, int length) { // Para obtener el nodo que
																					// subdivide a la mitad
		NodoEstablecimiento actual = inicio;
		for (int i = 0; i < length / 2; i++) {
			actual = actual.getSiguiente();
		}
		return actual;
	}

	@Override
	public ListaEnlazadaImplEstablecimiento buscarPorRuc(String Ruc) {
		ListaEnlazadaImplEstablecimiento resultado = new ListaEnlazadaImplEstablecimiento();
		int length = length();
		NodoEstablecimiento inicio = lista.cabeza;

		while (length > 0) {
			NodoEstablecimiento medio = getMiddle(inicio, length);
			int comparador = medio.getEstablecimiento().getRuc_Estab().compareTo(Ruc);
			if (comparador == 0) {
				resultado.insertar(medio.getEstablecimiento());
				break;
			} else if (comparador < 0) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImplEstablecimiento buscarPorGiro(String Giro) {
		ListaEnlazadaImplEstablecimiento resultado = new ListaEnlazadaImplEstablecimiento();
		int length = length();
		NodoEstablecimiento inicio = lista.cabeza;

		while (length > 0) {
			NodoEstablecimiento medio = getMiddle(inicio, length);
			int comparador = medio.getEstablecimiento().getGiro_Actividad().compareTo(Giro);
			if (comparador == 0) {
				resultado.insertar(medio.getEstablecimiento());
				break;
			} else if (comparador < 0) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImplEstablecimiento buscarPorArea(Double Area) {
		ListaEnlazadaImplEstablecimiento resultado = new ListaEnlazadaImplEstablecimiento();
		int length = length();
		NodoEstablecimiento inicio = lista.cabeza;

		while (length > 0) {
			NodoEstablecimiento medio = getMiddle(inicio, length);
			int comparador = Double.compare(medio.getEstablecimiento().getArea_Estab(), Area);
			if (comparador == 0) {
				resultado.insertar(medio.getEstablecimiento());
				break;
			} else if (comparador < 0) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImplEstablecimiento buscarPorTipoLicencia(String TipoLicencia) {
		ListaEnlazadaImplEstablecimiento resultado = new ListaEnlazadaImplEstablecimiento();
		int length = length();
		NodoEstablecimiento inicio = lista.cabeza;

		while (length > 0) {
			NodoEstablecimiento medio = getMiddle(inicio, length);
			int comparador = medio.getEstablecimiento().getTipo_Licencia().compareTo(TipoLicencia);
			if (comparador == 0) {
				resultado.insertar(medio.getEstablecimiento());
				break;
			} else if (comparador < 0) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImplEstablecimiento buscarPorCombinacion(String Ruc, String Giro, int Area,
			String TipoLicencia) {
		ListaEnlazadaImplEstablecimiento resultado = new ListaEnlazadaImplEstablecimiento();
		int length = length();
		NodoEstablecimiento inicio = lista.cabeza;

		while (length > 0) {
			NodoEstablecimiento medio = getMiddle(inicio, length);
			boolean coincide = true;
			if (Ruc != null && !medio.getEstablecimiento().getRuc_Estab().equals(Ruc)) {
				coincide = false;
			}
			if (Giro != null && !medio.getEstablecimiento().getGiro_Actividad().equals(Giro)) {
				coincide = false;
			}
			if (Area != -1 && medio.getEstablecimiento().getArea_Estab() != Area) {
				coincide = false;
			}
			if (TipoLicencia != null && !medio.getEstablecimiento().getTipo_Licencia().equals(TipoLicencia)) {
				coincide = false;
			}
			if (coincide) {
				resultado.insertar(medio.getEstablecimiento());
				break;
			}
			if (Ruc != null && medio.getEstablecimiento().getRuc_Estab().compareTo(Ruc) < 0
					|| Giro != null && medio.getEstablecimiento().getGiro_Actividad().compareTo(Giro) < 0
					|| Area != -1 && medio.getEstablecimiento().getArea_Estab() < Area || TipoLicencia != null
							&& medio.getEstablecimiento().getTipo_Licencia().compareTo(TipoLicencia) < 0) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}
}