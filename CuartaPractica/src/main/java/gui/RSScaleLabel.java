
package gui;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RSScaleLabel extends javax.swing.JFrame{
    
    //Estabecer una imagen a un jLabel
    public void setScaleLabel(JLabel label, String ruta) {
        ImageIcon fot = new ImageIcon(ruta);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
        label.setIcon(icono);
    }
    
    public void setImagenLocal(JLabel label, URL ruta){
        ImageIcon fot = new ImageIcon(ruta);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
        label.setIcon(icono);
    }

}
