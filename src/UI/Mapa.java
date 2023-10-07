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
        lugarImagenes.put("calle_uca",ucaCalleImg);
        lugarImagenes.put("blvr_sergio_viera_de_mello",blvrSergioVieraImg);
        lugarImagenes.put("av_de_la_revolucion",avRecolucionariaImg );
        lugarImagenes.put("av_las_mercedes_1",avLasMercedes1Img );
        lugarImagenes.put("av_las_mercedes_2",avLasMercedes2Img );
        lugarImagenes.put("calle_capitan_douglas_varela",calleDouglasVarelaImg );
        lugarImagenes.put("av_independecia_1",avIndependencia1Img );
        lugarImagenes.put("av_independecia_2",avIndependencia2Img );
        lugarImagenes.put("carretera_panamericana_1",carreteraPanamericana1Img );
        lugarImagenes.put("carretera_panamericana_2",carreteraPanamericana2Img );
        lugarImagenes.put("carretera_panamericana_3",carreteraPanamericana3Img );   
        lugarImagenes.put("alameda_manuel_enrique_araujo_1",manuelEnriqueAraujo1Img );
        lugarImagenes.put("alameda_manuel_enrique_araujo_2",manuelEnriqueAraujo2Img );
        lugarImagenes.put("alameda_manuel_enrique_araujo_3",manuelEnriqueAraujo3Img );
        lugarImagenes.put("alameda_manuel_enrique_araujo_4",manuelEnriqueAraujo4Img );
        lugarImagenes.put("av_de_la_revolucion",avRecolucionariaImg );
        lugarImagenes.put("blvr_sergio_viera_de_mello",blvrSergioVieraImg );
        lugarImagenes.put("calle_san_jeronimo_emiliani",calleSanJeronmoEmilianiImg );
        lugarImagenes.put("calle_antigua_ferrocarril",calleAntiguaFerrocarril );
        lugarImagenes.put("calle_del_mediterraneo_1",calleMediterraneo1Img );
        lugarImagenes.put("calle_del_mediterraneo_2",calleMediterraneo2Img );
        lugarImagenes.put("blvr_la_sultana_1",laSultana1Img );
        lugarImagenes.put("blvr_la_sultana_2",laSultana2Img );
        lugarImagenes.put("blvr_la_sultana_3",laSultana3Img );
        lugarImagenes.put("los_proceres_1",proceres1Img );
        lugarImagenes.put("los_proceres_2",proceres2Img );
        lugarImagenes.put("los_proceres_3",proceres3Img );
        lugarImagenes.put("los_proceres_4",proceres4Img );
        lugarImagenes.put("calle_jorge_dominguez",calleJorgeDominguezImg );
        lugarImagenes.put("colonia_general_arce",coloniaGeneralArceImg );
        lugarImagenes.put("av_albert_einstein_1",avAlbertEinstein1Img );
        lugarImagenes.put("av_albert_einstein_2",avAlbertEinstein2Img );
        lugarImagenes.put("av_albert_einstein_3",avAlbertEinstein3Img1 );
        lugarImagenes.put("c_n1_1",cn1_1 );
        lugarImagenes.put("c_n1_2",cn1_2Img );
        lugarImagenes.put("c_n1_3",cn1_3Img );
        lugarImagenes.put("c_n1_4",cn1_4Img );
        lugarImagenes.put("calle_antigua_a_huizucar_1",calleHuizucar1Img );
        lugarImagenes.put("calle_antigua_a_huizucar_2",calleHuizucar2Img );
        lugarImagenes.put("calle_antigua_a_huizucar_3",calleHuizucar3Img );
               
        ocultarRutas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lasCascadasImg = new javax.swing.JLabel();
        hospitalImg = new javax.swing.JLabel();
        ucaImg = new javax.swing.JLabel();
        hotelImg = new javax.swing.JLabel();
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
        carreteraPanamericana1Img = new javax.swing.JLabel();
        carreteraPanamericana2Img = new javax.swing.JLabel();
        carreteraPanamericana3Img = new javax.swing.JLabel();
        avLasMercedes2Img = new javax.swing.JLabel();
        avLasMercedes1Img = new javax.swing.JLabel();
        avIndependencia1Img = new javax.swing.JLabel();
        avIndependencia2Img = new javax.swing.JLabel();
        calleJorgeDominguezImg = new javax.swing.JLabel();
        calleDouglasVarelaImg = new javax.swing.JLabel();
        coloniaGeneralArceImg = new javax.swing.JLabel();
        ucaCalleImg = new javax.swing.JLabel();
        laSultana1Img = new javax.swing.JLabel();
        laSultana2Img = new javax.swing.JLabel();
        laSultana3Img = new javax.swing.JLabel();
        calleSanJeronmoEmilianiImg = new javax.swing.JLabel();
        calleAntiguaFerrocarril = new javax.swing.JLabel();
        calleMediterraneo2Img = new javax.swing.JLabel();
        calleMediterraneo1Img = new javax.swing.JLabel();
        avAlbertEinstein2Img = new javax.swing.JLabel();
        avAlbertEinstein3Img1 = new javax.swing.JLabel();
        avAlbertEinstein1Img = new javax.swing.JLabel();
        manuelEnriqueAraujo3Img = new javax.swing.JLabel();
        manuelEnriqueAraujo2Img = new javax.swing.JLabel();
        manuelEnriqueAraujo1Img = new javax.swing.JLabel();
        manuelEnriqueAraujo4Img = new javax.swing.JLabel();
        cn1_3Img = new javax.swing.JLabel();
        cn1_4Img = new javax.swing.JLabel();
        cn1_2Img = new javax.swing.JLabel();
        cn1_1 = new javax.swing.JLabel();
        calleHuizucar1Img = new javax.swing.JLabel();
        calleHuizucar2Img = new javax.swing.JLabel();
        calleHuizucar3Img = new javax.swing.JLabel();
        proceres4Img = new javax.swing.JLabel();
        proceres3Img = new javax.swing.JLabel();
        proceres2Img = new javax.swing.JLabel();
        proceres1Img = new javax.swing.JLabel();
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
        hotelImg.setBounds(800, 370, 30, 50);

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
        ccFeriaRosaImg.setBounds(800, 300, 30, 40);

        colegioHighlandsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        colegioHighlandsImg.setToolTipText("Colegio Highlands");
        getContentPane().add(colegioHighlandsImg);
        colegioHighlandsImg.setBounds(780, 260, 30, 40);

        ColegioWalteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ColegioWalteImg.setToolTipText("Colegio Augusto Walte");
        getContentPane().add(ColegioWalteImg);
        ColegioWalteImg.setBounds(630, 440, 30, 40);

        institutoEmilianiImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        institutoEmilianiImg.setToolTipText("Instituto Tecnico Emiliani");
        getContentPane().add(institutoEmilianiImg);
        institutoEmilianiImg.setBounds(673, 370, 27, 40);

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

        carreteraPanamericana1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/carreteraPanamericana1.png"))); // NOI18N
        carreteraPanamericana1Img.setToolTipText("Carretera panamericana");
        getContentPane().add(carreteraPanamericana1Img);
        carreteraPanamericana1Img.setBounds(390, 530, 110, 60);

        carreteraPanamericana2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/carreteraPanamericana2.png"))); // NOI18N
        carreteraPanamericana2Img.setToolTipText("Carretera Panamericana");
        getContentPane().add(carreteraPanamericana2Img);
        carreteraPanamericana2Img.setBounds(480, 420, 200, 120);

        carreteraPanamericana3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/carreteraPanamericana3.png"))); // NOI18N
        carreteraPanamericana3Img.setToolTipText("Carretera Panamericana");
        getContentPane().add(carreteraPanamericana3Img);
        carreteraPanamericana3Img.setBounds(670, 360, 60, 60);

        avLasMercedes2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_las_mercedes2.png"))); // NOI18N
        avLasMercedes2Img.setToolTipText("Calles Las Mercedes");
        getContentPane().add(avLasMercedes2Img);
        avLasMercedes2Img.setBounds(1040, 250, 40, 90);

        avLasMercedes1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_las_mercedes1.png"))); // NOI18N
        avLasMercedes1Img.setToolTipText("Calles Las Mercedes");
        getContentPane().add(avLasMercedes1Img);
        avLasMercedes1Img.setBounds(980, 180, 70, 80);

        avIndependencia1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/av_independecia_1.png"))); // NOI18N
        getContentPane().add(avIndependencia1Img);
        avIndependencia1Img.setBounds(930, 240, 120, 60);

        avIndependencia2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/av_independecia_2.png"))); // NOI18N
        getContentPane().add(avIndependencia2Img);
        avIndependencia2Img.setBounds(900, 270, 40, 90);

        calleJorgeDominguezImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_jorge_dominguez.png"))); // NOI18N
        getContentPane().add(calleJorgeDominguezImg);
        calleJorgeDominguezImg.setBounds(900, 340, 19, 16);

        calleDouglasVarelaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_capitan_douglas_varela.png"))); // NOI18N
        getContentPane().add(calleDouglasVarelaImg);
        calleDouglasVarelaImg.setBounds(1000, 320, 60, 27);

        coloniaGeneralArceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/colonia_general_arce.png"))); // NOI18N
        getContentPane().add(coloniaGeneralArceImg);
        coloniaGeneralArceImg.setBounds(1010, 340, 10, 20);

        ucaCalleImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/ucaCalle.png"))); // NOI18N
        getContentPane().add(ucaCalleImg);
        ucaCalleImg.setBounds(810, 430, 50, 30);

        laSultana1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/blvr la sultana 1.png"))); // NOI18N
        getContentPane().add(laSultana1Img);
        laSultana1Img.setBounds(720, 430, 100, 80);

        laSultana2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/blvr la sultana 2.png"))); // NOI18N
        getContentPane().add(laSultana2Img);
        laSultana2Img.setBounds(810, 410, 20, 30);

        laSultana3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/blvr la sultana 3.png"))); // NOI18N
        getContentPane().add(laSultana3Img);
        laSultana3Img.setBounds(820, 380, 15, 34);

        calleSanJeronmoEmilianiImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_san_jeronimo_emiliani.png"))); // NOI18N
        getContentPane().add(calleSanJeronmoEmilianiImg);
        calleSanJeronmoEmilianiImg.setBounds(640, 480, 30, 60);

        calleAntiguaFerrocarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_antigua_ferrocarril.png"))); // NOI18N
        getContentPane().add(calleAntiguaFerrocarril);
        calleAntiguaFerrocarril.setBounds(640, 500, 88, 43);

        calleMediterraneo2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/mediterraneo_2.png"))); // NOI18N
        getContentPane().add(calleMediterraneo2Img);
        calleMediterraneo2Img.setBounds(725, 490, 70, 50);

        calleMediterraneo1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/mediterraneo_1.png"))); // NOI18N
        getContentPane().add(calleMediterraneo1Img);
        calleMediterraneo1Img.setBounds(780, 520, 100, 50);

        avAlbertEinstein2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/albert_einstein_2.png"))); // NOI18N
        getContentPane().add(avAlbertEinstein2Img);
        avAlbertEinstein2Img.setBounds(890, 471, 20, 30);

        avAlbertEinstein3Img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/albert_einstein_3.png"))); // NOI18N
        getContentPane().add(avAlbertEinstein3Img1);
        avAlbertEinstein3Img1.setBounds(900, 390, 78, 90);

        avAlbertEinstein1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/albert_einstein_1.png"))); // NOI18N
        getContentPane().add(avAlbertEinstein1Img);
        avAlbertEinstein1Img.setBounds(870, 490, 30, 70);

        manuelEnriqueAraujo3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/alamedaEnriqueAraujo3.png"))); // NOI18N
        getContentPane().add(manuelEnriqueAraujo3Img);
        manuelEnriqueAraujo3Img.setBounds(800, 280, 30, 40);

        manuelEnriqueAraujo2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/alamedaEnriqueAraujo2.png"))); // NOI18N
        getContentPane().add(manuelEnriqueAraujo2Img);
        manuelEnriqueAraujo2Img.setBounds(790, 291, 20, 40);

        manuelEnriqueAraujo1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/alamedaEnriqueAraujo1.png"))); // NOI18N
        manuelEnriqueAraujo1Img.setToolTipText("Alameda Manuel Enrique Araujo");
        getContentPane().add(manuelEnriqueAraujo1Img);
        manuelEnriqueAraujo1Img.setBounds(730, 300, 60, 80);

        manuelEnriqueAraujo4Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/alamedaEnriqueAraujo4.png"))); // NOI18N
        manuelEnriqueAraujo4Img.setToolTipText("Alameda Manuel Enrique Araujo");
        getContentPane().add(manuelEnriqueAraujo4Img);
        manuelEnriqueAraujo4Img.setBounds(830, 170, 170, 130);

        cn1_3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/cn1_3.png"))); // NOI18N
        getContentPane().add(cn1_3Img);
        cn1_3Img.setBounds(950, 430, 170, 120);

        cn1_4Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/cn1_4.png"))); // NOI18N
        getContentPane().add(cn1_4Img);
        cn1_4Img.setBounds(1090, 390, 60, 100);

        cn1_2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/cn1_2.png"))); // NOI18N
        getContentPane().add(cn1_2Img);
        cn1_2Img.setBounds(910, 500, 40, 70);

        cn1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/cn1_1.png"))); // NOI18N
        getContentPane().add(cn1_1);
        cn1_1.setBounds(880, 554, 40, 20);

        calleHuizucar1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_huizucar1.png"))); // NOI18N
        getContentPane().add(calleHuizucar1Img);
        calleHuizucar1Img.setBounds(1140, 540, 40, 80);

        calleHuizucar2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_huizucar2.png"))); // NOI18N
        getContentPane().add(calleHuizucar2Img);
        calleHuizucar2Img.setBounds(1165, 440, 90, 120);

        calleHuizucar3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/calle_huizucar3.png"))); // NOI18N
        getContentPane().add(calleHuizucar3Img);
        calleHuizucar3Img.setBounds(1240, 370, 30, 69);

        proceres4Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/los_proceres4.png"))); // NOI18N
        getContentPane().add(proceres4Img);
        proceres4Img.setBounds(1132, 360, 130, 41);

        proceres3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/los_proceres3.png"))); // NOI18N
        getContentPane().add(proceres3Img);
        proceres3Img.setBounds(970, 380, 170, 30);

        proceres2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/los_proceres2.png"))); // NOI18N
        getContentPane().add(proceres2Img);
        proceres2Img.setBounds(830, 380, 140, 20);

        proceres1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/los_proceres1.png"))); // NOI18N
        getContentPane().add(proceres1Img);
        proceres1Img.setBounds(730, 370, 100, 20);

        imagenMapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mapa.png"))); // NOI18N
        imagenMapa.setToolTipText("");
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
        ocultarRutas();

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
    private javax.swing.JLabel avAlbertEinstein1Img;
    private javax.swing.JLabel avAlbertEinstein2Img;
    private javax.swing.JLabel avAlbertEinstein3Img1;
    private javax.swing.JLabel avIndependencia1Img;
    private javax.swing.JLabel avIndependencia2Img;
    private javax.swing.JLabel avLasMercedes1Img;
    private javax.swing.JLabel avLasMercedes2Img;
    private javax.swing.JLabel avRecolucionariaImg;
    private javax.swing.JLabel ballySportsImg;
    private javax.swing.JLabel blvrSergioVieraImg;
    private javax.swing.JLabel calleAntiguaFerrocarril;
    private javax.swing.JLabel calleDouglasVarelaImg;
    private javax.swing.JLabel calleHuizucar1Img;
    private javax.swing.JLabel calleHuizucar2Img;
    private javax.swing.JLabel calleHuizucar3Img;
    private javax.swing.JLabel calleJorgeDominguezImg;
    private javax.swing.JLabel calleMediterraneo1Img;
    private javax.swing.JLabel calleMediterraneo2Img;
    private javax.swing.JLabel calleSanJeronmoEmilianiImg;
    private javax.swing.JLabel canchaCoopefaImg;
    private javax.swing.JLabel carreteraPanamericana1Img;
    private javax.swing.JLabel carreteraPanamericana2Img;
    private javax.swing.JLabel carreteraPanamericana3Img;
    private javax.swing.JLabel casaDeLoVestidosImg;
    private javax.swing.JLabel ccFeriaRosaImg;
    private javax.swing.JLabel cc_acaciasImg;
    private javax.swing.JLabel cn1_1;
    private javax.swing.JLabel cn1_2Img;
    private javax.swing.JLabel cn1_3Img;
    private javax.swing.JLabel cn1_4Img;
    private javax.swing.JLabel colegioHighlandsImg;
    private javax.swing.JLabel coloniaGeneralArceImg;
    private javax.swing.JLabel escuelaAlemanaImg;
    private javax.swing.JLabel escuelaMilitarImg;
    private javax.swing.JLabel estadioCuscatlanImg;
    private javax.swing.JLabel gambetaLosProceresImg;
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
    private javax.swing.JLabel laSultana1Img;
    private javax.swing.JLabel laSultana2Img;
    private javax.swing.JLabel laSultana3Img;
    private javax.swing.JLabel lasCascadasImg;
    private javax.swing.JLabel manuelEnriqueAraujo1Img;
    private javax.swing.JLabel manuelEnriqueAraujo2Img;
    private javax.swing.JLabel manuelEnriqueAraujo3Img;
    private javax.swing.JLabel manuelEnriqueAraujo4Img;
    private javax.swing.JLabel multiplazaImg;
    private javax.swing.JLabel parqueDePelotasImg;
    private javax.swing.JLabel parqueLomasDeSanFranciscoimg;
    private javax.swing.JLabel proceres1Img;
    private javax.swing.JLabel proceres2Img;
    private javax.swing.JLabel proceres3Img;
    private javax.swing.JLabel proceres4Img;
    private java.awt.List rutaList;
    private javax.swing.JLabel texacoCoopefaImg;
    private javax.swing.JLabel texacoLomaLindaImg;
    private javax.swing.JTextField textBoxP1;
    private javax.swing.JTextField textBoxP2;
    private javax.swing.JLabel ucaCalleImg;
    private javax.swing.JLabel ucaImg;
    private javax.swing.JLabel unoLasLomasImg;
    private javax.swing.JLabel unoSultanaImg;
    private javax.swing.JLabel veterinariaSanFranciscoImg;
    private javax.swing.JLabel veterinariaSantaFeImg;
    // End of variables declaration//GEN-END:variables
}
