
package servicios;

import entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        double radio;
        
        System.out.println("Ingrese radio de la Circunferencia");
        radio = leer.nextFloat();
        
        return new Circunferencia(radio);
    }
    
    
    public void calcularArea(Circunferencia cin){
        double area;
        
        System.out.println("El Área de la circunferencia es ");
        area = Math.PI * Math.pow(cin.getRadio(), 2);
        System.out.println(area);
        
    }
    
    public void calcularPerimetro(Circunferencia cin){
        double perimetro;
        
        System.out.println("El perímetro es ");
        perimetro = 2 * Math.PI * cin.getRadio();
        System.out.println(perimetro);
        
        
        
        
        
    }
    
    
}
