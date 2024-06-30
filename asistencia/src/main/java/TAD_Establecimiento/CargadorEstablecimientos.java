/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_Establecimiento;

import Entidad.Establecimiento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import ListaGenerica.*;

/**
 *
 * @author Sebas
 */
public class CargadorEstablecimientos implements CargadorEstablecimientosInterface {

    private ListaEnlazadaImpl lista;

    public CargadorEstablecimientos(ListaEnlazadaImpl lista) {
        this.lista = lista;
    }

    @Override
    public void cargarDesdeCSV(String rutaArchivo) {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            // Leer la línea de encabezado si existe
            br.readLine();
            while ((linea = br.readLine()) != null) {
                int primerComa = linea.indexOf(',');
                String Ruc_Estab = linea.substring(0, primerComa);

                int segundoComa = linea.indexOf(',', primerComa + 1);
                String Giro_Actividad = linea.substring(primerComa + 1, segundoComa);

                int tercerComa = linea.indexOf(',', segundoComa + 1);
                double Area_Estab = Double.parseDouble(linea.substring(segundoComa + 1, tercerComa));

                String Tipo_Licencia = linea.substring(tercerComa + 1);

                Establecimiento establecimiento = new Establecimiento(Ruc_Estab, Giro_Actividad, Area_Estab, Tipo_Licencia);
                lista.insertar(establecimiento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void guardarEnCSV(String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Escribir encabezado si es necesario
            bw.write("Ruc_Estab,Giro_Actividad,Area_Estab,Tipo_Licencia");
            bw.newLine();
            
            Nodo actual = lista.cabeza;
            while (actual != null) {
                Establecimiento establecimiento = (Establecimiento) actual.getData();
                String linea = establecimiento.getRuc_Estab() + "," + 
                               establecimiento.getGiro_Actividad() + "," +
                               establecimiento.getArea_Estab() + "," +
                               establecimiento.getTipo_Licencia();
                bw.write(linea);
                bw.newLine();
                actual = actual.getSiguiente();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
