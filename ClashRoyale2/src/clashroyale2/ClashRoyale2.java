/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashroyale2;
import java.util.Scanner;
/**
 * L’evolució del programa En aquest cas augmentarem les opcions amb més cartes 
 * en funció del número de copes que tens. Et preguntarà quantes copes tens 
 * aconseguides a l'inici de tot i després…
 * Si tens menys de 2000, et deixarà triar entre les dues cartes del exercici 1
 * Si igual o més de 2000 , hauras de triar entre dues cartes noves 
 * (Cavallero(0) i Bandida(1))

 * @author hecto
 */
public class ClashRoyale2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas tienes? ");
        long copas = sc.nextLong();
        if (copas < 2000) {
            System.out.println("Elige una carta:");
            System.out.println("Mago Electrico[0] ---- Esbirro Mega[1]");
            int elegir = sc.nextInt();
            if (elegir == 0 || elegir == 1) {
                if (elegir == 0) {
                    System.out.println("Has escollit Mago Electrico");
                }
                else if (elegir == 1) {
                    System.out.println("Has escollit Esbirro Mega");
                }
            }
        } else if (copas >= 2000) {
            System.out.println("Elige una carta:");
            System.out.println("Caballero[0] ---- Bandida[1]");
            int elegir = sc.nextInt();
            if (elegir == 0 || elegir == 1) {
                if (elegir == 0) {
                    System.out.println("Has escollit Caballero");
                }
                else if (elegir == 1) {
                    System.out.println("Has escollit Bandida");
                }
            }
        }
    }
    
}
