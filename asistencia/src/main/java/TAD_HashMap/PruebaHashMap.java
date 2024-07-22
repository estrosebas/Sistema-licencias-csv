/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TAD_HashMap;

/**
 *
 * @author Sebastian
 */
import Entidad.Establecimiento;
import ListaGenerica.*;
import TAD_Establecimiento.CargadorEstablecimientos;
import java.util.Set;

public class PruebaHashMap {
    public static void main(String[] args) {
        // Crear una lista enlazada de establecimientos
        ListaEnlazadaImpl<Establecimiento> lista = new ListaEnlazadaImpl<>();
        
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV("licencias.csv");
        // Crear un HashMap dinámico
        HashMapInterface<String, Establecimiento> hashMap = new HashMapImpl<>();
        // Contadores para tipos de licencia
        int LDFD = 0;  // Licencia de Funcionamiento Definitiva
        int LDFT = 0;  // Licencia de Funcionamiento Temporal
        int total = 0;
        // Recorrer la lista enlazada y cargar los datos en el HashMap
        Nodo<Establecimiento> actual = lista.cabeza;
        while (actual != null) {
            Establecimiento establecimiento = actual.getData();
            hashMap.insert(establecimiento.getRuc_Estab(), establecimiento);
            actual = actual.getSiguiente();
            if ("LICENCIA DE FUNCIONAMIENTO DEFINITIVA".equals(establecimiento.getTipo_Licencia())) {
                        LDFD++;
            } 
            if ("LICENCIA DE FUNCIONAMIENTO TEMPORAL".equals(establecimiento.getTipo_Licencia())) {
                        LDFT++;
            } 
            total++;
        }
        
        /// Mostrar los datos del HashMap
        System.out.println("Contenido del HashMap:");
        Set<String> keys = hashMap.getKeys();
        for (String key : keys) {
            Establecimiento establecimiento = hashMap.search(key);
            if (establecimiento != null) {
                System.out.println(establecimiento);
            }
        }
        // Calcular el porcentaje de LDFD
        double porcentajeLDFD = (total > 0) ? (LDFD * 100.0 / total) : 0;
        double porcentajeLDFT = (total > 0) ? (LDFT * 100.0 / total) : 0;
        // Mostrar resultados
        System.out.println("Total de establecimientos: " + total);
        System.out.println("Licencia de Funcionamiento Definitiva: " + LDFD);
        System.out.println("Licencia de Funcionamiento Temporal: " + LDFT);
        System.out.println("Porcentaje de Licencia de Funcionamiento Definitiva: " + String.format("%.2f", porcentajeLDFD) + "%");
        System.out.println("Porcentaje de Licencia de Funcionamiento Temporal: " + String.format("%.2f", porcentajeLDFT) + "%");
    }
}
