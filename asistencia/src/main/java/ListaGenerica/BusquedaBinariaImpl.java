package ListaGenerica;

import Entidad.Establecimiento;

public class BusquedaBinariaImpl implements BusquedaBinaria {

	private ListaEnlazadaImpl<Establecimiento> lista;

	public BusquedaBinariaImpl(ListaEnlazadaImpl<Establecimiento> lista) {
		this.lista = lista;
	}

	private int length() {
		int length = 0;
		Nodo<Establecimiento> actual = lista.cabeza;
		while (actual != null) {
			length++;
			actual = actual.getSiguiente();
		}
		return length;
	}

	private Nodo<Establecimiento> getMiddle(Nodo<Establecimiento> inicio, int length) {
		Nodo<Establecimiento> actual = inicio;
		for (int i = 0; i < length / 2; i++) {
			actual = actual.getSiguiente();
		}
		return actual;
	}

	@Override
	public ListaEnlazadaImpl<Establecimiento> buscarPorRuc(String Ruc) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		int length = length();
		Nodo<Establecimiento> inicio = lista.cabeza;

		while (length > 0) {
			Nodo<Establecimiento> medio = getMiddle(inicio, length);
			int comparador = medio.getData().getRuc_Estab().compareTo(Ruc); //Data representa una instancia de la clase Establecimiento
			if (comparador == 0) {
				resultado.insertar(medio.getData());
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
	public ListaEnlazadaImpl<Establecimiento> buscarPorGiro(String Giro) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		int length = length();
		Nodo<Establecimiento> inicio = lista.cabeza;

		while (length > 0) {
			Nodo<Establecimiento> medio = getMiddle(inicio, length);
			int comparador = medio.getData().getGiro_Actividad().compareTo(Giro);
			if (comparador == 0) {
				resultado.insertar(medio.getData());
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
	public ListaEnlazadaImpl<Establecimiento> buscarPorArea(Double Area) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		int length = length();
		Nodo<Establecimiento> inicio = lista.cabeza;

		while (length > 0) {
			Nodo<Establecimiento> medio = getMiddle(inicio, length);
			int comparador = Double.compare(medio.getData().getArea_Estab(), Area);
			if (comparador == 0) {
				resultado.insertar(medio.getData());
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
	public ListaEnlazadaImpl<Establecimiento> buscarPorTipoLicencia(String TipoLicencia) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		int length = length();
		Nodo<Establecimiento> inicio = lista.cabeza;

		while (length > 0) {
			Nodo<Establecimiento> medio = getMiddle(inicio, length);
			int comparador = medio.getData().getTipo_Licencia().compareTo(TipoLicencia);
			if (comparador == 0) {
				resultado.insertar(medio.getData());
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
	public ListaEnlazadaImpl<Establecimiento> buscarPorCombinacion(String Ruc, String Giro, Double Area, String TipoLicencia) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		int length = length();
		Nodo<Establecimiento> inicio = lista.cabeza;

		while (length > 0) {
			Nodo<Establecimiento> medio = getMiddle(inicio, length);
			boolean coincide = true;
			if (Ruc != null && !medio.getData().getRuc_Estab().equals(Ruc)) {
				coincide = false;
			}
			if (Giro != null && !medio.getData().getGiro_Actividad().equals(Giro)) {
				coincide = false;
			}
			if (Area != null && medio.getData().getArea_Estab() != Area) {
				coincide = false;
			}
			if (TipoLicencia != null && !medio.getData().getTipo_Licencia().equals(TipoLicencia)) {
				coincide = false;
			}
			if (coincide) {
				resultado.insertar(medio.getData());
				break;
			}
			if ((Ruc != null && medio.getData().getRuc_Estab().compareTo(Ruc) < 0)
					|| (Giro != null && medio.getData().getGiro_Actividad().compareTo(Giro) < 0)
					|| (Area != null && medio.getData().getArea_Estab() < Area)
					|| (TipoLicencia != null && medio.getData().getTipo_Licencia().compareTo(TipoLicencia) < 0)) {
				inicio = medio.getSiguiente();
				length = length - length / 2 - 1;
			} else {
				length = length / 2;
			}
		}

		return resultado;
	}
}