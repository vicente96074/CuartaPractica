
package jugador;

import java.util.Objects;

public class Jugador {

    public Jugador(int id, String nombre, String apellido, int partidasJugadas, int partidasGandas, int partidasPerdidas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidasJugadas = partidasJugadas;
        this.partidasGandas = partidasGandas;
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGandas() {
        return partidasGandas;
    }

    public void setPartidasGandas(int partidasGandas) {
        this.partidasGandas = partidasGandas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.partidasJugadas != other.partidasJugadas) {
            return false;
        }
        if (this.partidasGandas != other.partidasGandas) {
            return false;
        }
        if (this.partidasPerdidas != other.partidasPerdidas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", partidasJugadas=" + partidasJugadas + ", partidasGandas=" + partidasGandas + ", partidasPerdidas=" + partidasPerdidas + '}';
    }
    
    
    
    
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGandas;
    private int partidasPerdidas;
}
