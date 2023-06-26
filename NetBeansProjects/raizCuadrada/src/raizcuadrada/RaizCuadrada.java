
package raizcuadrada;

import java.util.Scanner;
/**
 * -------Excersise 05-------
 * Escribir un programa que lea un número entero por teclado y muestre
 * por pantalla el doble, el triple y la raíz cuadrada de ese número.
 * @author jgh
 */
public class RaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int num = leerNum.nextInt();
        double doubleNum = (double) num;
        System.out.println("El doble de " + num + " = " + num * 2);
        System.out.println("El triple de " + num + " = " + num * 3);
        System.out.println("La raiz cuadrada " + num + " = " + Math.sqrt(doubleNum));
    }
    
}