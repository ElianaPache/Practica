//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

package Guia2;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("La fase en mayúscula es: "  + frase.toLowerCase() );
        System.out.println("La frase en minúsculas es: " + frase.toUpperCase());
    }
}
