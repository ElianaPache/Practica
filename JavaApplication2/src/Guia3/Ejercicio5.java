//Escriba un programa en el cual se ingrese un valor limite positivo, 
//y a continuacion solicite numeros al usuario hasta que la suma de los 
//numeros introducidos supere el limite inicial.

package Guia3;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número límite");
        int limite = leer.nextInt();
        int numero = 0;
        int suma = numero;
        
        while (suma < limite) {
            System.out.println("Ingrese número límite");
            numero = leer.nextInt();
            suma += numero; 
            
        }
        
        System.out.println("La suma superó el límite y la suma es  " + suma);
        
    }
}
