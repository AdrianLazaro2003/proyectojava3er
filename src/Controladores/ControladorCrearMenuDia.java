package Controladores;

import Vista.CrearMenuDia;
import Vista.MenuSeleccionado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorCrearMenuDia implements ActionListener, MouseListener, KeyListener{

    private CrearMenuDia vista;

    public ControladorCrearMenuDia(CrearMenuDia vista) {
        this.vista = vista;
        
        this.vista.btnMostrar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnMostrar) {
            MenuSeleccionado MS = new MenuSeleccionado();
        MS.setVisible(true);

        String Mensaje = "                            **DON PIMENTÓN **\n"
                + "                                         Muy buen día Estimado cliente       \n"
                + "                      Nos complace compartir con usted nuestro menú del día.*\n"
                + "\n"
                + "                                               MEDIOS DE PAGO  \n"
                + "\n"
                + "-Efectivo.\n"
                + "-YAPE O PLIM: 949283669.\n"
                + "-Transferencia BCP, BBVA, INTERBANK.\n"
                + "-Aceptamos todas la tarjetas \n"
                + "(Visa, Mastercard, Américan Express, Diners Club) con un cargo adicional del 5%.\n"
                + "          \n"
                + "                                             * DELIVERY GRATIS *\n"
                + "          \n"
                + "                                        Tiempo Aproximado de Entrega\n"
                + "                                                      25-35 Min \n"
                + "                                              MENÚ ECONÓMICO\n"
                + "                                                   (Desde 8.00s/.)\n"
                + "                                                   VAMOS PERÚ \n";
        
        String Mensaje0 = "Entradas:  \n\n";

        if (vista.cheTequeños.isSelected()) {
            Mensaje0 = Mensaje0 + "Tequeños \n";
        }
        if (vista.cheSopa.isSelected()) {
            Mensaje0 = Mensaje0 + "Sopa de Moron \n";
        }
        if (vista.chePapa.isSelected()) {
            Mensaje0 = Mensaje0 + "Papa a la huancaina \n";
        }
        if (vista.cheEnsalada.isSelected()) {
            Mensaje0 = Mensaje0 + "Ensalada fresca \n";
        }
        if (vista.cheCrema.isSelected()) {
            Mensaje0 = Mensaje0 + "Crema de rocoto \n";
        }
        if (vista.cheCeviche.isSelected()) {
            Mensaje0 = Mensaje0 + "Ceviche \n";
        }
        if (vista.cheCazuela.isSelected()) {
            Mensaje0 = Mensaje0 + "Cazuela de pollo \n";
        }
        if (vista.cheBoli.isSelected()) {
            Mensaje0 = Mensaje0 + "Bolicausas con huancaina \n";
        }
        if (vista.cheAguadito.isSelected()) {
            Mensaje0 = Mensaje0 + "Sopa de aguadito \n";
        }

        String Separador= " \n\n";
        
        String Mensaje2 = "Platos de fondo:  \n\n";
        
        if (vista.CheAdoboPollo.isSelected()) {
            Mensaje2 = Mensaje2 + ("Adobo de pollo \n");
        }
        if (vista.CheAjiGallina.isSelected()) {
            Mensaje2 = Mensaje2 + ("Aji de gallina \n");
        }
        if (vista.CheArrozChancho.isSelected()) {
            Mensaje2 = Mensaje2 + ("Arroz con chancho \n");
        }
        if (vista.CheArrozCuabana.isSelected()) {
            Mensaje2 = Mensaje2 + ("Arroz a la cubana \n");
        }
        if (vista.CheArrozPollo.isSelected()) {
            Mensaje2 = Mensaje2 + ("Arroz con pollo \n");
        }
        if (vista.CheAsadoCarne.isSelected()) {
            Mensaje2 = Mensaje2 + ("Asado de carne con pure de papas \n");
        }
        if (vista.CheEstofado.isSelected()) {
            Mensaje2 = Mensaje2 + ("Estofado de pollo \n");
        }
        if (vista.CheHigado.isSelected()) {
            Mensaje2 = Mensaje2 + ("Higado a la plancha \n");
        }
        if (vista.CheMilanesaPollo.isSelected()) {
            Mensaje2 = Mensaje2 + ("Milanesa de pollo con papas fritas \n");
        }
        if (vista.CheMondonguito.isSelected()) {
            Mensaje2 = Mensaje2 + ("Mondonguito a la italiana \n");
        }
        if (vista.CheOlluquito.isSelected()) {
            Mensaje2 = Mensaje2 + ("Olluquito a lo pobre \n");
        }
        if (vista.ChePescadoFrito.isSelected()) {
            Mensaje2 = Mensaje2 + ("Pescado Frito \n");
        }
        if (vista.ChePicante.isSelected()) {
            Mensaje2 = Mensaje2 + ("Picante de carne con platano \n");
        }
        if (vista.ChePollada.isSelected()) {
            Mensaje2 = Mensaje2 + ("Pollada \n");
        }
        if (vista.ChePolloHorno.isSelected()) {
            Mensaje2 = Mensaje2 + ("Pollo al horno con ensalada rusa \n");
        }
        if (vista.ChePolloNorteña.isSelected()) {
            Mensaje2 = Mensaje2 + ("Pollo a la norteña con frejoles \n");
        }
        if (vista.CheSalchipapa.isSelected()) {
            Mensaje2 = Mensaje2 + ("Salchipapa clasica \n");
        }
        if (vista.CheSupremaPollo.isSelected()) {
            Mensaje2 = Mensaje2 + ("Suprema de pollo \n");
        }
        if (vista.CheTallarinesVerdes.isSelected()) {
            Mensaje2 = Mensaje2 + ("Tallarines verdes con filete de pollo \n");
        }
        if (vista.CheTortillaVerduras.isSelected()) {
            Mensaje2 = Mensaje2 + ("Tortilla de verduras \n");
        }
        
        String Mensaje3 = "Bebidas :  \n\n";
        
        if (vista.ChePepsi.isSelected()) {
            Mensaje3 = Mensaje3 + ("Pepsi 500ML \n");
        }
        if (vista.CheCocaCola.isSelected()) {
            Mensaje3 = Mensaje3 + ("Coca cola 500ML \n");
        }
        if (vista.CheIncaCola.isSelected()) {
            Mensaje3 = Mensaje3 + ("Inca cola 500ML \n");
        }
        
        MenuSeleccionado.txaMenu.setText(Mensaje + Mensaje0 + Separador + Mensaje2 + Separador + Mensaje3);
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
    }
    
}
