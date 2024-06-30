/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_LoginCola;

import ListaGenerica.ListaEnlazadaImpl;
import TAD_Establecimiento.CargadorEstablecimientos;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sebas
 */
public class test {
    public static void main(String[] args) {
        ListaEnlazadaImpl lista = new ListaEnlazadaImpl();
        /*CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV("licencias.csv");
        lista.mostrar();*/
        CargadorLogin cargador = new CargadorLogin(lista);
        cargador.cargarDesdeCSV("usuarios.csv");
        lista.mostrar();
    }
}
