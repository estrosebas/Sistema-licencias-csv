/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import java.awt.Color;
import javax.swing.JOptionPane;
import Entidad.*;
import Datos.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author estrosebas
 */
public class menuunitario extends javax.swing.JFrame {

    /**
     * Creates new form menuunitario
     */
    private static final String DIRECTORIO_MATRICULAS = "C:\\matriculas";
    private static final String ARCHIVO_SESION = DIRECTORIO_MATRICULAS + "\\sesion.txt"; // Ruta al archivo de configuración
    private static final String ARCHIVO_CONFIG = DIRECTORIO_MATRICULAS + "\\config.txt"; // Ruta al archivo de configuración
    ImageIcon registrar = new ImageIcon(login.class.getResource("/registrar.png"));
    int Xmouse, Ymouse;

    public menuunitario() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistema matriculas");
        setearconexiontexto();
        obteneradmin();
        consultaralumnos();
        
    }

    public Image getIconImage() {
        //Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/beca.png"));
        Image retValue = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/beca.png"));

        return retValue;
    }
    void setearconexiontexto() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_CONFIG))) {
            databasetag.setText("BD : " + br.readLine());
           
        } catch (IOException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones
            return; // Retorna null si no se puede leer el archivo
        }
    }
    void obteneradmin() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_SESION))) {
            String idadmini = br.readLine();
            int codeadmini = Integer.parseInt(idadmini);
            LoginDAO dao = new LoginDAO();
            
            Login logI = dao.devolverNombre(codeadmini);
            usertesxt.setText("User : " + logI.getNombre());
            jLabel14.setText("Bienvenido: " + logI.getNombre());
        } catch (IOException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones
            return; //Retorna null si no se puede leer el archivo
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelbotonMatriculas = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelbotonRepresentantes = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelbotonAlumnos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Distritosboton2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usertesxt = new javax.swing.JLabel();
        databasetag = new javax.swing.JLabel();
        multimenus = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        asistenciatabla = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        regreasr = new javax.swing.JButton();
        dnientrada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        salida = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(164, 112, 86));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 10));

        panelbotonMatriculas.setBackground(new java.awt.Color(164, 112, 86));
        panelbotonMatriculas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelbotonMatriculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelbotonMatriculas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelbotonMatriculasMouseMoved(evt);
            }
        });
        panelbotonMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbotonMatriculasMouseExited(evt);
            }
        });
        panelbotonMatriculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricula.png"))); // NOI18N
        panelbotonMatriculas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reporte");
        panelbotonMatriculas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));

        jPanel3.add(panelbotonMatriculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 140, 80));

        panelbotonRepresentantes.setBackground(new java.awt.Color(164, 112, 86));
        panelbotonRepresentantes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelbotonRepresentantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelbotonRepresentantes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelbotonRepresentantesMouseMoved(evt);
            }
        });
        panelbotonRepresentantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelbotonRepresentantesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbotonRepresentantesMouseExited(evt);
            }
        });
        panelbotonRepresentantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repre.png"))); // NOI18N
        panelbotonRepresentantes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Busqueda");
        panelbotonRepresentantes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));

        jPanel3.add(panelbotonRepresentantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 140, 80));

        panelbotonAlumnos.setBackground(new java.awt.Color(164, 112, 86));
        panelbotonAlumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelbotonAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelbotonAlumnos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelbotonAlumnosMouseMoved(evt);
            }
        });
        panelbotonAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelbotonAlumnosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbotonAlumnosMouseExited(evt);
            }
        });
        panelbotonAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registro");
        panelbotonAlumnos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 31, 80, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graduado.png"))); // NOI18N
        panelbotonAlumnos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 40));

        jPanel3.add(panelbotonAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, 80));

        Distritosboton2.setBackground(new java.awt.Color(164, 112, 86));
        Distritosboton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Distritosboton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database.png"))); // NOI18N
        jLabel34.setText("jLabel18");
        Distritosboton2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 40));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("licencias.csv");
        Distritosboton2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel3.add(Distritosboton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMenu.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 80));

        usertesxt.setBackground(new java.awt.Color(255, 255, 255));
        usertesxt.setForeground(new java.awt.Color(255, 255, 255));
        usertesxt.setText("User :");
        jPanel3.add(usertesxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        databasetag.setForeground(new java.awt.Color(255, 255, 255));
        databasetag.setText("DB :");
        jPanel3.add(databasetag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

        multimenus.setBackground(new java.awt.Color(0, 0, 0,100));

        jPanel4.setBackground(new java.awt.Color(252, 241, 225));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(0, 0, 0,100));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bienvenido: ");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuenta-de-usuario.png"))); // NOI18N
        jLabel26.setText("jLabel26");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel4.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 600, 390));

        multimenus.addTab("0", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(252, 241, 225));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido materno", "Apellido paterno", "Dni"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 615, 265));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0, 100));

        jButton1.setText("Actualizar");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(522, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 610, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        multimenus.addTab("1", jPanel5);

        jPanel9.setBackground(new java.awt.Color(252, 241, 225));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asistenciatabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Dni", "Fecha", "Temprano/Tarde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(asistenciatabla);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 615, 265));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0, 100));

        regreasr.setText("Regresar");
        regreasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regreasrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(regreasr)
                .addGap(18, 18, 18))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(regreasr))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 610, 40));

        dnientrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnientradaActionPerformed(evt);
            }
        });
        jPanel9.add(dnientrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DNI :");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        multimenus.addTab("2", jPanel8);

        jPanel1.add(multimenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 670, 470));

        jPanel2.setBackground(new java.awt.Color(128, 0, 128));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salida.setBackground(new java.awt.Color(255, 255, 255));
        salida.setOpaque(false);
        salida.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                salidaMouseMoved(evt);
            }
        });
        salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidaMouseExited(evt);
            }
        });
        salida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        salida.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 18, 20));

        jPanel2.add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salidaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseMoved
        salida.setBackground(new Color(0, 51, 51));
        salida.setOpaque(true);
        salida.repaint();
    }//GEN-LAST:event_salidaMouseMoved

    private void salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salidaMouseClicked

    private void salidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseExited
        salida.setOpaque(false);
        salida.repaint();
    }//GEN-LAST:event_salidaMouseExited

    private void panelbotonAlumnosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonAlumnosMouseMoved
        panelbotonAlumnos.setBackground(new Color(166, 49, 57));
    }//GEN-LAST:event_panelbotonAlumnosMouseMoved

    private void panelbotonRepresentantesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonRepresentantesMouseMoved
        panelbotonRepresentantes.setBackground(new Color(166, 49, 57));
    }//GEN-LAST:event_panelbotonRepresentantesMouseMoved

    private void panelbotonMatriculasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonMatriculasMouseMoved
        panelbotonMatriculas.setBackground(new Color(166, 49, 57));
    }//GEN-LAST:event_panelbotonMatriculasMouseMoved

    private void panelbotonAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonAlumnosMouseExited
        panelbotonAlumnos.setBackground(new Color(164,112,86));
    }//GEN-LAST:event_panelbotonAlumnosMouseExited

    private void panelbotonRepresentantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonRepresentantesMouseExited
        panelbotonRepresentantes.setBackground(new Color(164,112,86));
    }//GEN-LAST:event_panelbotonRepresentantesMouseExited

    private void panelbotonMatriculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonMatriculasMouseExited
        panelbotonMatriculas.setBackground(new Color(164,112,86));
    }//GEN-LAST:event_panelbotonMatriculasMouseExited

    private void panelbotonAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonAlumnosMouseClicked
        multimenus.setSelectedIndex(1);
    }//GEN-LAST:event_panelbotonAlumnosMouseClicked

    private void panelbotonRepresentantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonRepresentantesMouseClicked
        multimenus.setSelectedIndex(2);
    }//GEN-LAST:event_panelbotonRepresentantesMouseClicked

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        
    }//GEN-LAST:event_none

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //consultaralumnos();
        //JOptionPane.showMessageDialog(null, "Actualizado!");

        //
        try {
            consultaralumnos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Actualizado!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setBackground(new Color(0, 128, 128));
    }//GEN-LAST:event_jButton1MouseMoved

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void dnientradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnientradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnientradaActionPerformed

    private void regreasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regreasrActionPerformed
        login frame = new login();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regreasrActionPerformed

    
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
            java.util.logging.Logger.getLogger(menuunitario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuunitario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuunitario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuunitario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuunitario().setVisible(true);
            }
        });
    }

    void consultaralumnos() {
        // Crear una instancia de AlumnoDAO
        AlumnoDAO alumnoDAO = new AlumnoDAO();

        // Obtener la lista de todos los alumnos
        List<Alumno> listaAlumnos = alumnoDAO.obtenerTodosLosAlumnos();

        // Limpia las filas existentes en la tabla
        DefaultTableModel modeloAlumnos = (DefaultTableModel) Tabla.getModel();
        while (modeloAlumnos.getRowCount() > 0) {
            modeloAlumnos.removeRow(0);
        }

        // Iterar sobre la lista de alumnos y agregarlos a la tabla
        for (Alumno alumno : listaAlumnos) {
            Object[] estudiante = new Object[]{
                alumno.getId_Alumno(),
                alumno.getNom_Alu(),
                alumno.getApe_MAl(),
                alumno.getApe_PAl(),
                alumno.getDni_Alumno()
            };
            modeloAlumnos.addRow(estudiante);
        }

        Tabla.setModel(modeloAlumnos);
    }
    void consultarasistencia() {
        AsistenciaDAO asistenciaDAO = new AsistenciaDAO();

        // Obtener la lista de todas las habilidades
        List<Asistencia> listaAsistencia = asistenciaDAO.obtenerAsistenciaPorDNI(Integer.parseInt(dnientrada.getText()));

        // Limpia las filas existentes en la tabla
        DefaultTableModel modelo = (DefaultTableModel) asistenciatabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // Iterar sobre la lista de habilidades y agregarlas a la tabla
        for (Asistencia asistencia : listaAsistencia) {
        String llegada = asistencia.getLlegada_temprano() ? "temprano" : "tarde";
        Object[] filaHabilidad = new Object[]{
            asistencia.getId_asistencia(),
            asistencia.getDni(),
            asistencia.getFecha_hora(),
            llegada
        };
        modelo.addRow(filaHabilidad);
    }

        asistenciatabla.setModel(modelo);
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Distritosboton2;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable asistenciatabla;
    private javax.swing.JLabel databasetag;
    private javax.swing.JTextField dnientrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane multimenus;
    private javax.swing.JPanel panelbotonAlumnos;
    private javax.swing.JPanel panelbotonMatriculas;
    private javax.swing.JPanel panelbotonRepresentantes;
    private javax.swing.JButton regreasr;
    private javax.swing.JPanel salida;
    private javax.swing.JLabel usertesxt;
    // End of variables declaration//GEN-END:variables
}
