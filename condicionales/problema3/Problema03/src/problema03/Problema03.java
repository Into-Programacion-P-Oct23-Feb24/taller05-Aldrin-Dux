/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.io.PrintStream;
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

        String marca;
        String origen;
        double costo;
        double impuesto=0;
        double precioVenta=0;

        System.out.println("Ingresar marca del automovil");
        marca = entrada.nextLine();
        System.out.println("Ingresar origen del automovil");
        origen = entrada.nextLine();
        System.out.println("Ingresar costo del automovil");
        costo = entrada.nextDouble();
        

        if (origen.equals("Alemania") || origen.equals("alemania")) {
            impuesto=impuesto+0.2;
            precioVenta =costo * impuesto;
        } else {
            if (origen.equals("Japon") || origen.equals("japon")) {
                impuesto=impuesto+0.3;
                precioVenta =costo * impuesto;
            } else {
                if (origen.equals("Italia") || origen.equals("italia")) {
                    impuesto=impuesto+0.15;
                    precioVenta =costo * impuesto;
                } else {
                    if (origen.equals("USA") || origen.equals("usa")) {
                        impuesto=impuesto+0.08;
                        precioVenta =costo * impuesto;
                    }
                }
            }
            
        }
        precioVenta = precioVenta+ costo;
        PrintStream printf = System.out.printf("\nFACTURA\nMarca: %s\nOrigen: %s\nCosto: $%.2f\n"
                + "Impuesto por pagar: %.2f\nPrecio venta: $%.2f",marca,
                origen,costo,impuesto,precioVenta);
    }
    

}
