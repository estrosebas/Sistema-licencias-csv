package TAD_QuickSort;

import TAD_Establecimiento.*;
import Entidad.Establecimiento;

public class OrdenarListaImpl implements OrdenarListaInterface {

	@Override
	public void ordenar(ListaEnlazadaImplEstablecimiento lista) {
		NodoEstablecimiento cabeza = lista.getCabeza();
		lista.setCabeza(quickSort(cabeza, obtenerUltimoNodo(cabeza)));
	}

	private NodoEstablecimiento quickSort(NodoEstablecimiento inicio, NodoEstablecimiento fin) {
		if (inicio == null || inicio == fin) {
			return inicio;
		}

		NodoEstablecimiento pivotPrevio = particion(inicio, fin);
		NodoEstablecimiento nuevoInicio = inicio;
		NodoEstablecimiento nuevoFin = fin;

		if (pivotPrevio != null && pivotPrevio != inicio) {
			NodoEstablecimiento temp = pivotPrevio;
			while (temp.getSiguiente() != null && temp.getSiguiente() != fin) {
				temp = temp.getSiguiente();
			}
			temp.setSiguiente(null);
			nuevoInicio = quickSort(inicio, pivotPrevio);
			temp.setSiguiente(fin);
		}

		if (pivotPrevio == null || pivotPrevio.getSiguiente() != null) {
			nuevoFin = quickSort(pivotPrevio == null ? inicio : pivotPrevio.getSiguiente(), fin);
		}

		return nuevoInicio;
	}

	private NodoEstablecimiento particion(NodoEstablecimiento inicio, NodoEstablecimiento fin) {
		Establecimiento pivot = fin.getEstablecimiento();
		NodoEstablecimiento i = inicio;
		NodoEstablecimiento j = inicio;
		NodoEstablecimiento prev = null;

		while (j != fin) {
			if (j.getEstablecimiento().getRuc_Estab().compareTo(pivot.getRuc_Estab()) < 0) {
				// Intercambiar i y j
				Establecimiento temp = i.getEstablecimiento();
				i.setEstablecimiento(j.getEstablecimiento());
				j.setEstablecimiento(temp);
				prev = i;
				i = i.getSiguiente();
			}
			j = j.getSiguiente();
		}

		// Intercambiar i y fin (pivot)
		Establecimiento temp = i.getEstablecimiento();
		i.setEstablecimiento(fin.getEstablecimiento());
		fin.setEstablecimiento(temp);

		return prev;
	}

	private NodoEstablecimiento obtenerUltimoNodo(NodoEstablecimiento nodo) {
		while (nodo != null && nodo.getSiguiente() != null) {
			nodo = nodo.getSiguiente();
		}
		return nodo;
	}
}