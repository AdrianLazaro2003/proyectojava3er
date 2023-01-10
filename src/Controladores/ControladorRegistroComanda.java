package Controladores;

import Clases.Comandas;
import Clases.RegistroComandasDAO;
import Vista.RegistrarComandas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistroComanda implements ActionListener, MouseListener, KeyListener {

    private Comandas coman;
    private RegistroComandasDAO comanDAO;
    private RegistrarComandas vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorRegistroComanda(Comandas coman, RegistroComandasDAO comanDAO, RegistrarComandas vista) {
        this.coman = coman;
        this.comanDAO = comanDAO;
        this.vista = vista;
        
        this.vista.btnMostrar_RegistarComandas.addActionListener(this);
        this.vista.btnModificar_RegistrarComanda.addActionListener(this);
        this.vista.btnLimpiar_RegistrarComandas.addActionListener(this);
        this.vista.tblListado_RegistrarComanda.addMouseListener(this);
        this.vista.txtBuscar_RegistrarComanda.addKeyListener(this);
        listarComanda();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnMostrar_RegistarComandas) {
            if (vista.txtComanda_RegistrarComanda.getText().equals("")
                    || vista.txtNombre_RegistrarComanda.getText().equals("")
                    || vista.txtDireccion_RegistrarComanda.getText().equals("")
                    || vista.txtCantEntradas_RegistrarComanda.getText().equals("")
                    || vista.txtCantPlatos_RegistrarComanda.getText().equals("")
                    || vista.txtCantBebidas_RegistrarComanda.getText().equals("")
                    || vista.txtDescrip_RegistrarComanda.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                coman.setNumeroComanda(Integer.parseInt(vista.txtComanda_RegistrarComanda.getText()));
                coman.setNombre(vista.txtNombre_RegistrarComanda.getText());
                coman.setDireccion(vista.txtDireccion_RegistrarComanda.getText());
                coman.setNumeroEntradas(vista.txtCantEntradas_RegistrarComanda.getText());
                coman.setEntrada(vista.cbxEntrada_RegistrarComanda.getSelectedItem().toString());
                coman.setNumeroPlatos(vista.txtCantPlatos_RegistrarComanda.getText());
                coman.setPlatos(vista.cbxPlato_RegistrarComanda.getSelectedItem().toString());
                coman.setNumeroBebidas(vista.txtCantBebidas_RegistrarComanda.getText());
                coman.setBebidas(vista.cbxBebidas_RegistrarComanda.getSelectedItem().toString());
                coman.setDescripcion(vista.txtDescrip_RegistrarComanda.getText());

                if (comanDAO.registrar(coman)) {
                    limpiarTable();
                    listarComanda();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registro");
                }
            }
        } else if (e.getSource() == vista.btnModificar_RegistrarComanda) {
            if (vista.txtComanda_RegistrarComanda.getText().equals("")
                    || vista.txtNombre_RegistrarComanda.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            } else {
                coman.setNumeroComanda(Integer.parseInt(vista.txtComanda_RegistrarComanda.getText()));
                coman.setNombre(vista.txtNombre_RegistrarComanda.getText());
                coman.setDireccion(vista.txtDireccion_RegistrarComanda.getText());
                coman.setNumeroEntradas(vista.txtCantEntradas_RegistrarComanda.getText());
                coman.setEntrada(vista.cbxEntrada_RegistrarComanda.getSelectedItem().toString());
                coman.setNumeroPlatos(vista.txtCantPlatos_RegistrarComanda.getText());
                coman.setPlatos(vista.cbxPlato_RegistrarComanda.getSelectedItem().toString());
                coman.setNumeroBebidas(vista.txtCantBebidas_RegistrarComanda.getText());
                coman.setBebidas(vista.cbxBebidas_RegistrarComanda.getSelectedItem().toString());
                coman.setDescripcion(vista.txtDescrip_RegistrarComanda.getText());
                coman.setId_comanda(Integer.parseInt(vista.txtID_RegistrarComanda.getText()));
                        
                if (comanDAO.modificar(coman)) {
                    limpiarTable();
                    listarComanda();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                }
            }
        }   else {
            limpiar();
        }
    }

    public void listarComanda() {
        List<Comandas> lista = comanDAO.ListaComanda(vista.txtBuscar_RegistrarComanda.getText());
        modelo = (DefaultTableModel) vista.tblListado_RegistrarComanda.getModel();
        Object[] ob = new Object[11];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_comanda();
            ob[1] = lista.get(i).getNumeroComanda();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getDireccion();
            ob[4] = lista.get(i).getNumeroEntradas();
            ob[5] = lista.get(i).getEntrada();
            ob[6] = lista.get(i).getNumeroPlatos();
            ob[7] = lista.get(i).getPlatos();
            ob[8] = lista.get(i).getNumeroBebidas();
            ob[9] = lista.get(i).getBebidas();
            ob[10] = lista.get(i).getDescripcion();
            modelo.addRow(ob);
        }
        vista.tblListado_RegistrarComanda.setModel(modelo);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tblListado_RegistrarComanda) {
           int fila = vista.tblListado_RegistrarComanda.rowAtPoint(e.getPoint());
            vista.txtID_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 0).toString());
            vista.txtComanda_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 1).toString());
           vista. txtNombre_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 2).toString());
           vista.txtDireccion_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 3).toString());
            vista.txtCantEntradas_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 4).toString());
            vista.cbxEntrada_RegistrarComanda.setSelectedItem(vista.tblListado_RegistrarComanda.getValueAt(fila, 5).toString());
            vista.txtCantPlatos_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 6).toString());
            vista.cbxPlato_RegistrarComanda.setSelectedItem(vista.tblListado_RegistrarComanda.getValueAt(fila, 7).toString());
            vista.txtCantBebidas_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 8).toString());
            vista.cbxBebidas_RegistrarComanda.setSelectedItem(vista.tblListado_RegistrarComanda.getValueAt(fila, 9).toString());
            vista.txtDescrip_RegistrarComanda.setText(vista.tblListado_RegistrarComanda.getValueAt(fila, 10).toString());
        }
        
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txtBuscar_RegistrarComanda) {
            limpiarTable();
            listarComanda();
        }
    }

    private void limpiar() {
        vista.txtComanda_RegistrarComanda.setText("");
        vista.txtNombre_RegistrarComanda.setText("");
        vista.txtDireccion_RegistrarComanda.setText("");
        vista.txtCantEntradas_RegistrarComanda.setText("");
        vista.cbxEntrada_RegistrarComanda.setSelectedIndex(0);
        vista.txtCantPlatos_RegistrarComanda.setText("");
        vista.cbxPlato_RegistrarComanda.setSelectedIndex(0);
        vista.txtCantBebidas_RegistrarComanda.setText("");
        vista.cbxBebidas_RegistrarComanda.setSelectedIndex(0);
        vista.txtDescrip_RegistrarComanda.setText("");
        vista.txtComanda_RegistrarComanda.grabFocus();
    }
    
}
