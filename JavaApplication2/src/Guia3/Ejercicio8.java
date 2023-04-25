//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

package Guia3;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de elementos");
        int lado = leer.nextInt();
        
        for(int i=0; i<lado; i++){
                System.out.print("*");
                
            }    
              
                  
        for(int i=0; i<lado; i++){
                System.out.println("*");
                        
            }
    }    
}        
    

