/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.ControladorCrearMenuDia;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DELL
 */
public class CrearMenuDia extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearMenuDia
     */
    public CrearMenuDia() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ControladorCrearMenuDia CCD = new ControladorCrearMenuDia(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cheTequeños = new javax.swing.JCheckBox();
        cheCrema = new javax.swing.JCheckBox();
        cheEnsalada = new javax.swing.JCheckBox();
        cheSopa = new javax.swing.JCheckBox();
        chePapa = new javax.swing.JCheckBox();
        CheArrozCuabana = new javax.swing.JCheckBox();
        cheBoli = new javax.swing.JCheckBox();
        CheSalchipapa = new javax.swing.JCheckBox();
        CheArrozPollo = new javax.swing.JCheckBox();
        cheAguadito = new javax.swing.JCheckBox();
        cheCazuela = new javax.swing.JCheckBox();
        cheCeviche = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CheTortillaVerduras = new javax.swing.JCheckBox();
        ChePescadoFrito = new javax.swing.JCheckBox();
        CheHigado = new javax.swing.JCheckBox();
        ChePollada = new javax.swing.JCheckBox();
        CheAjiGallina = new javax.swing.JCheckBox();
        CheSupremaPollo = new javax.swing.JCheckBox();
        CheMilanesaPollo = new javax.swing.JCheckBox();
        CheMondonguito = new javax.swing.JCheckBox();
        CheTallarinesVerdes = new javax.swing.JCheckBox();
        CheEstofado = new javax.swing.JCheckBox();
        CheAsadoCarne = new javax.swing.JCheckBox();
        ChePolloHorno = new javax.swing.JCheckBox();
        CheArrozChancho = new javax.swing.JCheckBox();
        CheOlluquito = new javax.swing.JCheckBox();
        CheAdoboPollo = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CheMaracuya = new javax.swing.JCheckBox();
        CheCebada = new javax.swing.JCheckBox();
        CheChicha = new javax.swing.JCheckBox();
        CheHierbaLuisa = new javax.swing.JCheckBox();
        CheManzana = new javax.swing.JCheckBox();
        CheCarambola = new javax.swing.JCheckBox();
        CheCocaCola = new javax.swing.JCheckBox();
        CheIncaCola = new javax.swing.JCheckBox();
        ChePepsi = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        ChePolloNorteña = new javax.swing.JCheckBox();
        btnMostrar = new javax.swing.JButton();
        ChePicante = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(27, 27, 27));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(927, 497));

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel3.setBackground(new java.awt.Color(27, 27, 27));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel3.setLayout(null);

        cheTequeños.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheTequeños.setForeground(new java.awt.Color(255, 255, 255));
        cheTequeños.setText("Tequeños");
        cheTequeños.setContentAreaFilled(false);
        cheTequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheTequeñosActionPerformed(evt);
            }
        });
        jPanel3.add(cheTequeños);
        cheTequeños.setBounds(30, 50, 100, 27);

        cheCrema.setBackground(new java.awt.Color(255, 255, 255));
        cheCrema.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheCrema.setForeground(new java.awt.Color(255, 255, 255));
        cheCrema.setText("Crema de rocoto");
        cheCrema.setContentAreaFilled(false);
        jPanel3.add(cheCrema);
        cheCrema.setBounds(30, 80, 140, 27);

        cheEnsalada.setBackground(new java.awt.Color(255, 255, 255));
        cheEnsalada.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheEnsalada.setForeground(new java.awt.Color(255, 255, 255));
        cheEnsalada.setText("Ensalada fresca");
        cheEnsalada.setContentAreaFilled(false);
        cheEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheEnsaladaActionPerformed(evt);
            }
        });
        jPanel3.add(cheEnsalada);
        cheEnsalada.setBounds(30, 110, 140, 27);

        cheSopa.setBackground(new java.awt.Color(255, 255, 255));
        cheSopa.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheSopa.setForeground(new java.awt.Color(255, 255, 255));
        cheSopa.setText("Sopa de Morón");
        cheSopa.setContentAreaFilled(false);
        jPanel3.add(cheSopa);
        cheSopa.setBounds(30, 140, 130, 27);

        chePapa.setBackground(new java.awt.Color(255, 255, 255));
        chePapa.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        chePapa.setForeground(new java.awt.Color(255, 255, 255));
        chePapa.setText("Papa a la huancaina");
        chePapa.setContentAreaFilled(false);
        jPanel3.add(chePapa);
        chePapa.setBounds(30, 170, 170, 27);

        CheArrozCuabana.setBackground(new java.awt.Color(255, 255, 255));
        CheArrozCuabana.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheArrozCuabana.setForeground(new java.awt.Color(255, 255, 255));
        CheArrozCuabana.setText("Arroz a la cubana");
        CheArrozCuabana.setContentAreaFilled(false);
        CheArrozCuabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheArrozCuabanaActionPerformed(evt);
            }
        });
        jPanel3.add(CheArrozCuabana);
        CheArrozCuabana.setBounds(260, 110, 141, 27);

        cheBoli.setBackground(new java.awt.Color(255, 255, 255));
        cheBoli.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheBoli.setForeground(new java.awt.Color(255, 255, 255));
        cheBoli.setText("Bolicausas con huancaina");
        cheBoli.setContentAreaFilled(false);
        cheBoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheBoliActionPerformed(evt);
            }
        });
        jPanel3.add(cheBoli);
        cheBoli.setBounds(30, 200, 200, 27);

        CheSalchipapa.setBackground(new java.awt.Color(255, 255, 255));
        CheSalchipapa.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheSalchipapa.setForeground(new java.awt.Color(255, 255, 255));
        CheSalchipapa.setText("Salchipapa clasica");
        CheSalchipapa.setContentAreaFilled(false);
        CheSalchipapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheSalchipapaActionPerformed(evt);
            }
        });
        jPanel3.add(CheSalchipapa);
        CheSalchipapa.setBounds(260, 80, 160, 27);

        CheArrozPollo.setBackground(new java.awt.Color(255, 255, 255));
        CheArrozPollo.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheArrozPollo.setForeground(new java.awt.Color(255, 255, 255));
        CheArrozPollo.setText("Arroz con pollo");
        CheArrozPollo.setContentAreaFilled(false);
        CheArrozPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheArrozPolloActionPerformed(evt);
            }
        });
        jPanel3.add(CheArrozPollo);
        CheArrozPollo.setBounds(260, 50, 150, 27);

        cheAguadito.setBackground(new java.awt.Color(255, 255, 255));
        cheAguadito.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheAguadito.setForeground(new java.awt.Color(255, 255, 255));
        cheAguadito.setText("Sopa de aguadito");
        cheAguadito.setContentAreaFilled(false);
        jPanel3.add(cheAguadito);
        cheAguadito.setBounds(260, 260, 150, 20);

        cheCazuela.setBackground(new java.awt.Color(255, 255, 255));
        cheCazuela.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheCazuela.setForeground(new java.awt.Color(255, 255, 255));
        cheCazuela.setText("Cazuela de pollo");
        cheCazuela.setContentAreaFilled(false);
        jPanel3.add(cheCazuela);
        cheCazuela.setBounds(30, 230, 140, 23);

        cheCeviche.setBackground(new java.awt.Color(255, 255, 255));
        cheCeviche.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        cheCeviche.setForeground(new java.awt.Color(255, 255, 255));
        cheCeviche.setText("Ceviche");
        cheCeviche.setContentAreaFilled(false);
        cheCeviche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheCevicheActionPerformed(evt);
            }
        });
        jPanel3.add(cheCeviche);
        cheCeviche.setBounds(30, 260, 90, 20);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Entradas:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 10, 130, 30);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Platos de fondo:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(260, 10, 160, 30);

        CheTortillaVerduras.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheTortillaVerduras.setForeground(new java.awt.Color(255, 255, 255));
        CheTortillaVerduras.setText("Tortilla de verduras");
        CheTortillaVerduras.setContentAreaFilled(false);
        jPanel3.add(CheTortillaVerduras);
        CheTortillaVerduras.setBounds(260, 140, 159, 27);

        ChePescadoFrito.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePescadoFrito.setForeground(new java.awt.Color(255, 255, 255));
        ChePescadoFrito.setText("Pescado frito");
        ChePescadoFrito.setContentAreaFilled(false);
        jPanel3.add(ChePescadoFrito);
        ChePescadoFrito.setBounds(260, 170, 113, 27);

        CheHigado.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheHigado.setForeground(new java.awt.Color(255, 255, 255));
        CheHigado.setText("Higado a la plancha");
        CheHigado.setContentAreaFilled(false);
        jPanel3.add(CheHigado);
        CheHigado.setBounds(260, 200, 157, 27);

        ChePollada.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePollada.setForeground(new java.awt.Color(255, 255, 255));
        ChePollada.setText("Pollada");
        ChePollada.setContentAreaFilled(false);
        jPanel3.add(ChePollada);
        ChePollada.setBounds(260, 230, 77, 27);

        CheAjiGallina.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheAjiGallina.setForeground(new java.awt.Color(255, 255, 255));
        CheAjiGallina.setText("Aji de gallina");
        CheAjiGallina.setContentAreaFilled(false);
        jPanel3.add(CheAjiGallina);
        CheAjiGallina.setBounds(730, 140, 115, 27);

        CheSupremaPollo.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheSupremaPollo.setForeground(new java.awt.Color(255, 255, 255));
        CheSupremaPollo.setText("Suprema de pollo");
        CheSupremaPollo.setContentAreaFilled(false);
        jPanel3.add(CheSupremaPollo);
        CheSupremaPollo.setBounds(730, 170, 141, 20);

        CheMilanesaPollo.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheMilanesaPollo.setForeground(new java.awt.Color(255, 255, 255));
        CheMilanesaPollo.setText("Milanesa de pollo\n con papas fritas");
        CheMilanesaPollo.setContentAreaFilled(false);
        jPanel3.add(CheMilanesaPollo);
        CheMilanesaPollo.setBounds(440, 50, 260, 27);

        CheMondonguito.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheMondonguito.setForeground(new java.awt.Color(255, 255, 255));
        CheMondonguito.setText("Mondonguito a la italiana");
        CheMondonguito.setContentAreaFilled(false);
        jPanel3.add(CheMondonguito);
        CheMondonguito.setBounds(440, 80, 210, 27);

        CheTallarinesVerdes.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheTallarinesVerdes.setForeground(new java.awt.Color(255, 255, 255));
        CheTallarinesVerdes.setText("Tallarines verdes con filete de pollo ");
        CheTallarinesVerdes.setContentAreaFilled(false);
        jPanel3.add(CheTallarinesVerdes);
        CheTallarinesVerdes.setBounds(440, 110, 280, 27);

        CheEstofado.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheEstofado.setForeground(new java.awt.Color(255, 255, 255));
        CheEstofado.setText("Estofado de pollo");
        CheEstofado.setContentAreaFilled(false);
        jPanel3.add(CheEstofado);
        CheEstofado.setBounds(440, 170, 160, 27);

        CheAsadoCarne.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheAsadoCarne.setForeground(new java.awt.Color(255, 255, 255));
        CheAsadoCarne.setText("Asado de carne con pure de papas");
        CheAsadoCarne.setContentAreaFilled(false);
        jPanel3.add(CheAsadoCarne);
        CheAsadoCarne.setBounds(440, 200, 260, 27);

        ChePolloHorno.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePolloHorno.setForeground(new java.awt.Color(255, 255, 255));
        ChePolloHorno.setText("Pollo al horno con ensalada rusa");
        ChePolloHorno.setContentAreaFilled(false);
        jPanel3.add(ChePolloHorno);
        ChePolloHorno.setBounds(440, 230, 260, 27);

        CheArrozChancho.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheArrozChancho.setForeground(new java.awt.Color(255, 255, 255));
        CheArrozChancho.setText("Arroz con chancho");
        CheArrozChancho.setContentAreaFilled(false);
        jPanel3.add(CheArrozChancho);
        CheArrozChancho.setBounds(730, 50, 160, 27);

        CheOlluquito.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheOlluquito.setForeground(new java.awt.Color(255, 255, 255));
        CheOlluquito.setText("Olluquito a lo pobre");
        CheOlluquito.setContentAreaFilled(false);
        jPanel3.add(CheOlluquito);
        CheOlluquito.setBounds(730, 80, 161, 27);

        CheAdoboPollo.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheAdoboPollo.setForeground(new java.awt.Color(255, 255, 255));
        CheAdoboPollo.setText("Adobo de pollo");
        CheAdoboPollo.setContentAreaFilled(false);
        jPanel3.add(CheAdoboPollo);
        CheAdoboPollo.setBounds(730, 110, 140, 27);

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Refrescos");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 10, 90, 33);

        CheMaracuya.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheMaracuya.setForeground(new java.awt.Color(255, 255, 255));
        CheMaracuya.setText("Jugó de maracuya");
        CheMaracuya.setContentAreaFilled(false);
        jPanel2.add(CheMaracuya);
        CheMaracuya.setBounds(20, 50, 145, 27);

        CheCebada.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheCebada.setForeground(new java.awt.Color(255, 255, 255));
        CheCebada.setText("Cebada");
        CheCebada.setContentAreaFilled(false);
        jPanel2.add(CheCebada);
        CheCebada.setBounds(190, 80, 77, 27);

        CheChicha.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheChicha.setForeground(new java.awt.Color(255, 255, 255));
        CheChicha.setText("Chicha morada");
        CheChicha.setContentAreaFilled(false);
        jPanel2.add(CheChicha);
        CheChicha.setBounds(190, 110, 130, 27);

        CheHierbaLuisa.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheHierbaLuisa.setForeground(new java.awt.Color(255, 255, 255));
        CheHierbaLuisa.setText("Hierba Luisa");
        CheHierbaLuisa.setContentAreaFilled(false);
        jPanel2.add(CheHierbaLuisa);
        CheHierbaLuisa.setBounds(190, 50, 120, 27);

        CheManzana.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheManzana.setForeground(new java.awt.Color(255, 255, 255));
        CheManzana.setText("Jugo de manzana");
        CheManzana.setContentAreaFilled(false);
        jPanel2.add(CheManzana);
        CheManzana.setBounds(20, 80, 150, 27);

        CheCarambola.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheCarambola.setForeground(new java.awt.Color(255, 255, 255));
        CheCarambola.setText("Jugo de carambola");
        CheCarambola.setContentAreaFilled(false);
        jPanel2.add(CheCarambola);
        CheCarambola.setBounds(20, 110, 160, 27);

        CheCocaCola.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        CheCocaCola.setText("Coca cola 500ml");
        CheCocaCola.setContentAreaFilled(false);
        jPanel2.add(CheCocaCola);
        CheCocaCola.setBounds(350, 50, 150, 23);

        CheIncaCola.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        CheIncaCola.setForeground(new java.awt.Color(255, 255, 255));
        CheIncaCola.setText("Inca cola 500ml");
        CheIncaCola.setContentAreaFilled(false);
        CheIncaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheIncaColaActionPerformed(evt);
            }
        });
        jPanel2.add(CheIncaCola);
        CheIncaCola.setBounds(350, 80, 140, 27);

        ChePepsi.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePepsi.setForeground(new java.awt.Color(255, 255, 255));
        ChePepsi.setText("Pepsi 500ml");
        ChePepsi.setContentAreaFilled(false);
        jPanel2.add(ChePepsi);
        ChePepsi.setBounds(350, 110, 120, 27);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bebidas");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(350, 10, 90, 33);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(20, 310, 540, 150);

        ChePolloNorteña.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePolloNorteña.setForeground(new java.awt.Color(255, 255, 255));
        ChePolloNorteña.setText("Pollo a la norteña con frejoles ");
        ChePolloNorteña.setContentAreaFilled(false);
        jPanel3.add(ChePolloNorteña);
        ChePolloNorteña.setBounds(440, 140, 231, 27);

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar-Gris.png"))); // NOI18N
        btnMostrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar-Negro.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar);
        btnMostrar.setBounds(800, 420, 80, 30);

        ChePicante.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        ChePicante.setForeground(new java.awt.Color(255, 255, 255));
        ChePicante.setText("Picante de carne con platano");
        ChePicante.setContentAreaFilled(false);
        jPanel3.add(ChePicante);
        ChePicante.setBounds(440, 260, 230, 27);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheIncaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheIncaColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheIncaColaActionPerformed

    private void cheTequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheTequeñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheTequeñosActionPerformed

    private void cheEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheEnsaladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheEnsaladaActionPerformed

    private void CheArrozCuabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheArrozCuabanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheArrozCuabanaActionPerformed

    private void cheBoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheBoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheBoliActionPerformed

    private void CheSalchipapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheSalchipapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheSalchipapaActionPerformed

    private void CheArrozPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheArrozPolloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheArrozPolloActionPerformed

    private void cheCevicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheCevicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheCevicheActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
         
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheAdoboPollo;
    public javax.swing.JCheckBox CheAjiGallina;
    public javax.swing.JCheckBox CheArrozChancho;
    public javax.swing.JCheckBox CheArrozCuabana;
    public javax.swing.JCheckBox CheArrozPollo;
    public javax.swing.JCheckBox CheAsadoCarne;
    public javax.swing.JCheckBox CheCarambola;
    public javax.swing.JCheckBox CheCebada;
    public javax.swing.JCheckBox CheChicha;
    public javax.swing.JCheckBox CheCocaCola;
    public javax.swing.JCheckBox CheEstofado;
    public javax.swing.JCheckBox CheHierbaLuisa;
    public javax.swing.JCheckBox CheHigado;
    public javax.swing.JCheckBox CheIncaCola;
    public javax.swing.JCheckBox CheManzana;
    public javax.swing.JCheckBox CheMaracuya;
    public javax.swing.JCheckBox CheMilanesaPollo;
    public javax.swing.JCheckBox CheMondonguito;
    public javax.swing.JCheckBox CheOlluquito;
    public javax.swing.JCheckBox ChePepsi;
    public javax.swing.JCheckBox ChePescadoFrito;
    public javax.swing.JCheckBox ChePicante;
    public javax.swing.JCheckBox ChePollada;
    public javax.swing.JCheckBox ChePolloHorno;
    public javax.swing.JCheckBox ChePolloNorteña;
    public javax.swing.JCheckBox CheSalchipapa;
    public javax.swing.JCheckBox CheSupremaPollo;
    public javax.swing.JCheckBox CheTallarinesVerdes;
    public javax.swing.JCheckBox CheTortillaVerduras;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JCheckBox cheAguadito;
    public javax.swing.JCheckBox cheBoli;
    public javax.swing.JCheckBox cheCazuela;
    public javax.swing.JCheckBox cheCeviche;
    public javax.swing.JCheckBox cheCrema;
    public javax.swing.JCheckBox cheEnsalada;
    public javax.swing.JCheckBox chePapa;
    public javax.swing.JCheckBox cheSopa;
    public javax.swing.JCheckBox cheTequeños;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}