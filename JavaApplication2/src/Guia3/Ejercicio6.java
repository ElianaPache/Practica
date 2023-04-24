//Realizar un programa que pida dos números enteros positivos por teclado y 
//muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
//el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
//El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
//si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
//se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
//salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
//caso contrario se vuelve a mostrar el menú.

package Guia3;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos número enteros positivos");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        System.out.println("Menú");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        
        System.out.println("Ingrese una opción:");
        int opcion = leer.nextInt();
        
        
        switch(opcion){
            case 1:
                System.out.println("La suma es: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("La resta es: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("La división es: " + (numero1 / numero2));
                break;
            case 5:
                System.out.println("Esta seguro que desea salir del programa S/N?");
                Scanner leerr = new Scanner(System.in);
                String opcion2 = leerr.next();
                if(opcion2.equals("S")){
                    break;
                }else {
                    System.out.println("Menú");
                    System.out.println("1 - Sumar");
                    System.out.println("2 - Restar");
                    System.out.println("3 - Multiplicar");
                    System.out.println("4 - Dividir");
                    System.out.println("5 - Salir");
        
                    System.out.println("Ingrese una opción:");
                    int opcion3 = leer.nextInt();
                    
                    switch(opcion3){
                        case 1:
                            System.out.println("La suma es: " + (numero1 + numero2));
                            break;
                        case 2:
                            System.out.println("La resta es: " + (numero1 - numero2));
                            break;
                        case 3:
                            System.out.println("La multiplicación es: " + (numero1 * numero2));
                            break;
                        case 4:
                            System.out.println("La división es: " + (numero1 / numero2));
                            break;
                        case 5:
                            break;
                    }        
                }
                    
        }
        
    }
}
