/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashroyale5;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class ClashRoyale5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas tienes? ");
        long copas = sc.nextLong();
        if (copas < 2000) {
            System.out.println("Elige una carta:");
            System.out.println("Mago Electrico[m] ---- Esbirro Mega[e]");
            char elegir = sc.next().charAt(0);
            if ((elegir == 'm' ||elegir == 'M') || (elegir == 'e' || elegir == 'E')) {
                if (elegir == 'm' ||elegir == 'M') {
                    System.out.println("Has escollit Mago Electrico");
                }
                else if (elegir == 'e' || elegir == 'E') {
                    System.out.println("Has escollit Esbirro Mega");
                }
            }
        } else if (copas >= 2000 && copas <= 3000) {
            System.out.println("Elige una carta:");
            System.out.println("Caballero[c] ---- Bandida[b]");
            char elegir = sc.next().charAt(0);
            if ((elegir == 'c' || elegir == 'C') || (elegir == 'b' || elegir == 'B')) {
                if (elegir == 'c' || elegir == 'C') {
                    System.out.println("Has escollit Caballero");
                }
                else if (elegir == 'b' || elegir == 'B') {
                    System.out.println("Has escollit Bandida");
                }
            }
        } else if (copas > 3000) {
            System.out.println("Elige una carta:");
            System.out.println("Ejercito de esqueletos[e] ---- Gigante[g]");
            char elegir = sc.next().charAt(0);
            if ((elegir == 'e' || elegir == 'E') || (elegir == 'g' || elegir == 'G')) {
                if (elegir == 'e' || elegir == 'E') {
                    System.out.println("Has escollit Ejercito de esqueletos");
                }
                else if (elegir == 'g' || elegir == 'G') {
                    System.out.println("Has escollit Gigante");
                }
            }
        }
    }
    
}
