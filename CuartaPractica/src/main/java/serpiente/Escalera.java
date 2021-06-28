
package serpiente;

public class Escalera {

    public Escalera(int cima, int base) {
        this.cima = cima;
        this.base = base;
    }
    
    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    private int cima;
    private int base;
}
