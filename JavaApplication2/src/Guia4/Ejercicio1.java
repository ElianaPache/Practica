//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
//cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

package Guia4;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        System.out.println("Ingrese que operación desea realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        Scanner leerr = new Scanner(System.in);
        int opcion = leerr.nextInt();   
       
        switch(opcion){
            case 1:
                int sum = sumar(numero1, numero2);
                System.out.println("El resultado de la suma es: " + sum);
                break;
            case 2:
                int resta = restar(numero1, numero2);
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                int multi = multiplicar(numero1, numero2);
                System.out.println("El resultado de la multiplicación es: " + multi);
                break;
            case 4:
                double divi = dividir(numero1, numero2);
                System.out.println("El resultado de la división es: " + divi);
        }
        
        
    }
    
    
    public static int sumar(int num1, int num2){
        int suma;
        suma = num1 + num2;
        return suma;

    }
    
    public static int restar(int num1, int num2){
        int resta;
        resta = num1 - num2;
        return resta;

    }
    
    public static int multiplicar(int num1, int num2){
        int multi;
        multi = num1 * num2;
        return multi;

    }
    
    public static double dividir(int num1, int num2){
        double divide;
        divide = num1 / num2;
        return divide;

    }
}    





