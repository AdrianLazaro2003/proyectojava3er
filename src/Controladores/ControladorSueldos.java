package Controladores;

import Clases.RegistroAsistencia;
import Clases.Sueldos;
import Clases.SueldosDAO;
import Clases.Tables;
import Vista.RegistrarSueldos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorSueldos  implements ActionListener, MouseListener, KeyListener {

    private Sueldos su;
    private SueldosDAO suDAO;
    private RegistrarSueldos vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorSueldos(Sueldos su, SueldosDAO suDAO, RegistrarSueldos vista) {
        this.su = su;
        this.suDAO = suDAO;
        this.vista = vista;
        
        this.vista.btnAGREGAR_REGISTROSUELDOS.addActionListener(this);
        this.vista.btnLIMPIAR_REGISTROSUELDOS.addActionListener(this);
        this.vista.btnMODIFICAR_REGISTROSUELDOS.addActionListener(this);
        this.vista.tblDATOS_REGISTROSUELDOS.addMouseListener(this);
        this.vista.txtBUSCAR_REGISTROSUELDOS1.addKeyListener(this);
        this.vista.txtTARDANZAS_REGISTROSUELDOS.addKeyListener(this);
        this.vista.txtFALTAS_REGISTROSUELDOS.addKeyListener(this);
        this.vista.txtJUSTIFICADAS_REGISTROSUELDOS.addKeyListener(this);
        this.vista.txtTOTAL.addKeyListener(this);
        listarSueldos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAGREGAR_REGISTROSUELDOS) {
            if (vista.txtDIA_REGISTROSUELDOS.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                su.setNombre(vista.cbxPERSONAL_REGISTROSUELDOS.getSelectedItem().toString());
                su.setDia(vista.txtDIA_REGISTROSUELDOS.getText());
                su.setFecha(vista.txtFecha.getText());
                su.setDia(vista.txtDIA_REGISTROSUELDOS.getText());
                su.setTardanzas(vista.txtTARDANZAS_REGISTROSUELDOS.getText());
                su.setFaltas(vista.txtFALTAS_REGISTROSUELDOS.getText());
                su.setJustificadas(vista.txtJUSTIFICADAS_REGISTROSUELDOS.getText());
                su.setTotal(vista.txtTOTAL.getText());

                if (suDAO.registrar(su)) {
                    limpiarTable();
                    listarSueldos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Guardado con exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar...");
                }
            }
        } else if (e.getSource() == vista.btnMODIFICAR_REGISTROSUELDOS) {
            if (vista.txtDIA_REGISTROSUELDOS.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                su.setNombre(vista.cbxPERSONAL_REGISTROSUELDOS.getSelectedItem().toString());
                su.setDia(vista.txtDIA_REGISTROSUELDOS.getText());
                su.setTardanzas(vista.txtTARDANZAS_REGISTROSUELDOS.getText());
                su.setFaltas(vista.txtFALTAS_REGISTROSUELDOS.getText());
                su.setJustificadas(vista.txtJUSTIFICADAS_REGISTROSUELDOS.getText());
                su.setId_sueldo(Integer.parseInt(vista.txtID_REGISTROSUELDOS.getText()));
                if (suDAO.modificar(su)) {
                    limpiarTable();
                    listarSueldos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Modificado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar...");
                }
            }
        } else {
            limpiar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txtBUSCAR_REGISTROSUELDOS1) {
            limpiarTable();
            listarSueldos();
        }
        
    }

    private void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void listarSueldos() {
       Tables color = new Tables();
        List<Sueldos> lista = suDAO.ListaSueldos(vista.txtBUSCAR_REGISTROSUELDOS1.getText());
        modelo = (DefaultTableModel) vista.tblDATOS_REGISTROSUELDOS.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_sueldo();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getFecha();
            ob[3] = lista.get(i).getDia();
            ob[4] = lista.get(i).getTardanzas();
            ob[5] = lista.get(i).getFaltas();
            ob[6] = lista.get(i).getJustificadas();
            ob[7] = lista.get(i).getTotal();
            modelo.addRow(ob);
        }
        vista.tblDATOS_REGISTROSUELDOS.setModel(modelo);
    }

    private void limpiar() {
        vista.cbxPERSONAL_REGISTROSUELDOS.setSelectedIndex(0);
        vista.txtDIA_REGISTROSUELDOS.setText("");
        vista.txtID_REGISTROSUELDOS.setText("");
        vista.txtFALTAS_REGISTROSUELDOS.setText("");
        vista.txtTARDANZAS_REGISTROSUELDOS.setText("");
        vista.txtJUSTIFICADAS_REGISTROSUELDOS.setText("");
    }
    
    
    
}
