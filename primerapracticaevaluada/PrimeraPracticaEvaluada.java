/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerapracticaevaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author issac
 */
public class PrimeraPracticaEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Pedir salario del trbajador o trabajadores
        
        double salarion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del primer trbajador:"));
        double salarion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del segundo trbajador :"));
        double salarion3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del tercer trabajador :"));

        // Calcular SEM,IVM para los salarios
        double totalaPagar = (salarion1 * 0.0925 + salarion1 * 0.0508)
                + (salarion2 * 0.0925 + salarion2 * 0.0508)
                + (salarion3 * 0.0925 + salarion3 * 0.0508);

        // Resultado
        
        JOptionPane.showInputDialog("sdebera abonar a la CCSS", totalaPagar);
        
                
  
    }
}

