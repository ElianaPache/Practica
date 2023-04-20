//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//La fórmula correspondiente es: F = 32 + (9 * C / 5).

package Guia2;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados");
        
        int celcius = leer.nextInt();
        int fahren = 32 + (9*celcius/5);
        
        System.out.println("El equivalente en Faherenheit es: " + fahren);
                
                
    }
    
}
