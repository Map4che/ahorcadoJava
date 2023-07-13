package Service;

import Entidad.Secreto;
import java.util.Random;
import java.util.Scanner;


public class SecretoService {
    Scanner leer = new Scanner(System.in);
    
    public String prepararJuego(Secreto s){
       Random random = new Random();
       int aleatorio = random.nextInt(12)+1;
       String vector[] = s.getMes();
       String resultado = vector[aleatorio];
       
       return resultado;
    }
    
    public void confirmarRespuesta(){
        boolean fin = false;
        Secreto s = new Secreto();
        String resultado = prepararJuego(s);
       
        do{
             System.out.println("Escribe el mes que quieras elegir");
             String opcion = leer.nextLine();
             opcion = opcion.toLowerCase();
            if(resultado.equals(opcion)){
            fin = true;
        }else{
            System.out.println("Vuelve a intentarlo");
        }
            
        }while(!fin);
        
        System.out.println("Felicitaciones!!!! Haz ganado");
        
        
    }
}
