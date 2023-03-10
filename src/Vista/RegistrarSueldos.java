/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Sueldos;
import Clases.SueldosDAO;
import Controladores.ControladorMenuSeleccion;
import static Controladores.ControladorMenuSeleccion.fecha;
import Controladores.ControladorSueldos;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DELL
 */
public class RegistrarSueldos extends javax.swing.JInternalFrame {

    Sueldos su = new Sueldos();
    SueldosDAO suDAO = new SueldosDAO();
    
    public RegistrarSueldos() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        txtFecha.setText(fecha());
        ControladorMenuSeleccion ConSelec = new ControladorMenuSeleccion();
        ControladorSueldos Consu= new ControladorSueldos(su, suDAO, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxPERSONAL_REGISTROSUELDOS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDIA_REGISTROSUELDOS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTARDANZAS_REGISTROSUELDOS = new javax.swing.JTextField();
        txtFALTAS_REGISTROSUELDOS = new javax.swing.JTextField();
        txtJUSTIFICADAS_REGISTROSUELDOS = new javax.swing.JTextField();
        txtTOTAL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDATOS_REGISTROSUELDOS = new javax.swing.JTable();
        btnMODIFICAR_REGISTROSUELDOS = new javax.swing.JButton();
        btnLIMPIAR_REGISTROSUELDOS = new javax.swing.JButton();
        btnAGREGAR_REGISTROSUELDOS = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtID_REGISTROSUELDOS = new javax.swing.JTextField();
        txtBUSCAR_REGISTROSUELDOS1 = new javax.swing.JTextField();
        txtFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 27, 27));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        cbxPERSONAL_REGISTROSUELDOS.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cbxPERSONAL_REGISTROSUELDOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Anderson", "Alexis", "Maria", "Andrea", "Juan", "Piero" }));
        cbxPERSONAL_REGISTROSUELDOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPERSONAL_REGISTROSUELDOSActionPerformed(evt);
            }
        });
        jPanel2.add(cbxPERSONAL_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 28, 149, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("D??a:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtDIA_REGISTROSUELDOS.setBackground(new java.awt.Color(27, 27, 27));
        txtDIA_REGISTROSUELDOS.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtDIA_REGISTROSUELDOS.setForeground(new java.awt.Color(255, 255, 255));
        txtDIA_REGISTROSUELDOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtDIA_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tardanzas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Faltas:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Justificadas:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        txtTARDANZAS_REGISTROSUELDOS.setBackground(new java.awt.Color(27, 27, 27));
        txtTARDANZAS_REGISTROSUELDOS.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtTARDANZAS_REGISTROSUELDOS.setForeground(new java.awt.Color(255, 255, 255));
        txtTARDANZAS_REGISTROSUELDOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtTARDANZAS_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 81, 36, -1));

        txtFALTAS_REGISTROSUELDOS.setBackground(new java.awt.Color(27, 27, 27));
        txtFALTAS_REGISTROSUELDOS.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtFALTAS_REGISTROSUELDOS.setForeground(new java.awt.Color(255, 255, 255));
        txtFALTAS_REGISTROSUELDOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtFALTAS_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 81, 36, -1));

        txtJUSTIFICADAS_REGISTROSUELDOS.setBackground(new java.awt.Color(27, 27, 27));
        txtJUSTIFICADAS_REGISTROSUELDOS.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtJUSTIFICADAS_REGISTROSUELDOS.setForeground(new java.awt.Color(255, 255, 255));
        txtJUSTIFICADAS_REGISTROSUELDOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtJUSTIFICADAS_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 81, 36, -1));

        txtTOTAL.setBackground(new java.awt.Color(27, 27, 27));
        txtTOTAL.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        txtTOTAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 81, 58, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* ejem: Lunes, Martes, etc...");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        tblDATOS_REGISTROSUELDOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N??", "Nombre", "Fecha", "Dia", "Tardanzas", "Faltas", "Justificadas", "Total"
            }
        ));
        tblDATOS_REGISTROSUELDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDATOS_REGISTROSUELDOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDATOS_REGISTROSUELDOS);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 850, 330));

        btnMODIFICAR_REGISTROSUELDOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnMODIFICAR_REGISTROSUELDOS.setContentAreaFilled(false);
        btnMODIFICAR_REGISTROSUELDOS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar-Gris.png"))); // NOI18N
        btnMODIFICAR_REGISTROSUELDOS.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar-Negro.png"))); // NOI18N
        jPanel2.add(btnMODIFICAR_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 80, 30));

        btnLIMPIAR_REGISTROSUELDOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btnLIMPIAR_REGISTROSUELDOS.setContentAreaFilled(false);
        btnLIMPIAR_REGISTROSUELDOS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar-Gris.png"))); // NOI18N
        btnLIMPIAR_REGISTROSUELDOS.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar-Negro.png"))); // NOI18N
        jPanel2.add(btnLIMPIAR_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 80, 30));

        btnAGREGAR_REGISTROSUELDOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAGREGAR_REGISTROSUELDOS.setContentAreaFilled(false);
        btnAGREGAR_REGISTROSUELDOS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar-Gris.png"))); // NOI18N
        btnAGREGAR_REGISTROSUELDOS.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar-Negro.png"))); // NOI18N
        jPanel2.add(btnAGREGAR_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 74, 31));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        txtID_REGISTROSUELDOS.setBackground(new java.awt.Color(27, 27, 27));
        txtID_REGISTROSUELDOS.setForeground(new java.awt.Color(255, 255, 255));
        txtID_REGISTROSUELDOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txtID_REGISTROSUELDOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_REGISTROSUELDOSActionPerformed(evt);
            }
        });
        jPanel2.add(txtID_REGISTROSUELDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 40, -1));

        txtBUSCAR_REGISTROSUELDOS1.setBackground(new java.awt.Color(27, 27, 27));
        txtBUSCAR_REGISTROSUELDOS1.setForeground(new java.awt.Color(255, 255, 255));
        txtBUSCAR_REGISTROSUELDOS1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txtBUSCAR_REGISTROSUELDOS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBUSCAR_REGISTROSUELDOS1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtBUSCAR_REGISTROSUELDOS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 40, -1));

        txtFecha.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(27, 27, 27));
        txtFecha.setText("DD/MM/YYYY");
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 30, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPERSONAL_REGISTROSUELDOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPERSONAL_REGISTROSUELDOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPERSONAL_REGISTROSUELDOSActionPerformed

    private void txtID_REGISTROSUELDOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_REGISTROSUELDOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_REGISTROSUELDOSActionPerformed

    private void txtBUSCAR_REGISTROSUELDOS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBUSCAR_REGISTROSUELDOS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBUSCAR_REGISTROSUELDOS1ActionPerformed

    private void tblDATOS_REGISTROSUELDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDATOS_REGISTROSUELDOSMouseClicked
        int fila = tblDATOS_REGISTROSUELDOS.rowAtPoint(evt.getPoint());
        txtID_REGISTROSUELDOS.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 0).toString());
        cbxPERSONAL_REGISTROSUELDOS.setSelectedItem(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 1).toString());
        txtDIA_REGISTROSUELDOS.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 3).toString());
        txtTARDANZAS_REGISTROSUELDOS.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 4).toString());
        txtFALTAS_REGISTROSUELDOS.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 5).toString());
        txtJUSTIFICADAS_REGISTROSUELDOS.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 6).toString());
        txtTOTAL.setText(tblDATOS_REGISTROSUELDOS.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tblDATOS_REGISTROSUELDOSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAGREGAR_REGISTROSUELDOS;
    public javax.swing.JButton btnLIMPIAR_REGISTROSUELDOS;
    public javax.swing.JButton btnMODIFICAR_REGISTROSUELDOS;
    public javax.swing.JComboBox<String> cbxPERSONAL_REGISTROSUELDOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDATOS_REGISTROSUELDOS;
    public javax.swing.JTextField txtBUSCAR_REGISTROSUELDOS1;
    public javax.swing.JTextField txtDIA_REGISTROSUELDOS;
    public javax.swing.JTextField txtFALTAS_REGISTROSUELDOS;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JTextField txtID_REGISTROSUELDOS;
    public javax.swing.JTextField txtJUSTIFICADAS_REGISTROSUELDOS;
    public javax.swing.JTextField txtTARDANZAS_REGISTROSUELDOS;
    public javax.swing.JTextField txtTOTAL;
    // End of variables declaration//GEN-END:variables
}
