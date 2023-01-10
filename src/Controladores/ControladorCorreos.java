package Controladores;

import Vista.EnviarCorreos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class ControladorCorreos implements ActionListener, MouseListener, KeyListener {

    EnviarCorreos vista;

    public ControladorCorreos(EnviarCorreos vista) {
        this.vista = vista;

        vista.btnENVIAR_ENVIARCORREOS.addActionListener(this);
        vista.btnLIMPIAR_ENVIARCORREOS.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnENVIAR_ENVIARCORREOS) {
            if (vista.txtRecibe.getText().equals("")
                    || vista.txtAsunto.getText().equals("")
                    || vista.txtMensaje.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
            Properties propiedad = new Properties();
            propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedad.setProperty("mail.smtp.starttls.enable", "true");
            propiedad.setProperty("mail.smtp.port", "587");
            propiedad.setProperty("mail.smtp.autht", "true");

            Session sesion = Session.getDefaultInstance(propiedad);
            String correoEnvia = "adrianchurrinhuamanlazaro@gmail.com";
            String contraseña = "Adrian_sam";
            String destinatario = vista.txtRecibe.getText();
            String asunto = vista.txtAsunto.getText();
            String mensaje = vista.txtMensaje.getText();

            MimeMessage mail = new MimeMessage(sesion);

            try {
                mail.setFrom(new InternetAddress(correoEnvia));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                mail.setSubject(asunto);
                mail.setText(mensaje);

                Transport transports = sesion.getTransport("smtp");
                transports.connect(correoEnvia, contraseña);
                transports.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                transports.close();

                JOptionPane.showMessageDialog(null, "Correo enviado");
            } catch (AddressException ex) {
                Logger.getLogger(ControladorCorreos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(ControladorCorreos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Limpiar();
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

    private void Limpiar() {
        vista.txtAsunto.setText("");
        vista.txtMensaje.setText("");
        vista.txtRecibe.setText("");
    }

}
