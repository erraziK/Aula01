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
public class TP01TecnicasdeProgEx4 {
    //O programa deverá nos solicitar a digitação dos valores de mês e 
    //ano em formato numérico, se o valor do mês estiver fora do intervalo de 1 a 12 sinalizar o erro, caso contrário informar quantos dias tem o mês em questão.

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int mes; 
        System.out.println("Insira um mês: ");
        mes = in.nextInt();
        
        if (mes < 1 || mes > 12)
        {
           System.out.println("Erro. O intervalo deve ser entre 1 e 12.");
        }
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
        {
            System.out.println ("O mês tem 31 dias.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            System.out.println ("O mês tem 30 dias.");
        }
        else if (mes == 2) {
            System.out.println ("O mês tem 28 dias.");
        }
               
    }
}
