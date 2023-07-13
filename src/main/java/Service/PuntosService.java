package Service;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        System.out.println("Cual es el punto x1?");
        p.setX1(leer.nextInt());
        System.out.println("Cual es el punto y1?");
        p.setY1(leer.nextInt());
        System.out.println("Cual es el punto x2?");
        p.setX2(leer.nextInt());
        System.out.println("Cual es el punto y2?");
        p.setY2(leer.nextInt());
        
        return p;
    }
    
    public void calcularDistancia(Puntos p){
        int cateto1 = p.getX2()-p.getX1();
        int cateto2 = p.getY2()-p.getY1();
        
        double hipotenusa= Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));
        
        System.out.println("La distancia entre los dos puntos es: "+hipotenusa);
    }
}
