//Crear un programa que dado un número determine si es par o impar.

package Guia3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        
        int numero = leer.nextInt();
        
        int resto = numero % 2;
        
        if (resto == 0) {
            System.out.println("El número ingresado es par");
            }
            else {
            System.out.println("El número es impar");
              }
        }
  
            
                
    }
    

