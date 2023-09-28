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

        textBoxP1 = new javax.swing.JTextField();
        textBoxP2 = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        rutaList = new java.awt.List();
        uca = new javax.swing.JCheckBox();
        hotel_capital = new javax.swing.JCheckBox();
        imgRutaUca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();
        labelRuta = new javax.swing.JLabel();
        labelP1 = new javax.swing.JLabel();
        labelP2 = new javax.swing.JLabel();

        setTitle("Rutas");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        textBoxP1.setToolTipText("");
        getContentPane().add(textBoxP1);
        textBoxP1.setBounds(130, 90, 170, 22);
        getContentPane().add(textBoxP2);
        textBoxP2.setBounds(130, 130, 170, 22);

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

        uca.setText("uca");
        getContentPane().add(uca);
        uca.setBounds(980, 250, 70, 20);

        hotel_capital.setText("hotel_capital");
        getContentPane().add(hotel_capital);
        hotel_capital.setBounds(930, 180, 130, 20);

        imgRutaUca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calle_uca.png"))); // NOI18N
        getContentPane().add(imgRutaUca);
        imgRutaUca.setBounds(910, 200, 70, 50);

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

            String lugar1 = textBoxP1.getText();
            String lugar2 = textBoxP2.getText();

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
    private javax.swing.JCheckBox hotel_capital;
    private javax.swing.JLabel imgRutaUca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelP1;
    private javax.swing.JLabel labelP2;
    private javax.swing.JLabel labelRuta;
    private java.awt.List rutaList;
    private javax.swing.JTextField textBoxP1;
    private javax.swing.JTextField textBoxP2;
    private javax.swing.JCheckBox uca;
    // End of variables declaration//GEN-END:variables
}
