
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ffune
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados(usando comas)");
        double c = leer.nextDouble();
        double f =  32 + (9 * c / 5);
        System.out.println("En fahrenheit son " + f + " f");
    }
    
}
