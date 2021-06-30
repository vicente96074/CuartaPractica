
package tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Casilla extends JPanel{

    public Casilla(int id, int fila, int columna, int posX, int posY) {
        this.setBounds(posX, posY, 60, 60);
        //this.setLayout(null);
        textoId = new JLabel(String.valueOf(id));
        textoId.setBounds(10,10,60,60);
        textoId.setForeground(Color.BLACK);
        add(textoId);
        this.id = id;
        this.posX = posX;
        this.posY = posY;
        this.fila = fila;
        this.columna = columna;
    }

    public int getId() {
        return id;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
  
    
    private final int id;
    private final int posX;
    private final int posY;
    private JLabel textoId;
    private int fila;
    private int columna;
}
