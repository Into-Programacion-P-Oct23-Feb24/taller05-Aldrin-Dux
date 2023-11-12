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
        double subtotal;
        double precioDiario;
        int dias;
        double descuento;
        double total;

        System.out.println("Ingresar numero de dias");
        dias = entrada.nextInt();
        System.out.println("Ingresar precio diario");
        precioDiario = entrada.nextDouble();

        if (dias > 5 && dias <= 10) {
            subtotal = dias * precioDiario;
            descuento = 0.1;
            total = subtotal - (subtotal * descuento);
            System.out.printf("\nFACTURA\nSubtotal: %.2f\nDescuento: %.2f\n"
                    + "Total a pagar: $%.2f", subtotal, descuento, total);
        } else {
            if (dias > 10 && dias <= 15) {
                subtotal = dias * precioDiario;
                descuento = 0.15;
                total = subtotal + (subtotal * descuento);
                System.out.printf("\nFACTURA\nSubtotal: %.2f\nDescuento: %.2f\n"
                        + "Total a pagar: $%.2f", subtotal, descuento, total);
            } else {
                if (dias > 15) {
                    subtotal = dias * precioDiario;
                    descuento = 0.2;
                    total = subtotal + (subtotal * descuento);
                    System.out.printf("\nFACTURA\nSubtotal: %.2f\nDescuento: %.2f\n"
                            + "Total a pagar: $%.2f", subtotal, descuento, total);
                } else {
                    subtotal = dias * precioDiario;
                    descuento = 0;
                    total = subtotal + (subtotal * descuento);
                    System.out.printf("\nFACTURA\nSubtotal: %.2f\nDescuento: %.2f\n"
                            + "Total a pagar: $%.2f", subtotal, descuento, total);

                }
            }
        }

    }

}
