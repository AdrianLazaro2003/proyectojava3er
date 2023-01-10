package Clases;

import Vista.RegistrarSueldos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SueldosDAO {
    
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(Sueldos su) {
        String sql = "INSERT INTO registrar_sueldos(nombre,fecha,dia,tardanzas,faltas,justificadas,total) VALUES (?,?,?,?,?,?,?)";
        try {
            con= conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, su.getNombre());
            ps.setString(2, su.getFecha());
            ps.setString(3, su.getDia());
            ps.setString(4, su.getTardanzas());
            ps.setString(5, su.getFaltas());
            ps.setString(6, su.getJustificadas());
            ps.setString(7, su.getTotal());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
     public List ListaSueldos(String valor) {
        List<Sueldos> ListaUsers = new ArrayList();
        String sql = "SELECT * FROM registrar_sueldos ORDER BY total ASC";
        String buscar = "SELECT * FROM registrar_sueldos where id_sueldo LIKE '%"
                + valor + "%' OR nombre LIKE'%" + valor + "%'";
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
                Sueldos su = new Sueldos();
                su.setId_sueldo(rs.getInt("id_sueldo"));
                su.setNombre(rs.getString("nombre"));
                su.setFecha(rs.getString("fecha"));
                su.setDia(rs.getString("dia"));
                su.setTardanzas(rs.getString("tardanzas"));
                su.setFaltas(rs.getString("faltas"));
                su.setJustificadas(rs.getString("justificadas"));
                su.setTotal(rs.getString("total"));
                ListaUsers.add(su);
            }
        } catch (Exception e) {
        }
        return ListaUsers;
    }
    
    public boolean modificar(Sueldos su) { 
        String sql = "UPDATE registrar_sueldos SET nombre=?, dia=?, tardanzas=?, faltas=?, justificadas=?, total=?  where id_sueldo=?";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, su.getNombre());
            ps.setString(2, su.getDia());
            ps.setString(3, su.getTardanzas());
            ps.setString(4, su.getFaltas());
            ps.setString(5, su.getJustificadas());
            ps.setString(6, su.getTotal());
            ps.setInt(7, su.getId_sueldo());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
}
