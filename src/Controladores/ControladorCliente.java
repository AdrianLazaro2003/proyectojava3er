package Controladores;

import Clases.Cliente;
import Clases.ClienteDAO;
import Vista.RegistroClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorCliente implements ActionListener, MouseListener, KeyListener {

    private Cliente cl;
    private ClienteDAO clDAO;
    private RegistroClientes vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorCliente(Cliente cl, ClienteDAO clDAO, RegistroClientes vista) {
        this.cl = cl;
        this.clDAO = clDAO;
        this.vista = vista;

        this.vista.btnAGREGAR.addActionListener(this);
        this.vista.btnLIMPIAR.addActionListener(this);
        this.vista.btnMODIFICAR.addActionListener(this);
        this.vista.tblDATOS_REGISTROCLIENTES.addMouseListener(this);
        this.vista.txtBUSCAR.addKeyListener(this);
        listarClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnAGREGAR) {
            if (vista.txtNombre.getText().equals("")
                    || vista.txtTELEFONO.getText().equals("")
                    || vista.txtDIRECCION.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                cl.setNom(vista.txtNombre.getText());
                cl.setTel(vista.txtTELEFONO.getText());
                cl.setDir(vista.txtDIRECCION.getText());
                if (clDAO.registrar(cl)) {
                    limpiarTable();
                    listarClientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el Cliente...");
                }
            }
        } else if (e.getSource() == vista.btnMODIFICAR) {
            if (vista.txtNombre.getText().equals("")
                    || vista.txtTELEFONO.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                cl.setNom(vista.txtNombre.getText());
                cl.setTel(vista.txtTELEFONO.getText());
                cl.setDir(vista.txtDIRECCION.getText());
                cl.setId(Integer.parseInt(vista.txtId.getText()));
                if (clDAO.modificar(cl)) {
                    limpiarTable();
                    listarClientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente modificado con éxito...");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el Cliente...");
                }
            }    
        }else{
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
       if (e.getSource() == vista.txtBUSCAR) {
            limpiarTable();
            listarClientes();
        }
    }

    private void listarClientes() {
        List<Cliente> lista = clDAO.ListaClientes(vista.txtBUSCAR.getText());
        modelo = (DefaultTableModel) vista.tblDATOS_REGISTROCLIENTES.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNom();
            ob[2] = lista.get(i).getDir();
            ob[3] = lista.get(i).getTel();
            modelo.addRow(ob);
        }
        vista.tblDATOS_REGISTROCLIENTES.setModel(modelo);
    }

    private void limpiar() {
        vista.txtNombre.setText("");
        vista.txtTELEFONO.setText("");
        vista.txtDIRECCION.setText("");
        vista.txtId.setText("");
        vista.txtNombre.grabFocus();
    }

    private void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    

}
