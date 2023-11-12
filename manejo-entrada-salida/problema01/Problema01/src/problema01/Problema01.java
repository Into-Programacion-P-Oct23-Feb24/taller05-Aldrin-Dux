/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author aldrin
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        double area;
        double base;
        double altura;
        
        System.out.println("Ingresar base");
        base=entrada.nextDouble();
        System.out.println("Ingresar altura");
        altura=entrada.nextDouble();
        
        area=(base/2)*altura;
        
        System.out.printf("\nArea de un triangulo\nBase : %.1f\nAltura: %.1f\n"
                + "Area: %.1f",
                
                base,altura,area);
    }
    
}
