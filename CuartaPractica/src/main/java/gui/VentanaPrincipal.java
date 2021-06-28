
package gui;

import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(900, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jugarJButton = new javax.swing.JButton();
        salirJButton = new javax.swing.JButton();
        jugadoresJButton = new javax.swing.JButton();

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

        jugadoresJButton.setBackground(new java.awt.Color(102, 255, 255));
        jugadoresJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jugadoresJButton.setForeground(new java.awt.Color(0, 0, 0));
        jugadoresJButton.setText("Mostrar Jugadores");
        jugadoresJButton.setBorder(null);
        jugadoresJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jugadoresJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jugarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jugarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jugadoresJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 373, 269);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugadoresJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugadoresJButtonActionPerformed

    private void salirJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirJButtonMouseClicked
        try {
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_salirJButtonMouseClicked

    public void otrosComponentes(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugadoresJButton;
    private javax.swing.JButton jugarJButton;
    private javax.swing.JButton salirJButton;
    // End of variables declaration//GEN-END:variables
}
