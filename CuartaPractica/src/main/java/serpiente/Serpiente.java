
package serpiente;

public class Serpiente {

    public Serpiente(int cabeza, int cola) {
        this.cabeza = cabeza;
        this.cola = cola;
    }
    
    public int getCabeza() {
        return cabeza;
    }

    public void setCabeza(int cabeza) {
        this.cabeza = cabeza;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Serpiente{" + "cabeza=" + cabeza + ", cola=" + cola + '}';
    }
    
    private int cabeza;
    private int cola;
}
