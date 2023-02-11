/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.tecnicasdeprog;

import javax.swing.JOptionPane;

/**
 *
 * @author unisanta
 */
public class TP01TecnicasdeProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercicio 1 
        Double grausCelsius;
        Double grausFahrenheit;
        
        System.out.println("Informe a temperatura em graus Celsius");
        grausCelsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus Celsius: "));
        
        grausFahrenheit = ((grausCelsius * 1.8)+32);
        System.out.println ("A temperatura em graus Fahrenheit é" + grausFahrenheit);
    }
    
}
