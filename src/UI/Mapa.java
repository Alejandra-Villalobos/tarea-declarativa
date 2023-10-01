/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class Mapa extends javax.swing.JFrame {

    public Mapa() {
        
        initComponents();
        ocultarRutas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        origenTextbox = new javax.swing.JTextField();
        destinoTextbox = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        rutaList = new java.awt.List();
        imgRutaUca = new javax.swing.JLabel();
        toggleVestidos = new javax.swing.JToggleButton();
        toggleHotel = new javax.swing.JToggleButton();
        toggleUCA = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();
        labelRuta = new javax.swing.JLabel();
        labelP1 = new javax.swing.JLabel();
        labelP2 = new javax.swing.JLabel();

        setTitle("Rutas");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        origenTextbox.setToolTipText("");
        getContentPane().add(origenTextbox);
        origenTextbox.setBounds(130, 90, 170, 22);
        getContentPane().add(destinoTextbox);
        destinoTextbox.setBounds(130, 130, 170, 22);

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
        rutaList.setBounds(30, 260, 270, 230);

        imgRutaUca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calle_uca.png"))); // NOI18N
        getContentPane().add(imgRutaUca);
        imgRutaUca.setBounds(910, 200, 70, 50);

        toggleVestidos.setText("La Casa de los Vestidos");
        toggleVestidos.setActionCommand("La Casa de\nlos Vestidos");
        toggleVestidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleVestidosActionPerformed(evt);
            }
        });
        getContentPane().add(toggleVestidos);
        toggleVestidos.setBounds(950, 50, 160, 30);

        toggleHotel.setText("Hotel Capital");
        toggleHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleHotelActionPerformed(evt);
            }
        });
        getContentPane().add(toggleHotel);
        toggleHotel.setBounds(940, 200, 110, 23);

        toggleUCA.setText("UCA");
        toggleUCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleUCAActionPerformed(evt);
            }
        });
        getContentPane().add(toggleUCA);
        toggleUCA.setBounds(940, 260, 53, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mapa.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 30, 960, 620);

        labelHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("Calculo de rutas");
        getContentPane().add(labelHeader);
        labelHeader.setBounds(30, 20, 270, 30);

        labelRuta.setText("Ruta a seguir:");
        getContentPane().add(labelRuta);
        labelRuta.setBounds(30, 230, 100, 16);

        labelP1.setText("Punto de partida:");
        getContentPane().add(labelP1);
        labelP1.setBounds(30, 90, 100, 16);

        labelP2.setText("Punto de destino:");
        getContentPane().add(labelP2);
        labelP2.setBounds(30, 130, 100, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ocultarRutas(){
        imgRutaUca.setVisible(!imgRutaUca.isVisible());
    }
   
    /*
    public void paint(Graphics g) {
        super.paint(g);
     
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        
        //----------------------------- Calle uca -----------------------------
        float[] dashPattern = {5, 5};
        
        BasicStroke dashedStroke = new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashPattern, 0);
        g2d.setStroke(dashedStroke);

        g2d.drawLine(980, 265, 950, 265);
        g2d.drawLine(925, 250, 950, 265);
        
        //----------------------------- Calle uca -----------------------------
        // Dibuja una curva punteada
        //g2d.drawArc(50, 50, 100, 100, 90, 180); // Cambia los valores para ajustar la curva    
    }
*/
    
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        rutaList.removeAll();

        JFrame ventana = new JFrame("Grosor de linea");

        String t1 = "consult('tarea1.pl')";
        Query q1 = new Query(t1);

        if (!q1.hasSolution()) {
            System.out.println("Base de conocimiento no encontrada");
        } else {
            System.out.println("Base de conocimiento encontrada!");
            System.out.println("________________________________");

            String lugar1 = origenTextbox.getText();
            String lugar2 = destinoTextbox.getText();

            String t2 = "desde_hasta(" + lugar1 + "," + lugar2 + ", W)";
            Query q2 = new Query(t2);

            ArrayList<String> listaRutas = new ArrayList<>();

            System.out.println("Ruta:");
            while (q2.hasMoreSolutions()) {
                Map<String, Term> route = q2.nextSolution();
                System.out.println("W = " + route.get("W"));
                var ruta = route.get("W").toString();

                listaRutas.add(ruta);//lista para mostrar rutas
                rutaList.add(ruta);//lista en interfaz
            }
            
            if(listaRutas.contains("uca"))
                imgRutaUca.setVisible(!imgRutaUca.isVisible());

        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void rutaListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaListActionPerformed
    }//GEN-LAST:event_rutaListActionPerformed

    private void toggleUCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleUCAActionPerformed
        validate(toggleUCA, "uca");
    }//GEN-LAST:event_toggleUCAActionPerformed

    private void toggleHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleHotelActionPerformed
        validate(toggleHotel, "hotel_capital");
    }//GEN-LAST:event_toggleHotelActionPerformed

    private void toggleVestidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleVestidosActionPerformed
        validate(toggleVestidos, "la_casa_de_los_vestidos");
    }//GEN-LAST:event_toggleVestidosActionPerformed

    private void validate(javax.swing.JToggleButton button, String place){
        if(origenTextbox.getText().equals("") && button.isSelected())
            origenTextbox.setText(place); 
        else if(destinoTextbox.getText().equals("") && button.isSelected())
            destinoTextbox.setText(place);
        else if(origenTextbox.getText().equals(place) && !button.isSelected())
            origenTextbox.setText("");
        else if(destinoTextbox.getText().equals(place) && !button.isSelected())
            destinoTextbox.setText("");
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
    private javax.swing.JTextField destinoTextbox;
    private javax.swing.JLabel imgRutaUca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelP1;
    private javax.swing.JLabel labelP2;
    private javax.swing.JLabel labelRuta;
    private javax.swing.JTextField origenTextbox;
    private java.awt.List rutaList;
    private javax.swing.JToggleButton toggleHotel;
    private javax.swing.JToggleButton toggleUCA;
    private javax.swing.JToggleButton toggleVestidos;
    // End of variables declaration//GEN-END:variables
}
