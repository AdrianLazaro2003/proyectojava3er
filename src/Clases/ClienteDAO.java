
package Clases;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDAO {
    
    Conexion com = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
  public boolean registrar(Cliente cl) {
        String sql = "INSERT INTO cliente(nombre,direccion,telefono) VALUES (?,?,?)";
        try {
            con = com.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getDir());
            ps.setString(3, cl.getTel());          
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
   public List ListaClientes(String valor) {
        List<Cliente> ListaCliente = new ArrayList();
        String sql = "SELECT * FROM cliente ORDER BY telefono ASC";
        String buscar = "SELECT * FROM cliente where id_cliente LIKE '%"
                + valor + "%' OR nombre LIKE'%" + valor + "%'";
        try {
            con = com.getConnection();
            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                ps = con.prepareStatement(buscar);
                rs = ps.executeQuery();
            }

            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setId(rs.getInt("id_cliente"));
                cl.setNom(rs.getString("nombre"));
                cl.setDir(rs.getString("direccion"));  
                cl.setTel(rs.getString("telefono"));        
                ListaCliente.add(cl);
            }
        } catch (Exception e) {
        }
        return ListaCliente;
    }
  
    public boolean modificar(Cliente cl) { 
        String sql = "UPDATE cliente SET nombre=?, direccion=?, telefono=? where id_cliente=?";
        try {
            con = com.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getDir());
            ps.setString(3, cl.getTel());          
            ps.setInt(4, cl.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
}
