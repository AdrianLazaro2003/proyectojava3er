package Controladores;

import Vista.CrearComandas;
import Vista.CrearMenuDia;
import Vista.EnviarCorreos;
import Vista.MenuSeleccion;
import Vista.RegistrarComandas;
import Vista.RegistrarSueldos;
import Vista.RegistroClientes;
import Vista.RegistroDeAsistencia;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorDashboard implements ActionListener, MouseListener, KeyListener {

    Color DefauColor, ClickedColor;
    private MenuSeleccion vista;

    public ControladorDashboard(Color DefauColor, Color ClickedColor, MenuSeleccion vista) {
        this.DefauColor = DefauColor;
        this.ClickedColor = ClickedColor;
        this.vista = vista;

        vista.btnSalir.addActionListener(this);
        
        vista.Menu1.addMouseListener(this);
        vista.Menu2.addMouseListener(this);
        vista.Menu3.addMouseListener(this);
        vista.Menu4.addMouseListener(this);
        vista.Menu5.addMouseListener(this);
        vista.Menu6.addMouseListener(this);
        vista.Menu7.addMouseListener(this);

        vista.txt1.addMouseListener(this);
        vista.txt2.addMouseListener(this);
        vista.txt3.addMouseListener(this);
        vista.txt4.addMouseListener(this);
        vista.txt5.addMouseListener(this);
        vista.txt6.addMouseListener(this);
        vista.txt7.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnSalir) {
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.Menu1) {
            CrearMenuDia CD = new CrearMenuDia();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(CD).setVisible(true);
        } else if (e.getSource() == vista.Menu2) {
            RegistrarComandas RC = new RegistrarComandas();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RC).setVisible(true);
        } else if (e.getSource() == vista.Menu3) {
            CrearComandas CC = new CrearComandas();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(CC).setVisible(true);
        } else if (e.getSource() == vista.Menu4) {
            RegistroDeAsistencia RA = new RegistroDeAsistencia();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RA).setVisible(true);
        } else if (e.getSource() == vista.Menu5) {
            RegistroClientes RC = new RegistroClientes();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RC).setVisible(true);
        } else if (e.getSource() == vista.Menu6) {
            RegistrarSueldos RS = new RegistrarSueldos();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RS).setVisible(true);
        } else if (e.getSource() == vista.Menu7) {
            EnviarCorreos EC = new EnviarCorreos();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(EC).setVisible(true);
        } else if (e.getSource() == vista.txt1) {
            CrearMenuDia CD = new CrearMenuDia();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(CD).setVisible(true);
        } else if (e.getSource() == vista.txt2) {
            RegistrarComandas RC = new RegistrarComandas();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RC).setVisible(true);
        } else if (e.getSource() == vista.txt3) {
            CrearComandas CC = new CrearComandas();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(CC).setVisible(true);
        } else if (e.getSource() == vista.txt4) {
            RegistroDeAsistencia RA = new RegistroDeAsistencia();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RA).setVisible(true);
        } else if (e.getSource() == vista.txt5) {
            RegistroClientes RC = new RegistroClientes();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RC).setVisible(true);
        } else if (e.getSource() == vista.txt6) {
            RegistrarSueldos RS = new RegistrarSueldos();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(RS).setVisible(true);
        } else if (e.getSource() == vista.txt7) {
            EnviarCorreos EC = new EnviarCorreos();
            vista.VentanaPanel.removeAll();
            vista.VentanaPanel.add(EC).setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == vista.Menu1) {
            vista.Menu1.setBackground(ClickedColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Crear menú del día");
            vista.txtSubTitulo.setText("Seleccionar diversos platos para cada día, mostrar carta y poder copiar para envio rapido");
        } else if (e.getSource() == vista.Menu2) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(ClickedColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registrar comandas");
            vista.txtSubTitulo.setText("Registrar comandas ya creadas en una tabla para mayor seguridad y accesibilidad a cualquier inconveniente");
        } else if (e.getSource() == vista.Menu3) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(ClickedColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Crear comandas");
            vista.txtSubTitulo.setText("Crear comandas para luego imprimirlas y ser enviadas");
        } else if (e.getSource() == vista.Menu4) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(ClickedColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registro de asistencia");
            vista.txtSubTitulo.setText("Registrar la asistencia de los empleados para gracias a esto tener un control mejor organizado");
        } else if (e.getSource() == vista.Menu5) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(ClickedColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registro de Clientes");
            vista.txtSubTitulo.setText("Registrar clientes con sus numeros y direcciones para tenerlos guardados en caso de perdida de contacto");
        } else if (e.getSource() == vista.Menu6) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(ClickedColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registrar sueldos");
            vista.txtSubTitulo.setText("Registrar sueldo, calcularlos y mostrarlos en una tabla");
        } else if (e.getSource() == vista.Menu7) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(ClickedColor);

            vista.txtTitulo.setText("Enviar correos");
            vista.txtSubTitulo.setText("Enviar mensajes mediante el correo de la empresa");
        }
        if (e.getSource() == vista.txt1) {
            vista.Menu1.setBackground(ClickedColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Crear menú del día");
            vista.txtSubTitulo.setText("Seleccionar diversos platos para cada día, mostrar carta y poder copiar para envio rapido");
        } else if (e.getSource() == vista.txt2) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(ClickedColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registrar comandas");
            vista.txtSubTitulo.setText("Registrar comandas ya creadas en una tabla para mayor seguridad y accesibilidad a cualquier inconveniente");
        } else if (e.getSource() == vista.txt3) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(ClickedColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Crear comandas");
            vista.txtSubTitulo.setText("Crear comandas para luego imprimirlas y ser enviadas");
        } else if (e.getSource() == vista.txt4) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(ClickedColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registro de asistencia");
            vista.txtSubTitulo.setText("Registrar la asistencia de los empleados para gracias a esto tener un control mejor organizado");
        } else if (e.getSource() == vista.txt5) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(ClickedColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registro de Clientes");
            vista.txtSubTitulo.setText("Registrar clientes con sus numeros y direcciones para tenerlos guardados en caso de perdida de contacto");
        } else if (e.getSource() == vista.txt6) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(ClickedColor);
            vista.Menu7.setBackground(DefauColor);

            vista.txtTitulo.setText("Registrar sueldos");
            vista.txtSubTitulo.setText("Registrar sueldo, calcularlos y mostrarlos en una tabla");
        } else if (e.getSource() == vista.txt7) {
            vista.Menu1.setBackground(DefauColor);
            vista.Menu2.setBackground(DefauColor);
            vista.Menu3.setBackground(DefauColor);
            vista.Menu4.setBackground(DefauColor);
            vista.Menu5.setBackground(DefauColor);
            vista.Menu6.setBackground(DefauColor);
            vista.Menu7.setBackground(ClickedColor);

            vista.txtTitulo.setText("Enviar correos");
            vista.txtSubTitulo.setText("Enviar mensajes mediante el correo de la empresa");
        }
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
    }

}
