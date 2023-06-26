
package sumanumeros;

import java.util.Scanner;

/**
 * -------Excersise 01------  
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
* @author jgh
*/

public class SumaNumeros {

    //@param args the command line arguments
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el num1: ");
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese el num2: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
    }
    
}