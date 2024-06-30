/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_LoginCola;

import TAD_Establecimiento.*;
import Entidad.Establecimiento;
import Entidad.Login;
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
public class CargadorLogin implements CargadorLoginInterface {

    private ListaEnlazadaImpl lista;

    public CargadorLogin(ListaEnlazadaImpl lista) {
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
                String nombre = linea.substring(0, primerComa);

                String contra = linea.substring(primerComa + 1);

                Login login = new Login(nombre, contra);
                lista.insertar(login);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void guardarEnCSV(String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Escribir encabezado si es necesario
            bw.write("Nombre,Contraseña");
            bw.newLine();
            
            Nodo actual = lista.cabeza;
            while (actual != null) {
                Login login = (Login) actual.getData();
                String linea = login.getNombre() + "," + login.getContra();
                bw.write(linea);
                bw.newLine();
                actual = actual.getSiguiente();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
