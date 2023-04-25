//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

package Guia5;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int N = 3;
        int cont = 0, digitos = 0;
        int vector[] = new int[N];
        int digito[] = new int[N];
        int vectorAux[] = new int[N];
        
          for(int i=0; i<N; i++){
            vector[i] = (int)(Math.random()*100000);
            vectorAux[i] = vector[i];
        }
          
          for(int i=0; i<N; i++){
              digitos = 0;
             while(vector[i]!=0){                      //mientras a n le queden cifras
                    vector[i] = vector[i]/10;         //le quitamos el último dígito
                   digitos++;   
             }
             
             digito[i] = digitos ;
          }
           for(int i=0; i<N; i++){
               System.out.println("El numero " + vectorAux[i] + " tiene " + digito[i] + " digitos");
               //System.out.println(vectorAux[i]);
           }
          
          for(int i=0; i<N; i++){
             
             while(vector[i]!=0){                      //mientras a n le queden cifras
                    vector[i] = vector[i]/10;         //le quitamos el último dígito
                   digitos++;   
             }
             
             digito[i] = digitos ;
          }
          
          int digUno = 0, digDos = 0, digTres = 0, digCuatro = 0, digCinco = 0;
          
         for(int i=0; i<N; i++){
             
             
             if(digito[i] == 1){
                 digUno = digUno +1; 
             }
             if(digito[i] == 2){
                 digDos = digDos +1; 
             }
             if(digito[i] == 3){
                 digTres = digTres +1; 
             }
             if(digito[i] == 4){
                 digCuatro = digCuatro +1; 
             }
             if(digito[i] == 5){
                 digCinco = digCinco +1; 
             }
         } 
    
    
         System.out.println("Hay " + digUno + " números con 1 cifra"); 
         System.out.println("Hay " + digDos + " números con 2 cifras"); 
         System.out.println("Hay " + digTres + " números con 3 cifras"); 
         System.out.println("Hay " + digCuatro + " números con 4 cifras"); 
         System.out.println("Hay " + digCinco + " números con 5 cifras"); 
    }
    
    
    
    
    
    
    
}
