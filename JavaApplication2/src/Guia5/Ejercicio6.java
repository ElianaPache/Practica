//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
//sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
//y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
//es decir, están entre el 1 y el 9.

package Guia5;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            int N = 3;
            int matriz[][] = new int[N][N];
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.println("Ingrese la posición " + i + j + " de la matriz");
                    matriz[i][j] = leer.nextInt();
                }
            }
            
            int fila0 = 0, fila1 = 0, fila2 = 0;
            for(int i=0; i<N; i++){
               
                fila0 = matriz[i][0] + matriz[i][1] + matriz[i][2]; 
                fila1 = matriz[i][0] + matriz[i][1] + matriz[i][2]; 
                fila2 = matriz[i][0] + matriz[i][1] + matriz[i][2]; 
            }    
            
            int col0 = 0, col1 = 0, col2 = 0;
            for(int i=0; i<N; i++){
               
                col0 = matriz[0][i] + matriz[1][i] + matriz[2][i]; 
                col1 = matriz[0][i] + matriz[1][i] + matriz[2][i]; 
                col2 = matriz[0][i] + matriz[1][i] + matriz[2][i]; 
            }    
            
            System.out.println("Suma de las filas ");
            System.out.println("Fila 1: " + fila0);
            System.out.println("Fila 1: " + fila1);
            System.out.println("Fila 2: " + fila2);
            
            System.out.println("Suma de columnas");
            System.out.println("Columna 1: " + col0);
            System.out.println("Columna 2: " + col1);
            System.out.println("Columna 3: " + col2);
            
            int diaP = 0;
            for(int i=0; i<N; i++){
                
                    diaP += matriz[i][i];
                
            }
            
            System.out.println("La suma de la diagonal principal es " + diaP);
            
            
            System.out.println("Matriz Ingresada");
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("\n");
            }
            
            
            if(fila0 == fila1 && fila1 == fila2 && fila2 == col0 && col0 == col1 && col1 == col2 && col2 == diaP){
                System.out.println("La matriz es mágica!!");
            }else{
                System.out.println("La matriz NO es mágica");
            }
                
    }
    
}
