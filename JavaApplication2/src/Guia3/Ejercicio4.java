//Escriba un programa que pida una frase o palabra y valide si la primera letra 
//de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//Nota: investigar la función Substring y equals() de Java.

package Guia3;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        
        String frase = leer.next();
        int largo = frase.length();
        String primerLetra = frase.substring(0, 1);
        
      //  String primerLetra = StringUtils.substring(frase, 0, largo);
        
        if (primerLetra.equals("A")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
}
