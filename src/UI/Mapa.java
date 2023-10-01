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

    private Map<String, JLabel> lugarImagenes = new HashMap<>();//lista de imagens de los lugares

    
    public Mapa() {
        initComponents();
        
        lugarImagenes.put("uca", ucaImg);
        lugarImagenes.put("uca_calle", ucaCalleImg);
        lugarImagenes.put("hotel_capital",hotelImg);
        lugarImagenes.put("blvr_la_sultana",calleSultana3Img);
        ocultarRutas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBoxP1 = new javax.swing.JTextField();
        textBoxP2 = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        rutaList = new java.awt.List();
        ucaImg = new javax.swing.JLabel();
        hotelImg = new javax.swing.JLabel();
        ucaCalleImg = new javax.swing.JLabel();
        calleSultana3Img = new javax.swing.JLabel();
        imagenMapa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Rutas");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        textBoxP1.setForeground(new java.awt.Color(204, 204, 204));
        textBoxP1.setToolTipText("");
        textBoxP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(textBoxP1);
        textBoxP1.setBounds(30, 82, 270, 30);

        textBoxP2.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(textBoxP2);
        textBoxP2.setBounds(30, 122, 270, 30);

        BtnBuscar.setText("Buscar ruta");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar);
        BtnBuscar.setBounds(30, 170, 270, 30);

        rutaList.setBackground(new java.awt.Color(242, 242, 242));
        rutaList.setEnabled(false);
        rutaList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaListActionPerformed(evt);
            }
        });
        getContentPane().add(rutaList);
        rutaList.setBounds(30, 280, 270, 230);

        ucaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        ucaImg.setToolTipText("uca");
        getContentPane().add(ucaImg);
        ucaImg.setBounds(820, 390, 68, 60);

        hotelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/localizacion.png"))); // NOI18N
        hotelImg.setToolTipText("hotel capital");
        getContentPane().add(hotelImg);
        hotelImg.setBounds(778, 310, 80, 60);

        ucaCalleImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/ucaCalle.png"))); // NOI18N
        getContentPane().add(ucaCalleImg);
        ucaCalleImg.setBounds(770, 370, 60, 30);

        calleSultana3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagenesCalles/sultanaUcaHotel.png"))); // NOI18N
        getContentPane().add(calleSultana3Img);
        calleSultana3Img.setBounds(770, 350, 27, 33);

        imagenMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mapa.png"))); // NOI18N
        imagenMapa.setText("jLabel1");
        getContentPane().add(imagenMapa);
        imagenMapa.setBounds(330, 40, 960, 580);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Como llegar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 230, 20);

        jLabel2.setText("Ruta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 260, 120, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ocultarRutas(){
        for (Map.Entry<String, JLabel> entry : lugarImagenes.entrySet()) {
            JLabel img = entry.getValue();           
            System.out.println("calue:" + img.getName());
            img.setVisible(!img.isVisible());
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

            ArrayList<String> listaRutas = new ArrayList<>();//lista que contiene los lugares que componen la ruta

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
    private javax.swing.JLabel calleSultana3Img;
    private javax.swing.JLabel hotelImg;
    private javax.swing.JLabel imagenMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List rutaList;
    private javax.swing.JTextField textBoxP1;
    private javax.swing.JTextField textBoxP2;
    private javax.swing.JLabel ucaCalleImg;
    private javax.swing.JLabel ucaImg;
    // End of variables declaration//GEN-END:variables
}
