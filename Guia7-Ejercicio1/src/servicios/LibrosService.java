
package servicios;

import entidades.Libro;
import java.util.Scanner;

public class LibrosService {
 
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
       int isbn, paginas;
       String titulo, autor;
       
        System.out.println("Ingrese ISBN del libro");
        isbn = leer.nextInt();
        
        System.out.println("Ingrese número de páginas");
        paginas = leer.nextInt();
        
        System.out.println("Ingrese título");
        titulo = leer.next();
        
        System.out.println("Ingrese Autor");
        autor = leer.next();
        
        return new Libro(isbn, titulo, autor, paginas);
        
    }
    
    public void mostarDatos(Libro l){
        System.out.println("El titulo del libro es  " + l.getTitulo());
        System.out.println("El Autor de libro es " + l.getAutor());
        System.out.println("El ISBN del libro es " + l.getISBN());
        System.out.println("La cantidad de páginas es " + l.getPaginas());
        
        
    }
    
}
