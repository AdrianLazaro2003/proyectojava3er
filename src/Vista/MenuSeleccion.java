/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.ControladorDashboard;
import Controladores.ControladorMenuSeleccion;
import static Controladores.ControladorMenuSeleccion.fecha;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class MenuSeleccion extends javax.swing.JFrame implements Runnable {

    Color DefauColor, ClickedColor;
    String hora, minutos, segundos;
    Thread hilo;

    public MenuSeleccion() {
        initComponents();
        setLocationRelativeTo(this);
        DefauColor = new Color(27, 27, 27);
        ClickedColor = new Color(133, 131, 131);
        txtFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        Menu1.setBackground(DefauColor);
        ControladorMenuSeleccion ConSelec = new ControladorMenuSeleccion();
        ControladorDashboard ConDash = new ControladorDashboard(DefauColor, ClickedColor, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtSubTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Menu1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JPanel();
        txt3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        Menu4 = new javax.swing.JPanel();
        txt4 = new javax.swing.JLabel();
        Menu5 = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        Menu6 = new javax.swing.JPanel();
        txt6 = new javax.swing.JLabel();
        Menu7 = new javax.swing.JPanel();
        txt7 = new javax.swing.JLabel();
        VentanaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        txtTitulo.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Bienvenido!! Seleccione un menu ");

        txtSubTitulo.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        txtSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtSubTitulo.setText("Descripcion del menu seleccionado");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don Pimenton");

        txtHora.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setText("00:00:00");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");

        txtFecha.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("DD/MM/YYYY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha)
                    .addComponent(txtSubTitulo))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1100, 100));

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        Menu1.setBackground(new java.awt.Color(27, 27, 27));
        Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu1MousePressed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText(" Crear menú del día");
        txt1.setToolTipText("");
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu2.setBackground(new java.awt.Color(27, 27, 27));
        Menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText(" Registrar Comandas");
        txt2.setToolTipText("");
        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt2)
                .addContainerGap())
        );

        Menu3.setBackground(new java.awt.Color(27, 27, 27));
        Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu3MousePressed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("   Crear Comandas");
        txt3.setToolTipText("");
        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu3Layout = new javax.swing.GroupLayout(Menu3);
        Menu3.setLayout(Menu3Layout);
        Menu3Layout.setHorizontalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt3)
                .addGap(68, 68, 68))
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir-Gris.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir-Negro.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Menu4.setBackground(new java.awt.Color(27, 27, 27));
        Menu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu4MousePressed(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText("Registro de asistencia");
        txt4.setToolTipText("");
        txt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu4Layout = new javax.swing.GroupLayout(Menu4);
        Menu4.setLayout(Menu4Layout);
        Menu4Layout.setHorizontalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu4Layout.setVerticalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu5.setBackground(new java.awt.Color(27, 27, 27));
        Menu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu5MousePressed(evt);
            }
        });

        txt5.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setText("  Registro de clientes");
        txt5.setToolTipText("");
        txt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu5Layout = new javax.swing.GroupLayout(Menu5);
        Menu5.setLayout(Menu5Layout);
        Menu5Layout.setHorizontalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu5Layout.setVerticalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu6.setBackground(new java.awt.Color(27, 27, 27));
        Menu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu6MousePressed(evt);
            }
        });

        txt6.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText("   Registrar sueldos ");
        txt6.setToolTipText("");
        txt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu6Layout = new javax.swing.GroupLayout(Menu6);
        Menu6.setLayout(Menu6Layout);
        Menu6Layout.setHorizontalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu6Layout.setVerticalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu7.setBackground(new java.awt.Color(27, 27, 27));
        Menu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu7MousePressed(evt);
            }
        });

        txt7.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setText("    Enviar correos");
        txt7.setToolTipText("");
        txt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Menu7Layout = new javax.swing.GroupLayout(Menu7);
        Menu7.setLayout(Menu7Layout);
        Menu7Layout.setHorizontalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu7Layout.setVerticalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Menu4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, 500));

        VentanaPanel.setBackground(new java.awt.Color(27, 27, 27));
        VentanaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoVentanaPanel.png"))); // NOI18N

        javax.swing.GroupLayout VentanaPanelLayout = new javax.swing.GroupLayout(VentanaPanel);
        VentanaPanel.setLayout(VentanaPanelLayout);
        VentanaPanelLayout.setHorizontalGroup(
            VentanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, Short.MAX_VALUE)
        );
        VentanaPanelLayout.setVerticalGroup(
            VentanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(VentanaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 930, 500));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenusAgrandado.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MousePressed
        
    }//GEN-LAST:event_Menu1MousePressed

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed
        
    }//GEN-LAST:event_Menu2MousePressed

    private void Menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MousePressed
        
    }//GEN-LAST:event_Menu3MousePressed

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        
    }//GEN-LAST:event_Menu1MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        
    }//GEN-LAST:event_Menu2MouseClicked

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
        
    }//GEN-LAST:event_txt3MouseClicked

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        
    }//GEN-LAST:event_Menu3MouseClicked

    private void Menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseClicked
      
    }//GEN-LAST:event_Menu4MouseClicked

    private void Menu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MousePressed
       
    }//GEN-LAST:event_Menu4MousePressed

    private void Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MouseClicked
       
    }//GEN-LAST:event_Menu5MouseClicked

    private void Menu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MousePressed
        
    }//GEN-LAST:event_Menu5MousePressed

    private void Menu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu6MouseClicked
        
    }//GEN-LAST:event_Menu6MouseClicked

    private void Menu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu6MousePressed
        
    }//GEN-LAST:event_Menu6MousePressed

    private void Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MouseClicked
        
    }//GEN-LAST:event_Menu7MouseClicked

    private void Menu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MousePressed
        
    }//GEN-LAST:event_Menu7MousePressed

    private void txt4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt4MousePressed
       
    }//GEN-LAST:event_txt4MousePressed

    private void txt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MousePressed
       
    }//GEN-LAST:event_txt3MousePressed

    private void txt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MousePressed
       
    }//GEN-LAST:event_txt2MousePressed

    private void txt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MousePressed
        
    }//GEN-LAST:event_txt1MousePressed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
        
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
        
    }//GEN-LAST:event_txt2MouseClicked

    private void txt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt4MouseClicked
      
    }//GEN-LAST:event_txt4MouseClicked

    private void txt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt7MouseClicked
       
    }//GEN-LAST:event_txt7MouseClicked

    private void txt7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt7MousePressed
       
    }//GEN-LAST:event_txt7MousePressed

    private void txt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MouseClicked
       
    }//GEN-LAST:event_txt5MouseClicked

    private void txt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt6MouseClicked
      
    }//GEN-LAST:event_txt6MouseClicked

    private void txt6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt6MousePressed
       
    }//GEN-LAST:event_txt6MousePressed

    private void txt5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MousePressed
         
    }//GEN-LAST:event_txt5MousePressed

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

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSeleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Menu1;
    public javax.swing.JPanel Menu2;
    public javax.swing.JPanel Menu3;
    public javax.swing.JPanel Menu4;
    public javax.swing.JPanel Menu5;
    public javax.swing.JPanel Menu6;
    public javax.swing.JPanel Menu7;
    public javax.swing.JPanel VentanaPanel;
    public javax.swing.JButton btnSalir;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel txt1;
    public javax.swing.JLabel txt2;
    public javax.swing.JLabel txt3;
    public javax.swing.JLabel txt4;
    public javax.swing.JLabel txt5;
    public javax.swing.JLabel txt6;
    public javax.swing.JLabel txt7;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JLabel txtHora;
    public javax.swing.JLabel txtSubTitulo;
    public javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (current == hilo) {
            hora();
            txtHora.setText(hora + ":" + minutos + ":" + segundos);
        }

    }
}
