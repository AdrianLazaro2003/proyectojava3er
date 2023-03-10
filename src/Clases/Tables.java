package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Tables extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(
            JTable jtable, Object o, boolean bln, boolean bln1, int row, int col) {
        super.getTableCellRendererComponent(jtable, o, bln, bln1, row, col);
        if (jtable.getValueAt(row, col).toString().equals("Asistio")) {
            setBackground(Color.green);
            setForeground(Color.black);
        } else if (jtable.getValueAt(row, col).toString().equals("Falto")) {
            setBackground(Color.red);
            setForeground(Color.black);
        }else if (jtable.getValueAt(row, col).toString().equals("Tardanza")) {
            setBackground(Color.magenta);
            setForeground(Color.black);
        }else  {
            setBackground(Color. gray);
            setForeground(Color.black);
        }
        return this;
    }
    
}
