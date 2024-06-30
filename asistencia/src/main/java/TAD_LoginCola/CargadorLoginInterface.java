/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAD_LoginCola;

import TAD_Establecimiento.*;

/**
 *
 * @author Sebas
 */
public interface CargadorLoginInterface {

    void cargarDesdeCSV(String rutaArchivo);
    void guardarEnCSV(String rutaArchivo);
}
