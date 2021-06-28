package jugador;

import java.util.ArrayList;

public class Proceso {

    private ArrayList<Jugador> a = new ArrayList<Jugador>();

    public Proceso() {
        
    }

    public Proceso(ArrayList<Jugador> a) {
        this.a = a;
    }

    public void agregarRegistro(Jugador jugador) {
        this.a.add(jugador);
    }

    public void modificarRegistro(int i, Jugador jugador) {
        this.a.set(i, jugador);
    }

    public void eliminarRegistro(int i) {
        this.a.remove(i);
    }

    public Jugador obtenerRegistro(int i) {
        return (Jugador) a.get(i);
    }

    public int cantidadRegistro() {
        return this.a.size();
    }

    public boolean buscaId(int id) {
        for (int i = 0; i < cantidadRegistro(); i++) {
            if (id == obtenerRegistro(i).getId()) {
                return true;
            }
        }
        return false;
    }

}
