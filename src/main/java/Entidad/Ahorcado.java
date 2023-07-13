package Entidad;

public class Ahorcado {
    private String[] palabra;
    private int turnos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int turnos) {
        this.palabra = palabra;
        this.turnos = turnos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    
    
}
