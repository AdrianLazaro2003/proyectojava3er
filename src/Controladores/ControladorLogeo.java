package Controladores;

import Clases.Usuario;
import Clases.UsuarioDAO;
import VentanasNoticia.CampoVacio;
import VentanasNoticia.Incorrecto;
import Vista.Inicio;
import Vista.MenuSeleccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogeo implements ActionListener{

    private Usuario us;
    private UsuarioDAO uDAO;
    private Inicio loginInicio;

    public ControladorLogeo(Usuario us, UsuarioDAO uDAO, Inicio loginInicio) {
        this.us = us;
        this.uDAO = uDAO;
        this.loginInicio = loginInicio;
        this.loginInicio.btnIngresar.addActionListener(this);
        this.loginInicio.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginInicio.btnIngresar) {
            if (loginInicio.txtUsuario.getText().equals("")) {
                String .valueOf(loginInicio.txtContraseña.getPassword().equals(""));
                CampoVacio CV = new CampoVacio();
                CV.setVisible(true);
            }else{
                String Usuario = loginInicio.txtUsuario.getText();
                String Contraseña = String.valueOf(loginInicio.txtContraseña.getPassword());
                us= uDAO.login(Usuario, Contraseña);
                if (us.getUsuario() != null) {
                    MenuSeleccion MS = new MenuSeleccion();
                    MS.setVisible(true);
                    this.loginInicio.dispose();
                }else{
                    Incorrecto Inc = new Incorrecto();
                    Inc.setVisible(true);
                }
            }
        }
    }
    
    
    
}
