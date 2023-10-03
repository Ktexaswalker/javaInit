/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashroyale3;

import java.util.Scanner;

/* Realitzarem el mateix programa però per elegir enlloc de ficar 
 * una opció numerica, tens que ficar la primera lletra del 
 * personatge amb minúscula (m, e).
 *
 * @author hecto
 */
public class ClashRoyale3 {

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
            if (elegir == 'm' || elegir == 'e') {
                if (elegir == 'm') {
                    System.out.println("Has escollit Mago Electrico");
                }
                else if (elegir == 'e') {
                    System.out.println("Has escollit Esbirro Mega");
                }
            }
        } else if (copas >= 2000) {
            System.out.println("Elige una carta:");
            System.out.println("Caballero[c] ---- Bandida[b]");
            char elegir = sc.next().charAt(0);
            if (elegir == 'c' || elegir == 'b') {
                if (elegir == 'c') {
                    System.out.println("Has escollit Caballero");
                }
                else if (elegir == 'b') {
                    System.out.println("Has escollit Bandida");
                }
            }
        }
    }
    
}
