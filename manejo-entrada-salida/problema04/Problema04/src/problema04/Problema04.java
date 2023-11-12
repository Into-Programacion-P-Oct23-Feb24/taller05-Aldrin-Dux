/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author aldrin
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double valorTotal;
        
        System.out.println("Ingresar valor del cpu");
        cpu=entrada.nextDouble();
        System.out.println("Ingresar valor del teclado");
        teclado=entrada.nextDouble();
        System.out.println("Ingresar valor del pantalla");
        pantalla=entrada.nextDouble();
        System.out.println("Ingresar valor del raton");
        raton=entrada.nextDouble();
        
        valorTotal=cpu+teclado+pantalla+raton;
        
        System.out.printf("\nValor total de la computadora: $%.2f",valorTotal);
    }
    
}
