
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
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int n2 = leer.nextInt();
        System.out.println("La suma es: " + (n1+n2) );
    }
    
}
