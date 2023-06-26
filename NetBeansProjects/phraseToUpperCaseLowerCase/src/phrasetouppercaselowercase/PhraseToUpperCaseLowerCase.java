
package phrasetouppercaselowercase;

import java.util.Scanner;

/**
 * -------Excersise 03------
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 * @author jgh
 */
public class PhraseToUpperCaseLowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerPhrase = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String phrase = leerPhrase.nextLine();
        System.out.println("En Mayusculas: " + phrase.toUpperCase());
        System.out.println("En minusculas: " + phrase.toLowerCase());
    }
    
}
