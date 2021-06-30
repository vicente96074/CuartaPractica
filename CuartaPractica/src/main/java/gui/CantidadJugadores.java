
package gui;

public class CantidadJugadores extends javax.swing.JFrame {

    public CantidadJugadores() {
        setTitle("Cantidad jugadores");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jugadoresJCB = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        tituloJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 239));
        setMinimumSize(new java.awt.Dimension(360, 239));
        setPreferredSize(new java.awt.Dimension(360, 239));
        getContentPane().setLayout(null);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(360, 239));

        jugadoresJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jugadoresJCB.setForeground(new java.awt.Color(0, 0, 0));
        jugadoresJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        btnAceptar.setBackground(new java.awt.Color(51, 255, 0));
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        tituloJL.setForeground(new java.awt.Color(0, 0, 0));
        tituloJL.setText("Seleccione la cantidad de jugadores");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tituloJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jugadoresJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tituloJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jugadoresJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 360, 239);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String j = (String)jugadoresJCB.getSelectedItem();
        jugadores = Integer.parseInt(j);
        hide();
    }//GEN-LAST:event_btnAceptarMouseClicked
    
    public static int getJugadores(){
        return jugadores;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> jugadoresJCB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel tituloJL;
    // End of variables declaration//GEN-END:variables
    static int jugadores = 0;
}
