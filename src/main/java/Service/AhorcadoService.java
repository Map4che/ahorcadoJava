package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        Ahorcado nuevo = new Ahorcado();
        System.out.println("Escriba la palabra del juego");
        String palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        int cantidad = palabra.length();
        String[] vector = new String[cantidad];
        for(int i=0; i<cantidad;i++){
            char letra =palabra.charAt(i);
            vector[i]=String.valueOf(letra);
        }
        
        nuevo.setPalabra(vector);
        System.out.println("Cuantas oportunidades fallidas tendra el usuario?");
        nuevo.setTurnos(leer.nextInt());
        leer.nextLine();
        return nuevo;
    }
    
    public int longitud(Ahorcado nuevo){
        int longitud = nuevo.getPalabra().length;
        
        System.out.println("Longitud de la palabra: "+longitud);
        return longitud;
    }
    
    public int buscar(Ahorcado nuevo){
        int resultado = 0;
        String[] vector = nuevo.getPalabra();
        System.out.println("Escriba la letra");
        String letra = leer.nextLine();
        
        for(int i=0;i<vector.length;i++){
            boolean esta = vector[i].contains(letra);
            if(esta){
                resultado +=1;
            }
        }
        if(resultado==1){
            System.out.println("Felicitaciones la letra estaba en la palabra");
        }else if(resultado>1){
            System.out.println("Felicitaciones la letra estaba en la palabra "+resultado+" veces");
        }else{
            System.out.println("Lo sentimos la letra no estaba en la palabra");
        }
        
        return resultado;
    }
    
    public void resultado(int encontradas, int faltantes){
        System.out.println("Número de letras (Encontradas/Faltantes): ("+encontradas + " / "+faltantes+")");
    }
    
    public void intentos(int intentos){
        System.out.println("Número de oportunidades: "+intentos);
    }
    
    public void juego(){
        Ahorcado nuevo = new Ahorcado();
        nuevo = crearJuego();
        int faltantes = longitud(nuevo);
        int encontradas = 0;
        int turnos = nuevo.getTurnos();
                
        while(faltantes>0 && turnos>0){
            int resultado = buscar(nuevo);
            if(resultado>0){
                encontradas += resultado;
                faltantes -= resultado;
                resultado(encontradas, faltantes);
            }else{
                resultado(encontradas,faltantes);
                turnos -=1;
            }
            
            intentos(turnos);
        }
        String[] palabra = nuevo.getPalabra();
        if(faltantes==0){
            System.out.print("Felicitaciones!! Ganaste la partida y encontraste la palabra: ");
            for(int i=0;i<nuevo.getPalabra().length;i++){
                System.out.print(palabra[i]);
            }
            System.out.println("");
        }else{
             System.out.println("Lo sentimos haz perdido la partida");
             System.out.print("La palabra era: ");
              for(int i=0;i<nuevo.getPalabra().length;i++){
                System.out.print(palabra[i]);
        }
              System.out.println("");
        }
              
    }
    
}
