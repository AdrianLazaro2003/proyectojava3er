package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RegistroAsistenciaDAO {
    
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(RegistroAsistencia ra) {
        String sql = "INSERT INTO registrar_asistencia(Nombre,Dia,Fecha,Hora) VALUES (?,?,?,?)";
        try {
            con= conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ra.getNombre());
            ps.setString(2, ra.getDia());
            ps.setString(3, ra.getFecha());
            ps.setString(4, ra.getHora());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
      public List ListaAsistencia(String valor) {
        List<RegistroAsistencia> ListaUsers = new ArrayList();
        String sql = "SELECT * FROM registrar_asistencia ORDER BY Asistencia ASC";
        String buscar = "SELECT * FROM registrar_asistencia where id_asistencia LIKE '%"
                + valor + "%' OR Nombre LIKE'%" + valor + "%'";
        try {
            con = conec.getConnection();
            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                ps = con.prepareStatement(buscar);
                rs = ps.executeQuery();
            }

            while (rs.next()) {
                RegistroAsistencia ra = new RegistroAsistencia();
                ra.setId_asistencia(rs.getInt("id_asistencia"));
                ra.setNombre(rs.getString("Nombre"));
                ra.setDia(rs.getString("Dia"));
                ra.setFecha(rs.getString("Fecha"));
                ra.setHora(rs.getString("Hora"));
                ra.setAsistencia(rs.getString("Asistencia"));
                ListaUsers.add(ra);
            }
        } catch (Exception e) {
        }
        return ListaUsers;
    }
      
    public boolean modificar(RegistroAsistencia ra) { 
        String sql = "UPDATE registrar_asistencia SET Nombre=?, Dia=?  where id_asistencia=?";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ra.getNombre());
            ps.setString(2, ra.getDia());      
            ps.setInt(3, ra.getId_asistencia());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }   
    
    public boolean accion(String Asistencia, int id_asistencia) {
        String sql = "UPDATE registrar_asistencia SET Asistencia=? where id_asistencia=?";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Asistencia);
            ps.setInt(2, id_asistencia);
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
}
