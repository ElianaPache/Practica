//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, 
//sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

package Guia4;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        boolean primo = esPrimo(num);
        
        if(primo == true){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }
        
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        boolean primo = false;
        int n = 1;
        
        while(n <= num){
            if(num % n == 0){
               contador += 1; 
            }
            n += 1;
        }
        
        if(contador == 2){
           primo = true; 
        }
        
        return primo;
    }
}
