package Vista;

import Clases.RegistroAsistencia;
import Clases.RegistroAsistenciaDAO;
import Controladores.ControladorAsistencia;
import Controladores.ControladorMenuSeleccion;
import static Controladores.ControladorMenuSeleccion.fecha;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class RegistroDeAsistencia extends javax.swing.JInternalFrame implements Runnable{

    String hora, minutos, segundos;
    Thread hilo;
    RegistroAsistencia ra = new RegistroAsistencia();
    RegistroAsistenciaDAO raDAO = new RegistroAsistenciaDAO();
    
    public RegistroDeAsistencia() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        txtFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        ControladorMenuSeleccion ConSelec = new ControladorMenuSeleccion();
        ControladorAsistencia ConAsis = new ControladorAsistencia(ra, raDAO, this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMENU_ASISTENCIA = new javax.swing.JPopupMenu();
        JASISTENCIA_ASISTIO = new javax.swing.JMenuItem();
        JASISTENCIA_FALTO = new javax.swing.JMenuItem();
        JASISTENCIA_TARDANZA = new javax.swing.JMenuItem();
        JASISTNCIA_JUSTIFICADO = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxPERSONAL_REGISTROASISTENCIA = new javax.swing.JComboBox<>();
        btnAGREGAR_REGISTROASISTENCIA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLISTA_REGISTROASISTENCIA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDIA_REGISTROASISTENCIA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnMODIFICAR_REGISTROASISTENCIA = new javax.swing.JButton();
        btnLIMPIAR_REGISTROASISTENCIA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBUSCAR_REGISTROASISTENCIA = new javax.swing.JTextField();
        txtID_REGISTROASISTENCIA = new javax.swing.JTextField();

        JASISTENCIA_ASISTIO.setText("Asistio");
        popupMENU_ASISTENCIA.add(JASISTENCIA_ASISTIO);

        JASISTENCIA_FALTO.setText("Falto");
        popupMENU_ASISTENCIA.add(JASISTENCIA_FALTO);

        JASISTENCIA_TARDANZA.setText("Tardanza");
        popupMENU_ASISTENCIA.add(JASISTENCIA_TARDANZA);

        JASISTNCIA_JUSTIFICADO.setText("Justificado");
        popupMENU_ASISTENCIA.add(JASISTNCIA_JUSTIFICADO);

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 30, -1, -1));

        cbxPERSONAL_REGISTROASISTENCIA.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cbxPERSONAL_REGISTROASISTENCIA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Anderson", "Alexis", "Maria", "Andrea", "Juan", "Piero" }));
        cbxPERSONAL_REGISTROASISTENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPERSONAL_REGISTROASISTENCIAActionPerformed(evt);
            }
        });
        jPanel2.add(cbxPERSONAL_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 28, 149, -1));

        btnAGREGAR_REGISTROASISTENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAGREGAR_REGISTROASISTENCIA.setContentAreaFilled(false);
        btnAGREGAR_REGISTROASISTENCIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar-Gris.png"))); // NOI18N
        btnAGREGAR_REGISTROASISTENCIA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar-Negro.png"))); // NOI18N
        btnAGREGAR_REGISTROASISTENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGAR_REGISTROASISTENCIAActionPerformed(evt);
            }
        });
        jPanel2.add(btnAGREGAR_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 74, 31));

        tblLISTA_REGISTROASISTENCIA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Día", "Fecha", "Hora", "Asistencia"
            }
        ));
        tblLISTA_REGISTROASISTENCIA.setComponentPopupMenu(popupMENU_ASISTENCIA);
        tblLISTA_REGISTROASISTENCIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLISTA_REGISTROASISTENCIAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLISTA_REGISTROASISTENCIA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 850, 340));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Día:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtDIA_REGISTROASISTENCIA.setBackground(new java.awt.Color(27, 27, 27));
        txtDIA_REGISTROASISTENCIA.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtDIA_REGISTROASISTENCIA.setForeground(new java.awt.Color(255, 255, 255));
        txtDIA_REGISTROASISTENCIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtDIA_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* ejem: Lunes, Martes, etc...");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txtHora.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(27, 27, 27));
        txtHora.setText("00:00:00");
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 20, 10));

        txtFecha.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(27, 27, 27));
        txtFecha.setText("DD/MM/YYYY");
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 20, 20));

        btnMODIFICAR_REGISTROASISTENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnMODIFICAR_REGISTROASISTENCIA.setContentAreaFilled(false);
        btnMODIFICAR_REGISTROASISTENCIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar-Gris.png"))); // NOI18N
        btnMODIFICAR_REGISTROASISTENCIA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar-Negro.png"))); // NOI18N
        jPanel2.add(btnMODIFICAR_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 80, 30));

        btnLIMPIAR_REGISTROASISTENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btnLIMPIAR_REGISTROASISTENCIA.setContentAreaFilled(false);
        btnLIMPIAR_REGISTROASISTENCIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar-Gris.png"))); // NOI18N
        btnLIMPIAR_REGISTROASISTENCIA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar-Negro.png"))); // NOI18N
        jPanel2.add(btnLIMPIAR_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 80, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtBUSCAR_REGISTROASISTENCIA.setBackground(new java.awt.Color(27, 27, 27));
        txtBUSCAR_REGISTROASISTENCIA.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtBUSCAR_REGISTROASISTENCIA.setForeground(new java.awt.Color(255, 255, 255));
        txtBUSCAR_REGISTROASISTENCIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtBUSCAR_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, -1));

        txtID_REGISTROASISTENCIA.setBackground(new java.awt.Color(27, 27, 27));
        txtID_REGISTROASISTENCIA.setForeground(new java.awt.Color(255, 255, 255));
        txtID_REGISTROASISTENCIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(txtID_REGISTROASISTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 20));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPERSONAL_REGISTROASISTENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPERSONAL_REGISTROASISTENCIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPERSONAL_REGISTROASISTENCIAActionPerformed

    private void tblLISTA_REGISTROASISTENCIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLISTA_REGISTROASISTENCIAMouseClicked
        if (evt.getSource() == tblLISTA_REGISTROASISTENCIA) {
            int fila = tblLISTA_REGISTROASISTENCIA.rowAtPoint(evt.getPoint());
            txtID_REGISTROASISTENCIA.setText(tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 0).toString());
            cbxPERSONAL_REGISTROASISTENCIA.setSelectedItem(tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 1).toString());
            txtDIA_REGISTROASISTENCIA.setText(tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 2).toString());
        }  
    }//GEN-LAST:event_tblLISTA_REGISTROASISTENCIAMouseClicked

    private void btnAGREGAR_REGISTROASISTENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGAR_REGISTROASISTENCIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAGREGAR_REGISTROASISTENCIAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem JASISTENCIA_ASISTIO;
    public javax.swing.JMenuItem JASISTENCIA_FALTO;
    public javax.swing.JMenuItem JASISTENCIA_TARDANZA;
    public javax.swing.JMenuItem JASISTNCIA_JUSTIFICADO;
    public javax.swing.JButton btnAGREGAR_REGISTROASISTENCIA;
    public javax.swing.JButton btnLIMPIAR_REGISTROASISTENCIA;
    public javax.swing.JButton btnMODIFICAR_REGISTROASISTENCIA;
    public javax.swing.JComboBox<String> cbxPERSONAL_REGISTROASISTENCIA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPopupMenu popupMENU_ASISTENCIA;
    public javax.swing.JTable tblLISTA_REGISTROASISTENCIA;
    public javax.swing.JTextField txtBUSCAR_REGISTROASISTENCIA;
    public javax.swing.JTextField txtDIA_REGISTROASISTENCIA;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JLabel txtHora;
    public javax.swing.JTextField txtID_REGISTROASISTENCIA;
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
