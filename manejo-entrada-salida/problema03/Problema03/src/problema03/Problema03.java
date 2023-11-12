/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author aldrin
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double costoMinuto;
        double minutosTotal;
        double total;
        
        System.out.println("Ingresar costo por minuto");
        costoMinuto=entrada.nextDouble();
        System.out.println("Ingresar total de minutos usados");
        minutosTotal=entrada.nextDouble();
        
        total=costoMinuto*minutosTotal;
        
        System.out.printf("Planilla del telefono\nCosto por minuto: $%.2f\n"
                + "Minutos totales: %.2f\nTotal a pagar: %.2f",costoMinuto,
                minutosTotal,total);
        
    }
}
