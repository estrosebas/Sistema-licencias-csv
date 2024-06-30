package TAD_Establecimiento;

import ListaGenerica.ListaEnlazadaImpl;
import Entidad.Establecimiento;
import ListaGenerica.Nodo;

public class BusquedaImplLinealEstablecimiento {

    private ListaEnlazadaImpl<Establecimiento> lista;

    public BusquedaImplLinealEstablecimiento(ListaEnlazadaImpl<Establecimiento> lista) {
        this.lista = lista;
    }

    public ListaEnlazadaImpl<Establecimiento> buscarPorGiro(String giroActividad) {
        ListaEnlazadaImpl<Establecimiento> resultados = new ListaEnlazadaImpl<>();
        Nodo<Establecimiento> actual = lista.cabeza;
        while (actual != null) {
            if (actual.getData().getGiro_Actividad().equalsIgnoreCase(giroActividad)) {
                resultados.insertar(actual.getData());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }

    public ListaEnlazadaImpl<Establecimiento> buscarPorArea(Double area) {
        ListaEnlazadaImpl<Establecimiento> resultados = new ListaEnlazadaImpl<>();
        Nodo<Establecimiento> actual = lista.cabeza;
        while (actual != null) {
            if (actual.getData().getArea_Estab().equals(area)) {
                resultados.insertar(actual.getData());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }

    public ListaEnlazadaImpl<Establecimiento> buscarPorTipoLicencia(String tipoLicencia) {
        ListaEnlazadaImpl<Establecimiento> resultados = new ListaEnlazadaImpl<>();
        Nodo<Establecimiento> actual = lista.cabeza;
        while (actual != null) {
            if (actual.getData().getTipo_Licencia().equalsIgnoreCase(tipoLicencia)) {
                resultados.insertar(actual.getData());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }
}
