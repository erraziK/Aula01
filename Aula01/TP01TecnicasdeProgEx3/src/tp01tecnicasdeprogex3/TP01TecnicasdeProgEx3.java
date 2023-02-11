/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01tecnicasdeprogex3;
import java.util.Scanner;
/**
 *
 * @author unisanta
 */
public class TP01TecnicasdeProgEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Calcular e exibir a média geométrica de quatro valores quaisquer que serão digitados (M = raiz quarta de (v1*v2*v3*v4)).
        Scanner in = new Scanner (System.in);
        double v1 = 0;
        double v2 = 0;
        double v3 = 0;
        double v4 = 0;
        double media; 
        
        System.out.println("Insira o primeiro valor: ");
        v1 = in.nextInt();
        System.out.println("Insira o segundo valor: ");
        v2 = in.nextInt();
        System.out.println("Insira o terceiro valor: ");
        v3 = in.nextInt();
        System.out.println("Insira o quarto valor: ");
        v4 = in.nextInt();
        media = (Math.pow((v1 * v2 * v3 * v4),  0.25));
        System.out.println("A média é: " + media);
    }
    
}
