package Service;

import Entidad.NIF;
import java.util.Scanner;

public class NIFService {
    Scanner leer = new Scanner(System.in);
    
    public NIF definirLetra(NIF nuevo, int resultado){
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        /*
        letras[0]="T";
        letras[1]="R";
        letras[2]="W";
        letras[3]="A";
        letras[4]="G";
        letras[5]="M";
        letras[6]="Y";
        letras[7]="F";
        letras[8]="P";
        letras[9]="D";
        letras[10]="X";
        letras[11]="B";
        letras[12]="N";
        letras[13]="J";
        letras[14]="Z";
        letras[15]="S";
        letras[16]="Q";
        letras[17]="V";
        letras[18]="H";
        letras[19]="L";
        letras[20]="C";
        letras[21]="K";
        letras[22]="E";
        */
        nuevo.setLetra(letras[resultado]);
        
        return nuevo;
    }
    
    public NIF crearNIF(){
        NIF nuevo = new NIF();
        System.out.println("Ingresa el numero de DNI");
        nuevo.setDNI(leer.nextLong());
        leer.nextLine();
        int resultado =(int) nuevo.getDNI()/23;
        while(resultado>22){
            resultado /=23;
        }
        definirLetra(nuevo, resultado);
        return nuevo;
    }
    
    public void mostrar(NIF nuevo){
        System.out.println(nuevo.getDNI()+"-"+nuevo.getLetra());
    }
    
}
