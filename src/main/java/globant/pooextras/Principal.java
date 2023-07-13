package globant.pooextras;

import Entidad.Ahorcado;
import Entidad.NIF;
import Entidad.Puntos;
import Entidad.Raices;
import Service.AhorcadoService;
import Service.NIFService;
import Service.PuntosService;
import Service.RaicesService;
import Service.SecretoService;

public class Principal {


    public static void main(String[] args) {
        
       //Ejercicio Extra 2
       /*
       Puntos p = new Puntos();
       PuntosService ps = new PuntosService();
       p=ps.crearPuntos();
       ps.calcularDistancia(p);
       */
       
       
       //Ejercicio Extra 3
       /*
       Raices r = new Raices();
       RaicesService rs = new RaicesService();
       r=rs.crearRaices();
       double discriminante = rs.getDiscriminante(r);
       rs.carcular(discriminante);
       */
       
       
       //Ejercicio Extra 4
       /*
       NIF nuevo = new NIF();
       NIFService ns = new NIFService();
       nuevo=ns.crearNIF();
       ns.mostrar(nuevo);
       */
       
       
       //Ejercicio Extra 5
       /*
       SecretoService sc = new SecretoService();
       sc.confirmarRespuesta();
       */
       
       
       //Ejercicio Extra 6
       
       AhorcadoService as = new AhorcadoService();
       as.juego();
       
       
    }
    
}
