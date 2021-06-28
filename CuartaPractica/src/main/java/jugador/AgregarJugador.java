
package jugador;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AgregarJugador extends javax.swing.JFrame {

    public AgregarJugador() {
        initComponents();
        jugadores = new ArrayList<>();
        proceso = new Proceso(jugadores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();
        nombreJLabel = new javax.swing.JLabel();
        apellidoJLabel = new javax.swing.JLabel();
        nombreJTextField = new javax.swing.JTextField();
        apellidoJTextField = new javax.swing.JTextField();
        ingresarJButton = new javax.swing.JButton();
        limpiarJButton = new javax.swing.JButton();
        salirJButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(330, 260));
        setMinimumSize(new java.awt.Dimension(330, 260));
        setPreferredSize(new java.awt.Dimension(330, 260));
        getContentPane().setLayout(null);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(330, 226));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(330, 226));
        panelPrincipal.setLayout(null);

        tituloJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJLabel.setText("Ingresar datos de jugador");
        panelPrincipal.add(tituloJLabel);
        tituloJLabel.setBounds(19, 27, 273, 32);

        nombreJLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreJLabel.setText("Nombre:");
        panelPrincipal.add(nombreJLabel);
        nombreJLabel.setBounds(19, 81, 70, 25);

        apellidoJLabel.setForeground(new java.awt.Color(0, 0, 0));
        apellidoJLabel.setText("Apellido");
        panelPrincipal.add(apellidoJLabel);
        apellidoJLabel.setBounds(19, 118, 70, 33);

        nombreJTextField.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTextField.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(nombreJTextField);
        nombreJTextField.setBounds(101, 77, 191, 23);

        apellidoJTextField.setBackground(new java.awt.Color(255, 255, 255));
        apellidoJTextField.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(apellidoJTextField);
        apellidoJTextField.setBounds(101, 123, 191, 23);

        ingresarJButton.setBackground(new java.awt.Color(153, 153, 153));
        ingresarJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ingresarJButton.setForeground(new java.awt.Color(0, 0, 0));
        ingresarJButton.setText("INGRESAR");
        ingresarJButton.setBorder(null);
        ingresarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarJButtonMouseClicked(evt);
            }
        });
        panelPrincipal.add(ingresarJButton);
        ingresarJButton.setBounds(19, 169, 96, 32);

        limpiarJButton.setBackground(new java.awt.Color(153, 153, 153));
        limpiarJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpiarJButton.setForeground(new java.awt.Color(0, 0, 0));
        limpiarJButton.setText("LIMPIAR");
        limpiarJButton.setBorder(null);
        limpiarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarJButtonMouseClicked(evt);
            }
        });
        panelPrincipal.add(limpiarJButton);
        limpiarJButton.setBounds(127, 169, 82, 32);

        salirJButton.setBackground(new java.awt.Color(153, 153, 153));
        salirJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salirJButton.setForeground(new java.awt.Color(0, 0, 0));
        salirJButton.setText("SALIR");
        salirJButton.setBorder(null);
        salirJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirJButtonMouseClicked(evt);
            }
        });
        panelPrincipal.add(salirJButton);
        salirJButton.setBounds(221, 169, 71, 32);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 330, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirJButtonMouseClicked
         try {
            System.exit(0);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_salirJButtonMouseClicked

    private void limpiarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarJButtonMouseClicked
        //Limpiamos a los dos cajas de texto
        nombreJTextField.setText("");
        apellidoJTextField.setText("");
    }//GEN-LAST:event_limpiarJButtonMouseClicked

    private void ingresarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarJButtonMouseClicked
        
        for(int i=0; i<proceso.cantidadRegistro(); i++){
            if(proceso.buscaId(idJugador)){
                idJugador++;
            }
        }
        
        if(nombreJTextField.getText() != null && apellidoJTextField.getText() != null ){
            String nombre = nombreJTextField.getText();
            String apellido = apellidoJTextField.getText();
            Jugador jugador = new Jugador(idJugador, nombre, apellido, 0, 0, 0);
            jugadores.add(jugador);
            try {
                grabarBinario();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese nombre y apellido del jugador");
        }
        
    }//GEN-LAST:event_ingresarJButtonMouseClicked

    private void grabarBinario() throws IOException{
        File file = new File("jugadores.dat");
        if(!file.exists()){
            file.createNewFile();
        }
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        
        //Escribimos al archivo binario
        for(Jugador j: jugadores){
            dos.writeInt(j.getId());
            dos.writeUTF(j.getNombre());
            dos.writeUTF(j.getApellido());
            dos.writeInt(j.getPartidasJugadas());
            dos.writeInt(j.getPartidasGandas());
            dos.writeInt(j.getPartidasPerdidas());
        }
        
        dos.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoJLabel;
    private javax.swing.JTextField apellidoJTextField;
    private javax.swing.JButton ingresarJButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel nombreJLabel;
    private javax.swing.JTextField nombreJTextField;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton salirJButton;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Jugador> jugadores;
    private int idJugador = 0;
    private Proceso proceso;
}
