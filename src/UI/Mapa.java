/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;
import java.util.ArrayList;

/**
 *
 * @author MINEDUCYT
 */
public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Mapa
     */
    public Mapa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBoxP1 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        textBoxP2 = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        rutaList = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textBoxP1.setToolTipText("");
        getContentPane().add(textBoxP1);
        textBoxP1.setBounds(59, 38, 220, 22);
        getContentPane().add(canvas1);
        canvas1.setBounds(142, 38, 0, 0);
        getContentPane().add(canvas2);
        canvas2.setBounds(409, 282, 0, 0);
        getContentPane().add(textBoxP2);
        textBoxP2.setBounds(59, 79, 220, 22);

        BtnBuscar.setText("Buscar ruta");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar);
        BtnBuscar.setBounds(60, 140, 165, 23);

        rutaList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaListActionPerformed(evt);
            }
        });
        getContentPane().add(rutaList);
        rutaList.setBounds(60, 190, 210, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String t1 = "consult('tarea1.pl')";
        Query q1 = new Query(t1);

        if (!q1.hasSolution()) {
            System.out.println("Base de conocimiento no encontrada");
        } else {
            System.out.println("Base de conocimiento encontrada!");
            System.out.println("________________________________");

            String lugar1 = textBoxP1.getText();
            String lugar2 = textBoxP2.getText();
            
            String t2 = "desde_hasta("+ lugar1 + ","+ lugar2 +", W)";
            Query q2 = new Query(t2);

            ArrayList<String> listaRutas = new ArrayList<>(); 

            System.out.println("Ruta:");
            while (q2.hasMoreSolutions()) {
                Map<String, Term> route = q2.nextSolution();
                System.out.println("W = " + route.get("W"));
                var ruta = route.get("W").toString();

                //listaRutas.add(ruta);
                rutaList.add(ruta);
            }
            
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void rutaListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaListActionPerformed
    }//GEN-LAST:event_rutaListActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.List rutaList;
    private javax.swing.JTextField textBoxP1;
    private javax.swing.JTextField textBoxP2;
    // End of variables declaration//GEN-END:variables
}
