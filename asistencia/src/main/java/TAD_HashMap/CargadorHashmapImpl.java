/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_HashMap;

import Entidad.Establecimiento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @author Sebastian
 */
public class CargadorHashmapImpl implements CargadorHashmapInterface {
    private HashMapInterface<String, Establecimiento> hashMap;

    public CargadorHashmapImpl(HashMapInterface<String, Establecimiento> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void cargarDesdeCSV(String rutaArchivo) {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            // Leer la línea de encabezado si existe
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    String Ruc_Estab = datos[0];
                    String Giro_Actividad = datos[1];
                    double Area_Estab = Double.parseDouble(datos[2]);
                    String Tipo_Licencia = datos[3];

                    Establecimiento establecimiento = new Establecimiento(Ruc_Estab, Giro_Actividad, Area_Estab, Tipo_Licencia);
                    hashMap.insert(Ruc_Estab, establecimiento);
                }
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

            // Obtener todas las claves
            Set<String> keys = hashMap.getKeys();

            // Iterar sobre las claves y escribir los valores en el archivo CSV
            for (String key : keys) {
                Establecimiento establecimiento = hashMap.search(key);
                if (establecimiento != null) {
                    String linea = establecimiento.getRuc_Estab() + "," + 
                                   establecimiento.getGiro_Actividad() + "," +
                                   establecimiento.getArea_Estab() + "," +
                                   establecimiento.getTipo_Licencia();
                    bw.write(linea);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
