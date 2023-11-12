/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author aldrin
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double netflix;
        double youtubePremiun;
        double dropbox;
        double spotify;
        double valorTotal;
        int edad;
        
        System.out.println("Ingresar valor del netflix");
        netflix=entrada.nextDouble();
        System.out.println("Ingresar valor del Youtube Premiun");
        youtubePremiun=entrada.nextDouble();
        System.out.println("Ingresar valor del dropbox");
        dropbox=entrada.nextDouble();
        System.out.println("Ingresar valor del spotify");
        spotify=entrada.nextDouble();
        System.out.println("Ingresar edad");
        edad=entrada.nextInt();
        
        valorTotal=netflix+youtubePremiun+dropbox+spotify;
        
        if(edad<30){
            valorTotal=valorTotal-(valorTotal*0.2);
        }
        System.out.printf("\nValor total a pagar mensual: $%.2f",
                valorTotal);
    }
    
}
