
package printname;

import java.util.Scanner;

/**
 * -------Excersise 02------ 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 * @author jgh
 */ 

public class PrintName {

    //@param args the command line arguments
 
    public static void main(String[] args) {
       Scanner leerName = new Scanner(System.in);
       
       System.out.print("Ingrese su nomnre: ");
       String name = leerName.nextLine();
       
       System.out.println("Bienvenido " + name + "!");
    }
    
}