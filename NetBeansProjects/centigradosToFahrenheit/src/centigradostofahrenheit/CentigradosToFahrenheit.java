
package centigradostofahrenheit;
import java.util.Scanner;

/**
 * -------Excersise 04-------
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author jgh
 */
public class CentigradosToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leergrados = new Scanner(System.in);
        
        System.out.print("Ingrese los grados °C: ");
        float celsius = leergrados.nextFloat();
        
        float fahrenheit = 32 + (9 * celsius / 5);
        System.out.println("La conversion de " + celsius + "°C a Fahrenheit es: " + fahrenheit + "°F");
    }
    
}
