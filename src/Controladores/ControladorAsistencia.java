package Controladores;

import Clases.RegistroAsistencia;
import Clases.RegistroAsistenciaDAO;
import Clases.Tables;
import Vista.RegistroDeAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorAsistencia implements ActionListener, MouseListener, KeyListener {

    private RegistroAsistencia ra;
    private RegistroAsistenciaDAO raDAO;
    private RegistroDeAsistencia vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorAsistencia(RegistroAsistencia ra, RegistroAsistenciaDAO raDAO, RegistroDeAsistencia vista) {
        this.ra = ra;
        this.raDAO = raDAO;
        this.vista = vista;

        this.vista.btnAGREGAR_REGISTROASISTENCIA.addActionListener(this);
        this.vista.btnMODIFICAR_REGISTROASISTENCIA.addActionListener(this);
        this.vista.btnLIMPIAR_REGISTROASISTENCIA.addActionListener(this);
        this.vista.JASISTENCIA_ASISTIO.addActionListener(this);
        this.vista.JASISTENCIA_FALTO.addActionListener(this);
        this.vista.JASISTENCIA_TARDANZA.addActionListener(this);
        this.vista.JASISTNCIA_JUSTIFICADO.addActionListener(this);
        this.vista.tblLISTA_REGISTROASISTENCIA.addMouseListener(this);
        this.vista.txtBUSCAR_REGISTROASISTENCIA.addKeyListener(this);
        listarAsistencia();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAGREGAR_REGISTROASISTENCIA) {
            if (vista.txtDIA_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                ra.setNombre(vista.cbxPERSONAL_REGISTROASISTENCIA.getSelectedItem().toString());
                ra.setDia(vista.txtDIA_REGISTROASISTENCIA.getText());
                ra.setFecha(vista.txtFecha.getText());
                ra.setHora(vista.txtHora.getText());

                if (raDAO.registrar(ra)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador registrado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar...");
                }
            }
        } else if (e.getSource() == vista.btnMODIFICAR_REGISTROASISTENCIA) {
            if (vista.txtDIA_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                ra.setNombre(vista.cbxPERSONAL_REGISTROASISTENCIA.getSelectedItem().toString());
                ra.setDia(vista.txtDIA_REGISTROASISTENCIA.getText());
                ra.setId_asistencia(Integer.parseInt(vista.txtID_REGISTROASISTENCIA.getText()));
                if (raDAO.modificar(ra)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador modificado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar...");
                }
            }
        } else if (e.getSource() == vista.JASISTENCIA_ASISTIO) {
            if (vista.txtID_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(vista.txtID_REGISTROASISTENCIA.getText());
                if (raDAO.accion("Asistio", id)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador registrado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar...");
                }
            }
        } else if (e.getSource() == vista.JASISTENCIA_FALTO) {
            if (vista.txtID_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(vista.txtID_REGISTROASISTENCIA.getText());
                if (raDAO.accion("Falto", id)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador registrado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar...");
                }
            }
        } else if (e.getSource() == vista.JASISTENCIA_TARDANZA) {
            if (vista.txtID_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(vista.txtID_REGISTROASISTENCIA.getText());
                if (raDAO.accion("Tardanza", id)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador registrado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar...");
                }
            }
        } else if (e.getSource() == vista.JASISTNCIA_JUSTIFICADO) {
            if (vista.txtID_REGISTROASISTENCIA.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(vista.txtID_REGISTROASISTENCIA.getText());
                if (raDAO.accion("Justificado", id)) {
                    limpiarTable();
                    listarAsistencia();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Trabajador registrado con Exito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar...");
                }
            }
        } else {
            limpiar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tblLISTA_REGISTROASISTENCIA) {
            int fila = vista.tblLISTA_REGISTROASISTENCIA.rowAtPoint(e.getPoint());
            vista.txtID_REGISTROASISTENCIA.setText(vista.tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 0).toString());
            vista.cbxPERSONAL_REGISTROASISTENCIA.setSelectedItem(vista.tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 1).toString());
            vista.txtDIA_REGISTROASISTENCIA.setText(vista.tblLISTA_REGISTROASISTENCIA.getValueAt(fila, 2).toString());
        }  
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
         if (e.getSource() == vista.txtBUSCAR_REGISTROASISTENCIA) {
            limpiarTable();
            listarAsistencia();
        }
    }

    private void limpiarTable() {
       for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void listarAsistencia() {
        Tables color = new Tables();
        List<RegistroAsistencia> lista = raDAO.ListaAsistencia(vista.txtBUSCAR_REGISTROASISTENCIA.getText());
        modelo = (DefaultTableModel) vista.tblLISTA_REGISTROASISTENCIA.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_asistencia();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getDia();
            ob[3] = lista.get(i).getFecha();
            ob[4] = lista.get(i).getHora();
            ob[5] = lista.get(i).getAsistencia();
            modelo.addRow(ob);
        }
        vista.tblLISTA_REGISTROASISTENCIA.setModel(modelo);
    }

    private void limpiar() {
        vista.cbxPERSONAL_REGISTROASISTENCIA.setSelectedIndex(0);
        vista.txtDIA_REGISTROASISTENCIA.setText("");
        vista.txtID_REGISTROASISTENCIA.setText("");
    }

}
