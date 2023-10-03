/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimosifs1;
import java.util.Scanner;
/**1
 * Calcular l’augment de sou al cap d’any a partir d’aquesta taula
 * inferior 18000 -> 12%
 * entre 18000 y 30000 -> 10%
 * superior a 30000 e inferior a 45000 8%
 * 45000 o mas -> 6%
 * @author hecto
 */
public class UltimosIfs1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su sueldo: ");
        double sueldo = sc.nextInt();
        double futuro_sueldo; int porcentaje; int diferencia;
        if (sueldo < 18000) {
            futuro_sueldo = sueldo * 1.12;
            porcentaje = 12;
        } else if (sueldo >= 18000 && sueldo <= 30000) {
            futuro_sueldo = sueldo * 1.10;
            porcentaje = 10;
        } else if (sueldo > 30000 && sueldo < 45000) {
            futuro_sueldo = sueldo * 1.08;
            porcentaje = 8;
        } else {
            futuro_sueldo = sueldo * 1.06;
            porcentaje = 6;
        }
        diferencia = (int) (futuro_sueldo - sueldo);
        System.out.println("Tu sueldo aumentara un: " + porcentaje + "%, que equivale a: " + diferencia + " Euros.");
        System.out.println("Tu futuro sueldo el año que viene sera de: " + futuro_sueldo);
    }
}
