//Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
//y los muestre por pantalla en orden descendente.

package Guia5;



public class Ejercicio1 {
    public static void main(String[] args) {
        
        int vector[] = new int[100];
        
        for(int i=0; i<100; i++){
            vector[i] = i;
        }
        
        for(int i=99; 0<=i; i--){
            System.out.println(vector[i]); 
        }
    }
}
