
package gui;

import javax.swing.JOptionPane;
import jugador.AgregarJugador;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(370, 300);
        
        tablero = new Tablero();
        agregarJugador = new AgregarJugador();
        listaJugadores = new Jugadores(agregarJugador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jugarJButton = new javax.swing.JButton();
        salirJButton = new javax.swing.JButton();
        ingresarJugadorJButton1 = new javax.swing.JButton();
        mostrarJugadoresJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(373, 269));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(373, 269));

        jugarJButton.setBackground(new java.awt.Color(102, 255, 255));
        jugarJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jugarJButton.setForeground(new java.awt.Color(0, 0, 0));
        jugarJButton.setText("Jugar");
        jugarJButton.setBorder(null);
        jugarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarJButtonMouseClicked(evt);
            }
        });

        salirJButton.setBackground(new java.awt.Color(102, 255, 255));
        salirJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        salirJButton.setForeground(new java.awt.Color(0, 0, 0));
        salirJButton.setText("Salir");
        salirJButton.setBorder(null);
        salirJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirJButtonMouseClicked(evt);
            }
        });

        ingresarJugadorJButton1.setBackground(new java.awt.Color(102, 255, 255));
        ingresarJugadorJButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ingresarJugadorJButton1.setForeground(new java.awt.Color(0, 0, 0));
        ingresarJugadorJButton1.setText("Ingresar Jugador");
        ingresarJugadorJButton1.setBorder(null);
        ingresarJugadorJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarJugadorJButton1MouseClicked(evt);
            }
        });

        mostrarJugadoresJButton.setBackground(new java.awt.Color(102, 255, 255));
        mostrarJugadoresJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mostrarJugadoresJButton.setForeground(new java.awt.Color(0, 0, 0));
        mostrarJugadoresJButton.setText("Mostrar Jugadores");
        mostrarJugadoresJButton.setBorder(null);
        mostrarJugadoresJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarJugadoresJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresarJugadorJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarJugadoresJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jugarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresarJugadorJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mostrarJugadoresJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 370, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirJButtonMouseClicked
        try {
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe registro aun");
        }
        
    }//GEN-LAST:event_salirJButtonMouseClicked

    private void mostrarJugadoresJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarJugadoresJButtonActionPerformed
        
        try {
            listaJugadores.listarRegistro();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        listaJugadores.setVisible(true);
    }//GEN-LAST:event_mostrarJugadoresJButtonActionPerformed

    private void ingresarJugadorJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarJugadorJButton1MouseClicked
        agregarJugador.setVisible(true);
    }//GEN-LAST:event_ingresarJugadorJButton1MouseClicked

    private void jugarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarJButtonMouseClicked
        tablero.setVisible(true);
    }//GEN-LAST:event_jugarJButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarJugadorJButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugarJButton;
    private javax.swing.JButton mostrarJugadoresJButton;
    private javax.swing.JButton salirJButton;
    // End of variables declaration//GEN-END:variables
    private AgregarJugador agregarJugador;
    private Jugadores listaJugadores;
    private Tablero tablero;
}
