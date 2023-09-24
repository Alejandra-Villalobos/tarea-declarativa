/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;
import org.jpl7.*;
import java.util.Map;

/**
 *
 * @author alema
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String t1 = "consult('tarea1.pl')";
        Query q1 = new Query(t1);
        
        if(!q1.hasSolution())
            System.out.println("Base de conocimiento no encontrada");
        else{
            System.out.println("Base de conocimiento encontrada!");
            System.out.println("________________________________");
            
            String t2 = "ir_hacia(uca, la_casa_de_los_vestidos)";
            Query q2 = new Query(t2);
            System.out.println(q2.oneSolution());
            
        }
    }
    
}
