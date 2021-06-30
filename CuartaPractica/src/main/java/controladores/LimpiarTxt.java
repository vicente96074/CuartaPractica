
package controladores;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LimpiarTxt {
    
    public void limpiar_texto(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setText("");
            } else if(panel.getComponents()[i] instanceof JLabel){
                ((JLabel)panel.getComponents()[i]).setText("");
            }
        }
    }
    
}
