package ListaGenerica;

import Entidad.Establecimiento;

public class BusquedaLinealImpl<T> implements BusquedaLineal {

	private ListaEnlazadaImpl<Establecimiento> lista;

	public BusquedaLinealImpl(ListaEnlazadaImpl<Establecimiento> lista) {
		this.lista = lista;
	}

	@Override
	public ListaEnlazadaImpl<Establecimiento> buscarPorGiro(String giroActividad) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		Nodo<Establecimiento> actual = lista.cabeza;

		while (actual != null) {
			Establecimiento data = actual.getData(); //Data representa una instancia de la clase Establecimiento
			if (data.getGiro_Actividad().equals(giroActividad)) {
				resultado.insertar(data);
			}
			actual = actual.getSiguiente();
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImpl<Establecimiento> buscarPorArea(Double area) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		Nodo<Establecimiento> actual = lista.cabeza;

		while (actual != null) {
			Establecimiento data = actual.getData();
			if (data.getArea_Estab().equals(area)) {
				resultado.insertar(data);
			}
			actual = actual.getSiguiente();
		}

		return resultado;
	}

	@Override
	public ListaEnlazadaImpl<Establecimiento> buscarPorTipoLicencia(String tipoLicencia) {
		ListaEnlazadaImpl<Establecimiento> resultado = new ListaEnlazadaImpl<>();
		Nodo<Establecimiento> actual = lista.cabeza;

		while (actual != null) {
			Establecimiento data = actual.getData();
			if (data.getTipo_Licencia().equals(tipoLicencia)) {
				resultado.insertar(data);
			}
			actual = actual.getSiguiente();
		}

		return resultado;
	}
}