package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario login(String Usuario, String Contraseña){
        String sql = "Select * from login where Usuario=? and Contraseña=?";
        Usuario us = new Usuario();
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setUsuario(rs.getString("Usuario"));
                us.setContraseña(rs.getString("Contraseña"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
}
