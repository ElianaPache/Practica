/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Libro;
import servicios.LibrosService;

public class Main {
    public static void main(String[] args) {
        
        LibrosService ls = new LibrosService();
        Libro hp = ls.crearLibro(); // creo mi libro y lo guardo en hp
        System.out.println(" ");
        ls.mostarDatos(hp); //mostar los datos de mi libro hp
        
        Libro b = ls.crearLibro();
        System.out.println(" ");
        ls.mostarDatos(b);
        
        
    
        
    }
    
}
