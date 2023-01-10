package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RegistroComandasDAO {

    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(Comandas com) {
        String sql = "INSERT INTO registrar_comandas(Numero_Comanda,Nombre,direccion,Numero_Entradas,Entradas,Numero_Platos,"
                + "Platos,Numero_Bebidas,Bebidas,Descripcion) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            con= conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, com.getNumeroComanda());
            ps.setString(2, com.getNombre());
            ps.setString(3, com.getDireccion());
            ps.setString(4, com.getNumeroEntradas());
            ps.setString(5, com.getEntrada());
            ps.setString(6, com.getNumeroPlatos());
            ps.setString(7, com.getPlatos());
            ps.setString(8, com.getNumeroBebidas());
            ps.setString(9, com.getBebidas());
            ps.setString(10, com.getDescripcion());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
      public List ListaComanda(String valor) {
        List<Comandas> ListaUsers = new ArrayList();
        String sql = "SELECT * FROM registrar_comandas ORDER BY Descripcion ASC";
        String buscar = "SELECT * FROM registrar_comandas where Numero_Comanda LIKE '%"
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
                Comandas com = new Comandas();
                com.setId_comanda(rs.getInt("Id_comanda"));
                com.setNumeroComanda(rs.getInt("Numero_Comanda"));
                com.setNombre(rs.getString("Nombre"));
                com.setDireccion(rs.getString("direccion"));
                com.setNumeroEntradas(rs.getString("Numero_Entradas"));
                com.setEntrada(rs.getString("Entradas"));
                com.setNumeroPlatos(rs.getString("Numero_Platos"));
                com.setPlatos(rs.getString("Platos"));
                com.setNumeroBebidas(rs.getString("Numero_Bebidas"));
                com.setBebidas(rs.getString("Bebidas"));
                com.setDescripcion(rs.getString("Descripcion"));
                ListaUsers.add(com);
            }
        } catch (Exception e) {
        }
        return ListaUsers;
    }
    
        public boolean modificar(Comandas com) {
        String sql = "UPDATE registrar_comandas SET Numero_Comanda=?, Nombre=?, direccion=?, Numero_Entradas=?, Entradas=?"
                + ", Numero_Platos=?, Platos=?, Numero_Bebidas=?, Bebidas=?, Descripcion=? where Id_comanda=?";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, com.getNumeroComanda());
            ps.setString(2, com.getNombre());
            ps.setString(3, com.getDireccion());
            ps.setString(4, com.getNumeroEntradas());   
            ps.setString(5, com.getEntrada());
            ps.setString(6, com.getNumeroPlatos());
            ps.setString(7, com.getPlatos());
            ps.setString(8, com.getNumeroBebidas());
            ps.setString(9, com.getBebidas());
            ps.setString(10, com.getDescripcion());
            ps.setInt(11, com.getId_comanda());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
