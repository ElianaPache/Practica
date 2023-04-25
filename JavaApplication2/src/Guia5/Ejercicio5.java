//Realice un programa que compruebe si una matriz dada es antisimétrica. 
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
//pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una 
//matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

package Guia5;

import java.util.Scanner;


public class Ejercicio5 {
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
            System.out.println("Matriz dada");
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("Matriz traspuesta");
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(matriz[j][i] + " ");
                }
                System.out.println("\n");
            }
            boolean ok = false;
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(matriz[i][j] == (-1)*matriz[j][i]){
                        ok = true;
                    }else{
                        ok = false;
                    }
                   
                    
                }
            }
            
           if(ok){
               System.out.println("La matriz es antisimétrica");
           }else {
               System.out.println("La matriz NO es antisimétrica");
           }
    }
}
