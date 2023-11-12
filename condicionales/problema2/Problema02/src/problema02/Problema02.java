/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aldrin
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String producto;
        int cantidad;
        double precio;
        double total;
        
        System.out.println("Ingrese nombre del producto");
        producto = entrada.nextLine();
        System.out.println("Ingrese cantidad a llevar");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese precio por unidad");
        precio=entrada.nextDouble();
        
        total=cantidad*precio;
        
        if(cantidad>=50){
            total=total-(total*0.15);
        }
        System.out.printf("\nFACTURA\nProducto: %s\nCantidad: %d\nPrecio "
                + "por unidad: $%.2f\nTotal: $%.2f", producto,cantidad,
                precio, total);
    }
    
}
