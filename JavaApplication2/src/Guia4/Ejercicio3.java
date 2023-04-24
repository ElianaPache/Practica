//Crea una aplicación que a través de una función nos convierta una cantidad de 
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
//La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €

package Guia4;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de euros a convertir");
        double euros = leer.nextFloat();
        System.out.println("Ingrese moneda de cambio");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        String cambio = leer.next();
        
        
        monedaCambio(euros, cambio);
    }
            
    
    
    public static void monedaCambio(double euros, String cambio) {
        
           if(cambio.equals("libras")){
               System.out.println("Su cambio en Libras es " + (euros * 0.86));
           }
           
           if(cambio.equals("dolares")){
               System.out.println("Su cambio en Dolares es " + (euros * 1.28611));
           }
           
           if(cambio.equals("yenes")){
               System.out.println("Su cambio en Yenes es " + (euros * 129.852));
           }
                    
        }
            
        
    }
}
