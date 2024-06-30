package TAD_QuickSort;

import Entidad.Establecimiento;
import TAD_Establecimiento.ListaEnlazadaImplEstablecimiento;

public class MainPrueba {
    public static void main(String[] args) {
        // Crear una lista enlazada de establecimientos
        ListaEnlazadaImplEstablecimiento lista = new ListaEnlazadaImplEstablecimiento();
        
        // Insertar algunos establecimientos en la lista
        lista.insertar(new Establecimiento("20345", "soles", 200.00, "activo"));
        lista.insertar(new Establecimiento("80345", "dolares", 200.50, "desactivado"));
        lista.insertar(new Establecimiento("50987", "soles", 200.70, "activo"));
        lista.insertar(new Establecimiento("40876", "pesos", 200.80, "desactivado"));
        
        System.out.println("Lista antes de ordenar:");
        lista.mostrar();
        
        // Ordenar la lista usando QuickSort
        OrdenarListaImpl ordenador = new OrdenarListaImpl();
        ordenador.ordenar(lista);
        
        System.out.println("Lista después de ordenar:");
        lista.mostrar();
    }
}
