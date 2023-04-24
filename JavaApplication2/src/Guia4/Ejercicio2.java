//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
//de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

package Guia4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         String opcion = "";
        
        
        do{
           opcion = mayorMenor();
        }while(!"N".equals(opcion));
        
            
    }
        
    public static String mayorMenor() {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         String opcion = "";
         
        System.out.println("Ingrese nombre");
            String nombre = leer.next();  
            System.out.println("Ingrese edad");
            int edad = leer.nextInt();
            if(18<=edad){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
            
            System.out.println("Desea seguir ingresando personas? (S/N)");
            opcion = leer.next();
        
        return opcion;
    }
    
        
    
    
    }


	

