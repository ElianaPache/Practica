//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
//le pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
//encuentra el numero y si se encuentra repetido

package Guia5;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        int N = 20;
        int cont = 0;
        int vector[] = new int[N];
        
          for(int i=0; i<N; i++){
            vector[i] = (int)(Math.random()*10);
        }
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número a buscar");
        int num = leer.nextInt();
        
          for(int i=0; i<N; i++){
               if(vector[i] == num){
                   cont += 1;
               }
          }
          
           for(int i=0; i<N; i++){
               System.out.println(vector[i]);
        }
           
               if(0 < cont){
                   System.out.println("El número se encuentra " + num + " veces"); 
               }
           
               
    }
}
