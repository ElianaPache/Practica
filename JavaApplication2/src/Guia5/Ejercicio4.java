//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
//la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
//se obtiene cambiando sus filas por columnas (o viceversa).

package Guia5;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[4][4];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                
                matriz[i][j] = (int)(Math.random()*10);
                }
            }
        System.out.println("Matriz Original");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
               
                System.out.print(matriz[i][j] + " ");
                }
            System.out.println("\n");
            }
        System.out.println("Matris Traspuesta");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
               
                System.out.print(matriz[j][i] + " ");
                }
            System.out.println("\n");
            }
        
        
        
    }
}
