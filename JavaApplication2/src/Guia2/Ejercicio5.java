//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y 
//la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

package Guia2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        
        int numero = leer.nextInt();
        int numdoble = numero * 2;
        int numtriple = numero *3;
        double raizCuadrada = Math.sqrt(numero);
        
        System.out.println("Su doble es: " + numdoble);
        System.out.println("Su triple es: " + numtriple);
        System.out.println("Su raíz cuadrada es: " + raizCuadrada);
    }
    
}
