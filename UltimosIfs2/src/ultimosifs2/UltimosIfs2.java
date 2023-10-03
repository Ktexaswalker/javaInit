/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimosifs2;
import java.util.Scanner;
/**
 *
 * @author hecto
 */
public class UltimosIfs2 {
    /**2
     * Descuento en supermercado
     * inferior a 800 -> 0%
     * entre 800 y 1500 -> 6%
     * superior a 1500 y hasta 3000 -> 8%
     * mas de 3000 -> 10%
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto vas a pagar en el supermercado? ");
        int preu = sc.nextInt(); float descompte; float precio_final;
        if (preu < 800) {
            System.out.println("Recibes un descuento del 0%");
            descompte = 0;
        } else if (preu >= 800 && preu <= 1500) {
            System.out.println("Recibes un descuento del 6%");
            descompte = 6;
        } else if (preu > 1500 && preu <= 3000) {
            System.out.println("Recibes un descuento del 8%");
            descompte = 8;
        } else {
            System.out.println("Recibes un descuento del 10%");
            descompte = 10;
        }
        precio_final = (preu*descompte)/100;
        System.out.println("Con el " + descompte + "% de descuento has ahorrado: " + precio_final + " Euros");
        preu = (int) (preu - precio_final);
        System.out.println("Esto supone en tu factura un precio final de: " + preu + " Euros");
    }
    
}
