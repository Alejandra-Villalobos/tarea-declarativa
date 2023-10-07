/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class Mapa extends javax.swing.JFrame {

    //imagenes de localidades y calles
    private Map<String, JLabel> lugarImagenes = new HashMap<>();//lista de imagens de los lugares
    //lista para guardar la ruta generada  
    private ArrayList<String> listaRutas = new ArrayList<>();//lista que contiene los lugares que componen la ruta
    
    public Mapa() {
        initComponents();
        
        //localidades
        lugarImagenes.put("uca", ucaImg);
        lugarImagenes.put("hotel_capital",hotelImg);
        lugarImagenes.put("hospital_el_salvador", hospitalImg);
        lugarImagenes.put("centro_comercial_bambu",CCBambuImg );
        lugarImagenes.put("colegio_highlands", colegioHighlandsImg);
        lugarImagenes.put("instituto_tecnico_emiliani", institutoEmilianiImg);
        lugarImagenes.put("multiplaza", multiplazaImg);
        lugarImagenes.put("las_cascadas", lasCascadasImg);
        lugarImagenes.put("centro_comercial_feria_rosa", ccFeriaRosaImg);
        lugarImagenes.put("colegio_augusto_walte", ColegioWalteImg);
        lugarImagenes.put("la_casa_de_los_vestidos", casaDeLoVestidosImg);
        lugarImagenes.put("uno_la_sultana", unoSultanaImg);
        lugarImagenes.put("escuela_alemana", escuelaAlemanaImg);
        lugarImagenes.put("mcdonalds", escuelaMilitarImg);
        lugarImagenes.put("cancha_coopefa", canchaCoopefaImg);
        lugarImagenes.put("uno_las_lomas", unoLasLomasImg);
        lugarImagenes.put("bally_sports_center", ballySportsImg);
        lugarImagenes.put("texaco_coopefa", texacoCoopefaImg);
        lugarImagenes.put("veterinaria_santa_fe", veterinariaSantaFeImg);
        lugarImagenes.put("dollar_city", parqueDePelotasImg);
        lugarImagenes.put("parque_lomas_san_francisco", parqueLomasDeSanFranciscoimg);
        lugarImagenes.put("veterinaria_san_francisco", veterinariaSanFranciscoImg);
        lugarImagenes.put("centro_comercial_las_acacias", cc_acaciasImg);
        lugarImagenes.put("gambeta_los_proceres", gambetaLosProceresImg);
        lugarImagenes.put("texaco_loma_linda", texacoLomaLindaImg);
        lugarImagenes.put("estadio_cuscatlan", estadioCuscatlanImg);
        
        //calles
        lugarImagenes.put("blvr_sergio_viera_de_mello",blvrSergioVieraImg);
        lugarImagenes.put("av_de_la_revolucion",avRecolucionariaImg );
        lugarImagenes.put("alameda_manuel_enrique_araujo_3", enriqueAraujo3Img);
        
        ocultarRutas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lasCascadasImg = new javax.swing.JLabel();
        hospitalImg = new javax.swing.JLabel();
        ucaImg = new javax.swing.JLabel();
        hotelImg = new javax.swing.JLabel();
        enriqueAraujo3Img = new javax.swing.JLabel();
        blvrSergioVieraImg = new javax.swing.JLabel();
        avRecolucionariaImg = new javax.swing.JLabel();
        CCBambuImg = new javax.swing.JLabel();
        escuelaAlemanaImg = new javax.swing.JLabel();
        texacoCoopefaImg = new javax.swing.JLabel();
        escuelaMilitarImg = new javax.swing.JLabel();
        casaDeLoVestidosImg = new javax.swing.JLabel();
        ccFeriaRosaImg = new javax.swing.JLabel();
        colegioHighlandsImg = new javax.swing.JLabel();
        ColegioWalteImg = new javax.swing.JLabel();
        institutoEmilianiImg = new javax.swing.JLabel();
        canchaCoopefaImg = new javax.swing.JLabel();
        multiplazaImg = new javax.swing.JLabel();
        veterinariaSanFranciscoImg = new javax.swing.JLabel();
        veterinariaSantaFeImg = new javax.swing.JLabel();
        unoLasLomasImg = new javax.swing.JLabel();
        ballySportsImg = new javax.swing.JLabel();
        unoSultanaImg = new javax.swing.JLabel();
        parqueLomasDeSanFranciscoimg = new javax.swing.JLabel();
        estadioCuscatlanImg = new javax.swing.JLabel();
        texacoLomaLindaImg = new javax.swing.JLabel();
        gambetaLosProceresImg = new javax.swing.JLabel();
        cc_acaciasImg = new javax.swing.JLabel();
        parqueDePelotasImg = new javax.swing.JLabel();
        acaciasToggle = new javax.swing.JToggleButton();
        feriaRosaToggle = new javax.swing.JToggleButton();
        vestidosToggle = new javax.swing.JToggleButton();
        cascadasToggle = new javax.swing.JToggleButton();
        multiplazaToggle = new javax.swing.JToggleButton();
        alemanaToggle = new javax.swing.JToggleButton();
        bambuToggle = new javax.swing.JToggleButton();
        militarToggle = new javax.swing.JToggleButton();
        emilianiToggle = new javax.swing.JToggleButton();
        highlandsToggle = new javax.swing.JToggleButton();
        ucaToggle = new javax.swing.JToggleButton();
        imagenMapa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textBoxP2 = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textBoxP1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rutaList = new java.awt.List();

        setTitle("Rutas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("home"); // NOI18N
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        lasCascadasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        lasCascadasImg.setToolTipText("Las Cascadas");
        getContentPane().add(lasCascadasImg);
        lasCascadasImg.setBounds(380, 530, 30, 40);
        lasCascadasImg.getAccessibleContext().setAccessibleDescription("");

        hospitalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        hospitalImg.setToolTipText("Hospital de El Salvador");
        getContentPane().add(hospitalImg);
        hospitalImg.setBounds(820, 220, 27, 50);

        ucaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ucaImg.setToolTipText("uca");
        getContentPane().add(ucaImg);
        ucaImg.setBounds(850, 440, 30, 40);

        hotelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        hotelImg.setToolTipText("hotel capital");
        getContentPane().add(hotelImg);
        hotelImg.setBounds(820, 370, 30, 50);

        enriqueAraujo3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/alamedaEnriqueAraujo3.png"))); // NOI18N
        enriqueAraujo3Img.setToolTipText("Alameda Manuel Enrique Araujo");
        getContentPane().add(enriqueAraujo3Img);
        enriqueAraujo3Img.setBounds(820, 270, 43, 20);

        blvrSergioVieraImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/blvrSergioViera.png"))); // NOI18N
        blvrSergioVieraImg.setToolTipText("Bulevar Sergio Viera");
        getContentPane().add(blvrSergioVieraImg);
        blvrSergioVieraImg.setBounds(740, 120, 100, 60);
        blvrSergioVieraImg.getAccessibleContext().setAccessibleDescription("");

        avRecolucionariaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/avLaRevolucion.png"))); // NOI18N
        avRecolucionariaImg.setToolTipText("Avenida la revolución");
        getContentPane().add(avRecolucionariaImg);
        avRecolucionariaImg.setBounds(730, 160, 110, 140);
        avRecolucionariaImg.getAccessibleContext().setAccessibleDescription("");

        CCBambuImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        CCBambuImg.setToolTipText("Centro comercial Bambu");
        getContentPane().add(CCBambuImg);
        CCBambuImg.setBounds(800, 80, 30, 40);

        escuelaAlemanaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        escuelaAlemanaImg.setToolTipText("Academia Alamena");
        getContentPane().add(escuelaAlemanaImg);
        escuelaAlemanaImg.setBounds(780, 450, 30, 40);

        texacoCoopefaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        texacoCoopefaImg.setToolTipText("Texaco Coopefa");
        getContentPane().add(texacoCoopefaImg);
        texacoCoopefaImg.setBounds(1010, 320, 30, 40);

        escuelaMilitarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        escuelaMilitarImg.setToolTipText("Escuela Militar Gerardo Barrios");
        getContentPane().add(escuelaMilitarImg);
        escuelaMilitarImg.setBounds(910, 230, 30, 40);

        casaDeLoVestidosImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        casaDeLoVestidosImg.setToolTipText("La casa de los vestidos");
        getContentPane().add(casaDeLoVestidosImg);
        casaDeLoVestidosImg.setBounds(900, 300, 30, 40);

        ccFeriaRosaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ccFeriaRosaImg.setToolTipText("Centro Comercial Feria Rosa");
        getContentPane().add(ccFeriaRosaImg);
        ccFeriaRosaImg.setBounds(790, 300, 30, 40);

        colegioHighlandsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        colegioHighlandsImg.setToolTipText("Colegio Highlands");
        getContentPane().add(colegioHighlandsImg);
        colegioHighlandsImg.setBounds(680, 310, 30, 40);

        ColegioWalteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ColegioWalteImg.setToolTipText("Colegio Augusto Walte");
        getContentPane().add(ColegioWalteImg);
        ColegioWalteImg.setBounds(630, 440, 30, 40);

        institutoEmilianiImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        institutoEmilianiImg.setToolTipText("Instituto Tecnico Emiliani");
        getContentPane().add(institutoEmilianiImg);
        institutoEmilianiImg.setBounds(640, 380, 30, 40);

        canchaCoopefaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        canchaCoopefaImg.setToolTipText("Cancha Coopefa");
        getContentPane().add(canchaCoopefaImg);
        canchaCoopefaImg.setBounds(990, 300, 30, 40);

        multiplazaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        multiplazaImg.setToolTipText("Multiplaza");
        getContentPane().add(multiplazaImg);
        multiplazaImg.setBounds(470, 480, 30, 40);

        veterinariaSanFranciscoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        veterinariaSanFranciscoImg.setToolTipText("Veterinaria San Francisco");
        getContentPane().add(veterinariaSanFranciscoImg);
        veterinariaSanFranciscoImg.setBounds(890, 530, 27, 40);

        veterinariaSantaFeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        veterinariaSantaFeImg.setToolTipText("Veterinaria Santa Fe");
        getContentPane().add(veterinariaSantaFeImg);
        veterinariaSantaFeImg.setBounds(1110, 300, 30, 40);

        unoLasLomasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        unoLasLomasImg.setToolTipText("Uno Las Lomas");
        getContentPane().add(unoLasLomasImg);
        unoLasLomasImg.setBounds(880, 510, 30, 40);

        ballySportsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ballySportsImg.setToolTipText("Bally Sports Center");
        getContentPane().add(ballySportsImg);
        ballySportsImg.setBounds(900, 440, 30, 40);

        unoSultanaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        unoSultanaImg.setToolTipText("Uno la Sultana");
        getContentPane().add(unoSultanaImg);
        unoSultanaImg.setBounds(720, 470, 30, 40);

        parqueLomasDeSanFranciscoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        parqueLomasDeSanFranciscoimg.setToolTipText("Parque Lomas San Francisco");
        getContentPane().add(parqueLomasDeSanFranciscoimg);
        parqueLomasDeSanFranciscoimg.setBounds(920, 450, 30, 40);

        estadioCuscatlanImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        estadioCuscatlanImg.setToolTipText("Estadio Cuscatlan");
        getContentPane().add(estadioCuscatlanImg);
        estadioCuscatlanImg.setBounds(1270, 410, 30, 40);

        texacoLomaLindaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        texacoLomaLindaImg.setToolTipText("Texaco Loma Linda");
        getContentPane().add(texacoLomaLindaImg);
        texacoLomaLindaImg.setBounds(1170, 510, 30, 40);

        gambetaLosProceresImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        gambetaLosProceresImg.setToolTipText("Gambeta los proceres");
        getContentPane().add(gambetaLosProceresImg);
        gambetaLosProceresImg.setBounds(1090, 440, 30, 40);

        cc_acaciasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        cc_acaciasImg.setToolTipText("Centro comercial Las Acacias");
        getContentPane().add(cc_acaciasImg);
        cc_acaciasImg.setBounds(1120, 570, 30, 40);

        parqueDePelotasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        parqueDePelotasImg.setToolTipText("Parque de pelotas");
        getContentPane().add(parqueDePelotasImg);
        parqueDePelotasImg.setBounds(950, 170, 30, 40);

        acaciasToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/acacias_icon.png"))); // NOI18N
        acaciasToggle.setAlignmentY(0.0F);
        acaciasToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acaciasToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acaciasToggleActionPerformed(evt);
            }
        });
        getContentPane().add(acaciasToggle);
        acaciasToggle.setBounds(1060, 550, 70, 80);

        feriaRosaToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/feria_rosa_icon.png"))); // NOI18N
        feriaRosaToggle.setAlignmentY(0.0F);
        feriaRosaToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feriaRosaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feriaRosaToggleActionPerformed(evt);
            }
        });
        getContentPane().add(feriaRosaToggle);
        feriaRosaToggle.setBounds(800, 300, 80, 80);

        vestidosToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/vestidos_icon.png"))); // NOI18N
        vestidosToggle.setAlignmentY(0.0F);
        vestidosToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vestidosToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vestidosToggleActionPerformed(evt);
            }
        });
        getContentPane().add(vestidosToggle);
        vestidosToggle.setBounds(910, 300, 80, 80);

        cascadasToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/cascadas_icon.png"))); // NOI18N
        cascadasToggle.setAlignmentY(0.0F);
        cascadasToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cascadasToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cascadasToggleActionPerformed(evt);
            }
        });
        getContentPane().add(cascadasToggle);
        cascadasToggle.setBounds(450, 410, 72, 80);

        multiplazaToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/multiplaza_icon.png"))); // NOI18N
        multiplazaToggle.setAlignmentY(0.0F);
        multiplazaToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplazaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplazaToggleActionPerformed(evt);
            }
        });
        getContentPane().add(multiplazaToggle);
        multiplazaToggle.setBounds(370, 460, 72, 80);

        alemanaToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/alemana_icon.png"))); // NOI18N
        alemanaToggle.setAlignmentY(0.0F);
        alemanaToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alemanaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemanaToggleActionPerformed(evt);
            }
        });
        getContentPane().add(alemanaToggle);
        alemanaToggle.setBounds(760, 450, 66, 80);

        bambuToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/bambu_icon.png"))); // NOI18N
        bambuToggle.setAlignmentY(0.0F);
        bambuToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bambuToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bambuToggleActionPerformed(evt);
            }
        });
        getContentPane().add(bambuToggle);
        bambuToggle.setBounds(740, 60, 72, 80);

        militarToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/militar_icon.png"))); // NOI18N
        militarToggle.setAlignmentY(0.0F);
        militarToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        militarToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                militarToggleActionPerformed(evt);
            }
        });
        getContentPane().add(militarToggle);
        militarToggle.setBounds(910, 220, 66, 80);

        emilianiToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/emiliani_icon.png"))); // NOI18N
        emilianiToggle.setAlignmentY(0.0F);
        emilianiToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emilianiToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emilianiToggleActionPerformed(evt);
            }
        });
        getContentPane().add(emilianiToggle);
        emilianiToggle.setBounds(580, 360, 66, 80);

        highlandsToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/highlands_icon.png"))); // NOI18N
        highlandsToggle.setAlignmentY(0.0F);
        highlandsToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        highlandsToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highlandsToggleActionPerformed(evt);
            }
        });
        getContentPane().add(highlandsToggle);
        highlandsToggle.setBounds(620, 270, 66, 80);

        ucaToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconos/uca_icon.png"))); // NOI18N
        ucaToggle.setAlignmentY(0.0F);
        ucaToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ucaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucaToggleActionPerformed(evt);
            }
        });
        getContentPane().add(ucaToggle);
        ucaToggle.setBounds(830, 460, 59, 60);

        imagenMapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mapa.png"))); // NOI18N
        imagenMapa.setIconTextGap(0);
        getContentPane().add(imagenMapa);
        imagenMapa.setBounds(340, 0, 1010, 690);

        jPanel1.setBackground(new java.awt.Color(76, 132, 255));
        jPanel1.setLayout(null);

        textBoxP2.setBackground(new java.awt.Color(76, 132, 255));
        textBoxP2.setForeground(new java.awt.Color(145, 195, 255));
        textBoxP2.setText("punto de destino");
        textBoxP2.setBorder(null);
        jPanel1.add(textBoxP2);
        textBoxP2.setBounds(70, 90, 240, 30);

        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(145, 195, 255));
        BtnLimpiar.setText("Limpiar Mapa");
        BtnLimpiar.setBorder(null);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpiar);
        BtnLimpiar.setBounds(30, 200, 280, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/decoracionPuntoDeDestino.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 90, 27, 40);

        jSeparator1.setForeground(new java.awt.Color(145, 195, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(70, 120, 240, 20);

        BtnBuscar.setBackground(new java.awt.Color(145, 195, 255));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar ruta");
        BtnBuscar.setBorder(null);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar);
        BtnBuscar.setBounds(30, 150, 280, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ruta a seguir:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 270, 120, 30);

        textBoxP1.setBackground(new java.awt.Color(76, 132, 255));
        textBoxP1.setForeground(new java.awt.Color(145, 195, 255));
        textBoxP1.setText("punto de partida");
        textBoxP1.setToolTipText("");
        textBoxP1.setBorder(null);
        jPanel1.add(textBoxP1);
        textBoxP1.setBounds(70, 40, 270, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/decoracionPuntoDeInicio.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 27, 40);

        jSeparator2.setForeground(new java.awt.Color(145, 195, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(70, 70, 240, 20);

        rutaList.setBackground(new java.awt.Color(76, 132, 255));
        rutaList.setEnabled(false);
        rutaList.setForeground(new java.awt.Color(255, 255, 255));
        rutaList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaListActionPerformed(evt);
            }
        });
        jPanel1.add(rutaList);
        rutaList.setBounds(40, 300, 270, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ocultarRutas(){
        for (Map.Entry<String, JLabel> entry : lugarImagenes.entrySet()) {
            JLabel img = entry.getValue();           
            System.out.println("calue:" + img.getName());
            img.setVisible(false);
        }
        
    }
    
    public void mostrarLugares(String lugar){
        JLabel imagen = lugarImagenes.get(lugar);
        if (imagen != null) {
            imagen.setVisible(true);
        }
    }
    
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        rutaList.removeAll();

        String t1 = "consult('tarea1.pl')";
        Query q1 = new Query(t1);

        if (!q1.hasSolution()) {
            System.out.println("Base de conocimiento no encontrada");
        } else {
            System.out.println("Base de conocimiento encontrada!");
            System.out.println("________________________________");

            String lugar1 = textBoxP1.getText(); //textBox punto de partida
            String lugar2 = textBoxP2.getText(); //textBox punto de destino

            String t2 = "desde_hasta(" + lugar1 + "," + lugar2 + ", W)"; //consulta
            Query q2 = new Query(t2);//query

            while (q2.hasMoreSolutions()) {
                Map<String, Term> route = q2.nextSolution(); //obtener respuesta
                System.out.println("W = " + route.get("W"));
                var ruta = route.get("W").toString(); //obtener valor y convertirlo a string

                listaRutas.add(ruta);//agragar lugar a la lista
                rutaList.add(ruta);//agregar a la lista de la interfaz
                mostrarLugares(ruta);//mostrar las imagenes de los lugares seleccionados
            }
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void rutaListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaListActionPerformed
    }//GEN-LAST:event_rutaListActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        ocultarRutas();
        listaRutas.clear();
        rutaList.removeAll();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void ucaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucaToggleActionPerformed
        validate(ucaToggle, "uca");

    }//GEN-LAST:event_ucaToggleActionPerformed

    private void highlandsToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highlandsToggleActionPerformed
        validate(highlandsToggle, "colegio_highlands");
    }//GEN-LAST:event_highlandsToggleActionPerformed

    private void emilianiToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emilianiToggleActionPerformed
        validate(emilianiToggle, "instituto_tecnico_emiliani");
    }//GEN-LAST:event_emilianiToggleActionPerformed

    private void alemanaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemanaToggleActionPerformed
        validate(alemanaToggle, "escuela_alemana");
    }//GEN-LAST:event_alemanaToggleActionPerformed

    private void militarToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_militarToggleActionPerformed
        validate(militarToggle, "escuela_militar");
    }//GEN-LAST:event_militarToggleActionPerformed

    private void bambuToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bambuToggleActionPerformed
        validate(bambuToggle, "centro_comercial_bambu");
    }//GEN-LAST:event_bambuToggleActionPerformed

    private void multiplazaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplazaToggleActionPerformed
        validate(multiplazaToggle, "multiplaza");
    }//GEN-LAST:event_multiplazaToggleActionPerformed

    private void cascadasToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cascadasToggleActionPerformed
        validate(cascadasToggle, "las_cascadas");
    }//GEN-LAST:event_cascadasToggleActionPerformed

    private void vestidosToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vestidosToggleActionPerformed
        validate(vestidosToggle, "la_casa_de_los_vestidos");
    }//GEN-LAST:event_vestidosToggleActionPerformed

    private void feriaRosaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feriaRosaToggleActionPerformed
        validate(feriaRosaToggle, "centro_comercial_feria_rosa");
    }//GEN-LAST:event_feriaRosaToggleActionPerformed

    private void acaciasToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acaciasToggleActionPerformed
        validate(acaciasToggle, "centro_comercial_las_acacias");
    }//GEN-LAST:event_acaciasToggleActionPerformed

    private void validate(javax.swing.JToggleButton button, String place){
        if(textBoxP1.getText().equals("punto de partida") && button.isSelected())
            textBoxP1.setText(place); 
        else if(textBoxP2.getText().equals("punto de destino") && button.isSelected())
            textBoxP2.setText(place);
        else if(textBoxP1.getText().equals(place) && !button.isSelected())
            textBoxP1.setText("punto de partida");
        else if(textBoxP2.getText().equals(place) && !button.isSelected())
            textBoxP2.setText("punto de destino");
        else
            button.setSelected(false);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JLabel CCBambuImg;
    private javax.swing.JLabel ColegioWalteImg;
    private javax.swing.JToggleButton acaciasToggle;
    private javax.swing.JToggleButton alemanaToggle;
    private javax.swing.JLabel avRecolucionariaImg;
    private javax.swing.JLabel ballySportsImg;
    private javax.swing.JToggleButton bambuToggle;
    private javax.swing.JLabel blvrSergioVieraImg;
    private javax.swing.JLabel canchaCoopefaImg;
    private javax.swing.JLabel casaDeLoVestidosImg;
    private javax.swing.JToggleButton cascadasToggle;
    private javax.swing.JLabel ccFeriaRosaImg;
    private javax.swing.JLabel cc_acaciasImg;
    private javax.swing.JLabel colegioHighlandsImg;
    private javax.swing.JToggleButton emilianiToggle;
    private javax.swing.JLabel enriqueAraujo3Img;
    private javax.swing.JLabel escuelaAlemanaImg;
    private javax.swing.JLabel escuelaMilitarImg;
    private javax.swing.JLabel estadioCuscatlanImg;
    private javax.swing.JToggleButton feriaRosaToggle;
    private javax.swing.JLabel gambetaLosProceresImg;
    private javax.swing.JToggleButton highlandsToggle;
    private javax.swing.JLabel hospitalImg;
    private javax.swing.JLabel hotelImg;
    private javax.swing.JLabel imagenMapa;
    private javax.swing.JLabel institutoEmilianiImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lasCascadasImg;
    private javax.swing.JToggleButton militarToggle;
    private javax.swing.JLabel multiplazaImg;
    private javax.swing.JToggleButton multiplazaToggle;
    private javax.swing.JLabel parqueDePelotasImg;
    private javax.swing.JLabel parqueLomasDeSanFranciscoimg;
    private java.awt.List rutaList;
    private javax.swing.JLabel texacoCoopefaImg;
    private javax.swing.JLabel texacoLomaLindaImg;
    private javax.swing.JTextField textBoxP1;
    private javax.swing.JTextField textBoxP2;
    private javax.swing.JLabel ucaImg;
    private javax.swing.JToggleButton ucaToggle;
    private javax.swing.JLabel unoLasLomasImg;
    private javax.swing.JLabel unoSultanaImg;
    private javax.swing.JToggleButton vestidosToggle;
    private javax.swing.JLabel veterinariaSanFranciscoImg;
    private javax.swing.JLabel veterinariaSantaFeImg;
    // End of variables declaration//GEN-END:variables
}
