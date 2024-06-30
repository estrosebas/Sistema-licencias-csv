/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import Entidad.Establecimiento;
import ListaGenerica.BusquedaBinaria;
import ListaGenerica.BusquedaBinariaImpl;
import ListaGenerica.ListaEnlazadaImpl;
import ListaGenerica.Nodo;
import TAD_Establecimiento.*;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

public class BusquedaLicencias extends javax.swing.JFrame {

    public BusquedaLicencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatosEnJTable();
        //tableArticulos = new javax.swing.JTable();
    }

    // Crear una instancia de la lista enlazada
    ListaEnlazadaImplEstablecimiento lista = new ListaEnlazadaImplEstablecimiento();
    ListaEnlazadaImplEstablecimiento metodos = new ListaEnlazadaImplEstablecimiento();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldGiro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldRuc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jCheckBoxRuc = new javax.swing.JCheckBox();
        jCheckBoxGiro = new javax.swing.JCheckBox();
        jCheckBoxArea = new javax.swing.JCheckBox();
        jCheckBoxTipoLicencia = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cmbOrdenarAr = new javax.swing.JComboBox<>();
        btnImportar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextFieldTipoLicencia = new javax.swing.JTextField();
        jTextFieldArea = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadedatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 185, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licencia.png"))); // NOI18N
        jLabel1.setText("Busqueda de Licencia");

        jTextFieldGiro.setBackground(new java.awt.Color(112, 145, 255));
        jTextFieldGiro.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextFieldGiro.setForeground(new java.awt.Color(204, 204, 255));
        jTextFieldGiro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldGiro.setToolTipText("");
        jTextFieldGiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldGiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomActi(evt);
            }
        });

        jTextFieldRuc.setBackground(new java.awt.Color(112, 145, 255));
        jTextFieldRuc.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextFieldRuc.setForeground(new java.awt.Color(204, 204, 255));
        jTextFieldRuc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRuc.setToolTipText("");
        jTextFieldRuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumRuc(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(60, 78, 187));
        btnBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jCheckBoxRuc.setBackground(new java.awt.Color(86, 185, 255));
        jCheckBoxRuc.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jCheckBoxRuc.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxRuc.setText("N° de RUC");
        jCheckBoxRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNumRucActionPerformed(evt);
            }
        });

        jCheckBoxGiro.setBackground(new java.awt.Color(86, 185, 255));
        jCheckBoxGiro.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jCheckBoxGiro.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxGiro.setText("Nombre de la Actividad");
        jCheckBoxGiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNomActiActionPerformed(evt);
            }
        });

        jCheckBoxArea.setBackground(new java.awt.Color(86, 185, 255));
        jCheckBoxArea.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jCheckBoxArea.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxArea.setText("N° Area");
        jCheckBoxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNumAreaActionPerformed(evt);
            }
        });

        jCheckBoxTipoLicencia.setBackground(new java.awt.Color(86, 185, 255));
        jCheckBoxTipoLicencia.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jCheckBoxTipoLicencia.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxTipoLicencia.setText("Tipo de Licencia");
        jCheckBoxTipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chTipoLicenciarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(112, 145, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ordenar por:");

        cmbOrdenarAr.setBackground(new java.awt.Color(112, 145, 255));
        cmbOrdenarAr.setEditable(true);
        cmbOrdenarAr.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cmbOrdenarAr.setForeground(new java.awt.Color(204, 204, 255));
        cmbOrdenarAr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmbOrdenarAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenarPor(evt);
            }
        });

        btnImportar.setBackground(new java.awt.Color(60, 78, 187));
        btnImportar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(255, 255, 255));
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importar.png"))); // NOI18N
        btnImportar.setText("Importar");
        btnImportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImportarMouseClicked(evt);
            }
        });
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(60, 78, 187));
        btnSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTextFieldTipoLicencia.setBackground(new java.awt.Color(112, 145, 255));
        jTextFieldTipoLicencia.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextFieldTipoLicencia.setForeground(new java.awt.Color(204, 204, 255));
        jTextFieldTipoLicencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTipoLicencia.setToolTipText("");
        jTextFieldTipoLicencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldTipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textipoLicecia(evt);
            }
        });

        jTextFieldArea.setBackground(new java.awt.Color(112, 145, 255));
        jTextFieldArea.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextFieldArea.setForeground(new java.awt.Color(204, 204, 255));
        jTextFieldArea.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldArea.setToolTipText("");
        jTextFieldArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumArea(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(60, 78, 187));
        btnActualizar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jCheckBoxGiro))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jCheckBoxRuc))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBoxTipoLicencia)
                                                    .addComponent(jCheckBoxArea))))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbOrdenarAr, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldGiro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(230, 230, 230))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxRuc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGiro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxGiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxArea)
                            .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxTipoLicencia)
                            .addComponent(jTextFieldTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbOrdenarAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImportar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNumArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumArea
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumArea

    private void textipoLicecia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textipoLicecia

    }//GEN-LAST:event_textipoLicecia

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed

    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnImportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMouseClicked

    }//GEN-LAST:event_btnImportarMouseClicked

    private void chTipoLicenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chTipoLicenciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chTipoLicenciarActionPerformed

    private void chNumAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chNumAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chNumAreaActionPerformed

    private void chNomActiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chNomActiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chNomActiActionPerformed

    private void chNumRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chNumRucActionPerformed

    }//GEN-LAST:event_chNumRucActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void textNumRuc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumRuc
        //btnBuscarActionPerformed(evt); // Llamar al método btnBuscarActionPerformed
    }//GEN-LAST:event_textNumRuc

    private void textNomActi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomActi
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomActi

    private void cmbOrdenarPor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenarPor

    }//GEN-LAST:event_cmbOrdenarPor

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarDatosEnJTable();
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaLicencias().setVisible(true);
            }
        });
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

    void buscar() {
        
        /// se hace uso de algunos mios y de la version actualizada las buisquedas provienen de calses combinadas
        // Obtener los valores de los campos de búsqueda
        String ruc = jTextFieldRuc.getText();
        String giro = jTextFieldGiro.getText();
        Double area = null;
        if (!jTextFieldArea.getText().isEmpty()) {
            area = Double.parseDouble(jTextFieldArea.getText());
        }
        String tipoLicencia = jTextFieldTipoLicencia.getText();

        // Cargar la lista de establecimientos desde el CSV
        ListaEnlazadaImpl lista = new ListaEnlazadaImpl();
        
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV("licencias.csv");
        Comparator<Establecimiento> comparator = new Comparator<Establecimiento>() {
            @Override
            public int compare(Establecimiento e1, Establecimiento e2) {
                return e1.getRuc_Estab().compareTo(e2.getRuc_Estab());
            }
        };

        lista.ordenar(comparator);
        
        
        // Inicializar las instancias de búsqueda
        BusquedaImplLinealEstablecimiento busquedaLineal = new BusquedaImplLinealEstablecimiento(lista);
        BusquedaBinaria busquedaBinaria = new BusquedaBinariaImpl(lista);
          
        
        
        // Inicializar la lista de resultados
        ListaEnlazadaImpl resultado = new ListaEnlazadaImpl();

        // Verificar si se debe realizar la búsqueda por RUC (binaria)
        if (jCheckBoxRuc.isSelected() && !ruc.isEmpty()) {
            
            ListaEnlazadaImpl resultadosRuc = busquedaBinaria.buscarPorRuc(ruc);
            resultado = combinarResultados(resultado, resultadosRuc);
        
        }

        // Verificar si se debe realizar la búsqueda por Giro (lineal)
        if (jCheckBoxGiro.isSelected() && !giro.isEmpty()) {
            ListaEnlazadaImpl resultadosGiro = busquedaLineal.buscarPorGiro(giro);
            resultado = combinarResultados(resultado, resultadosGiro);
        }

        // Verificar si se debe realizar la búsqueda por Area (lineal)
        if (jCheckBoxArea.isSelected() && area != null) {
            ListaEnlazadaImpl resultadosArea = busquedaLineal.buscarPorArea(area);
            resultado = combinarResultados(resultado, resultadosArea);
        }

        // Verificar si se debe realizar la búsqueda por Tipo de Licencia (lineal)
        if (jCheckBoxTipoLicencia.isSelected() && !tipoLicencia.isEmpty()) {
            ListaEnlazadaImpl resultadosLicencia = busquedaLineal.buscarPorTipoLicencia(tipoLicencia);
            resultado = combinarResultados(resultado, resultadosLicencia);
        }

        // Limpiar la tabla
        DefaultTableModel modeloEstablecimientos = (DefaultTableModel) listadedatos.getModel();
        modeloEstablecimientos.setRowCount(0);

        // Agregar los resultados de la búsqueda a la tabla
        Nodo actual = resultado.cabeza;
        while (actual != null) {
            Establecimiento establecimiento = (Establecimiento) actual.getData();
            Object[] datosEstablecimiento = new Object[]{
                establecimiento.getRuc_Estab(),
                establecimiento.getGiro_Actividad(),
                establecimiento.getArea_Estab(),
                establecimiento.getTipo_Licencia()
            };
            modeloEstablecimientos.addRow(datosEstablecimiento);
            actual = actual.getSiguiente();
        }

        // Establecer el nuevo modelo en la tabla
        listadedatos.setModel(modeloEstablecimientos);
    }

// Función para agregar los resultados de una búsqueda a otra lista
    void agregarResultados(ListaEnlazadaImplEstablecimiento listaDestino, ListaEnlazadaImplEstablecimiento resultados) {
        NodoEstablecimiento actual = resultados.cabeza;
        while (actual != null) {
            listaDestino.insertar(actual.getEstablecimiento());
            actual = actual.getSiguiente();
        }
    }
    // Método auxiliar para combinar los resultados de las búsquedas

    private <T> ListaEnlazadaImpl<T> combinarResultados(ListaEnlazadaImpl<T> resultado, ListaEnlazadaImpl<T> nuevosResultados) {
        Nodo<T> actual = nuevosResultados.cabeza;
        while (actual != null) {
            resultado.insertar(actual.getData());
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbOrdenarAr;
    private javax.swing.JCheckBox jCheckBoxArea;
    private javax.swing.JCheckBox jCheckBoxGiro;
    private javax.swing.JCheckBox jCheckBoxRuc;
    private javax.swing.JCheckBox jCheckBoxTipoLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldGiro;
    private javax.swing.JTextField jTextFieldRuc;
    private javax.swing.JTextField jTextFieldTipoLicencia;
    private javax.swing.JTable listadedatos;
    // End of variables declaration//GEN-END:variables

}
