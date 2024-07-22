/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import Entidad.Establecimiento;
import ListaGenerica.ListaEnlazadaImpl;
import ListaGenerica.Nodo;
import TAD_Establecimiento.CargadorEstablecimientos;
import TAD_Establecimiento.ListaEnlazadaImplEstablecimiento;
import TAD_Establecimiento.NodoEstablecimiento;
import TAD_HashMap.HashMapImpl;
import TAD_HashMap.HashMapInterface;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas
 */
public class Estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form NuevaLicenciaa
     */
    public Estadisticas() {
        initComponents();
        cargarDatosEnJTable();
        this.setLocationRelativeTo(null);
        estadisticas();
    }
    final String rutaArchivo = "licencias.csv";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadedatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadisticas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        listadedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° RUC", "Actividad", "Area", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(listadedatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, 208));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Licencia de Funcionamiento Temporal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 31, 250, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Licencia de Funcionamiento Definitiva");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 31, 240, -1));

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 41, 155, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }

    public void añadirYGuardarEstablecimiento(String Ruc_Estab, String Giro_Actividad, double Area_Estab, String Tipo_Licencia, String rutaArchivo) {
        // Crear una nueva lista enlazada
        ListaEnlazadaImpl lista = new ListaEnlazadaImpl();

        // Cargar los datos existentes desde el archivo CSV
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV(rutaArchivo);

        // Añadir nuevo establecimiento a la lista
        Establecimiento nuevoEstablecimiento = new Establecimiento(Ruc_Estab, Giro_Actividad, Area_Estab, Tipo_Licencia);
        lista.insertar(nuevoEstablecimiento);

        // Guardar la lista en el CSV
        cargador.guardarEnCSV(rutaArchivo);
        cargarDatosEnJTable();
    }


    void cargarDatosEnJTable() {
        ListaEnlazadaImpl lista = new ListaEnlazadaImpl();
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV("licencias.csv");

        // Limpiar las filas existentes en el modelo de la tabla
        DefaultTableModel modeloEstablecimientos = (DefaultTableModel) listadedatos.getModel();
        modeloEstablecimientos.setRowCount(0); // Esto borra todas las filas del modelo

        // Iterar sobre la lista enlazada y agregar los datos a la tabla
        Nodo actual = lista.cabeza; // Empezamos desde la cabeza de la lista
        while (actual != null) {
            Establecimiento establecimiento = (Establecimiento) actual.getData();
            Object[] datosEstablecimiento = new Object[]{
                establecimiento.getRuc_Estab(),
                establecimiento.getGiro_Actividad(),
                establecimiento.getArea_Estab(),
                establecimiento.getTipo_Licencia()
            // Puedes agregar más campos aquí según lo que quieras mostrar en la tabla
            };
            modeloEstablecimientos.addRow(datosEstablecimiento); // Agregar los datos al modelo de la tabla
            actual = actual.getSiguiente(); // Avanzar al siguiente nodo en la lista
        }

        // Establecer el nuevo modelo en la tabla
        listadedatos.setModel(modeloEstablecimientos);
    }

    void estadisticas() {
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
        jTextField1.setText("Funcionamiento Definitiva: " + LDFD);
        jTextField2.setText("Porcentaje de Licencia: " + String.format("%.2f", porcentajeLDFD) + "%");
        jTextField3.setText("Funcionamiento Temporal: " + LDFT);
        jTextField4.setText("Porcentaje de Licencia: " + String.format("%.2f", porcentajeLDFT) + "%");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable listadedatos;
    // End of variables declaration//GEN-END:variables
}