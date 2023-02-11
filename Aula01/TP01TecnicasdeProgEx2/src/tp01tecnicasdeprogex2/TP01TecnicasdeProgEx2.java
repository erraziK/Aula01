/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01tecnicasdeprogex2;

import java.util.Scanner;

public class TP01TecnicasdeProgEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int CalculaMedia;
        
        
        System.out.println("Insira o primeiro valor: ");
        v1 = in.nextInt();
        System.out.println("Insira o segundo valor: ");
        v2 = in.nextInt();
        System.out.println("Insira o terceiro valor: ");
        v3 = in.nextInt();
        System.out.println("Insira o quarto valor: ");
        v4 = in.nextInt();
        CalculaMedia = (v1 + v2 + v3 + v4) / 4;
       
        if (CalculaMedia >= 6)
        {
            System.out.println("Você está aprovado! Parabéns!");
        }
        else if (CalculaMedia < 3)
        {
            System.out.println ("Você está reprovado.");
        } 
        else if (CalculaMedia >=3 && CalculaMedia < 6)
        {
            System.out.println("Você está de exame.");
        }
    }
}
