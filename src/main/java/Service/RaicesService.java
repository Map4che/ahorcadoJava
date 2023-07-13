package Service;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesService {
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaices(){
        Raices r = new Raices();
        System.out.println("Cúal es el valor de 'a'");
        r.setA(leer.nextInt());
        System.out.println("Cúal es el valor de 'b'");
        r.setB(leer.nextInt());
        System.out.println("Cúal es el valor de 'c'");
        r.setC(leer.nextInt());
        
        return r;
    }
    
    public double getDiscriminante(Raices r){
        double discriminante=(Math.pow(r.getB(),2)-4*r.getA()*r.getC());
                
        return discriminante;
    }
    
    public boolean tieneRaices(double d){
        boolean resultado = false;
        
        if(d>=0){
            resultado = true;
        }
        
        return resultado;
    }
    
    public boolean tieneRaiz(double d){
        boolean resultado = false; 
        int entero = (int)Math.floor(d);
        if(entero == 0){
            resultado = true;
        }
        
        return resultado;
    }
    
    public void obtenerRaices(double d){
        boolean resultado = tieneRaices(d);
        
        if(resultado){
            System.out.println("Hacer lo que toque que no se que es");
        }else{
            System.out.println("Tiene una sola raiz");
        }
    }
    
    public void obtenerRaiz(double d){
        boolean resultado = tieneRaiz(d);
        
        if(resultado){
            System.out.println("Hacer la otra parte que no entendi");
        }else{
            System.out.println("Tiene más de una raíz");
        }
    }
    
    public void carcular(double d){
        obtenerRaices(d);
        obtenerRaiz(d);
        
    }
    
}
