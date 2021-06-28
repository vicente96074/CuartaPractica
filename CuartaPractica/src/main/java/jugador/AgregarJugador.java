package jugador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class AgregarJugador extends javax.swing.JFrame {

    public AgregarJugador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Jugador");
        proceso = new Proceso();
        
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
        panelPrincipal.setBounds(0, 0, 370, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirJButtonMouseClicked
        this.hide();
    }//GEN-LAST:event_salirJButtonMouseClicked

    private void limpiarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarJButtonMouseClicked
        //Limpiamos a los dos cajas de texto
        limpiarCajas();
    }//GEN-LAST:event_limpiarJButtonMouseClicked

    private void ingresarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarJButtonMouseClicked
        ingresarRegistro();
        
    }//GEN-LAST:event_ingresarJButtonMouseClicked

    public void ingresarRegistro() {
        try {
            if (leerNombre() == null) mensaje("Ingresar nombre");  
            else if (leerApellido() == null) mensaje("Ingresar apellido");
            else {
                do {
                    idJugador++;
                    j = new Jugador(idJugador,leerNombre(),leerApellido(), 0, 0, 0);
                } while (proceso.buscaId(j.getId()));

                proceso.agregarRegistro(j);
                grabarBinario();
                limpiarCajas();
                mensaje("Jugador agregado exitosamente");
            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    private void grabarBinario() throws IOException {
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter("jugadores.dat");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < proceso.cantidadRegistro(); i++){
                j = proceso.obtenerRegistro(i);
                pw.println((String)(j.getId()+", "+ j.getNombre()+", "+ j.getApellido()+", "+ j.getPartidasJugadas()+", "+ j.getPartidasGandas()+", "+ j.getPartidasPerdidas()));
            }
             pw.close();
            mensaje("Grabación de datos exitosa");
        }catch(Exception ex){
            mensaje("Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    private String leerNombre() {
        if(!nombreJTextField.getText().isEmpty()){
            return nombreJTextField.getText();
        }
        return null;
    }

    private String leerApellido() {
        if(!apellidoJTextField.getText().isEmpty()){
            return apellidoJTextField.getText();
        }
        return null;
    }

    private void limpiarCajas() {
        nombreJTextField.setText("");
        apellidoJTextField.setText("");
    }

    public void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public Proceso getProceso() {
        return proceso;
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
    
    private int idJugador = 0;
    private Proceso proceso;
    private Jugador j;
}
