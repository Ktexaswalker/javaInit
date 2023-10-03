/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hecto
 */
public class ClashRoyale {

    /** Una de les funcionalitats al  clash royale quan vas sumant copes, 
     * és que quant arribes a un cert número de copes, et deixa elegir entre 
     * dues cartes per afegir-les al teu mazo.
     * 
     * La versió 1 del programa , simularem l'elecció de dues cartes. 
     * Elegirem entre les cartes, del Mago Electrico i del esbirro mega. 
     * 
     * El programa ha de preguntar quina carta vols Mago Electrico(0) o 
     * esbirro mega(1). Quant la triis , et sortirà la frase 
     * “Has escollit XXXX(nom de la carta escollida)”.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        
        
        
        
    }
    
}
