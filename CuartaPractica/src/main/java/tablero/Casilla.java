
package tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Casilla extends JPanel{

    public Casilla(int id, int posX, int posY) {
        this.setBounds(posX, posY, 70, 70);
        textoId = new JLabel(String.valueOf(id));
        textoId.setBounds(10,10,20,20);
        textoId.setForeground(Color.BLACK);
        add(textoId);
        this.id = id;
        this.posX = posX;
        this.posY = posY;
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
    
    private final int id;
    private final int posX;
    private final int posY;
    private JLabel textoId;
}
