package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import jugador.AgregarJugador;
import jugador.Jugador;
import jugador.imgTabla;

public class Jugadores extends javax.swing.JFrame {

    public Jugadores(AgregarJugador agregarJugador) {
        initComponents();
        this.agregarJugador = agregarJugador;
        try {
            cargarBinario();
            listarRegistro();
        } catch (Exception e) {
            this.agregarJugador.mensaje("No existe registro aún");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        tituloJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJLabel.setText("Todos los jugadores");

        tablaJugadores.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadores.setForeground(new java.awt.Color(0, 0, 0));
        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Partidas jugadas", "Partidas ganadas", "Partidas perdidas"
            }
        ));
        jScrollPane1.setViewportView(tablaJugadores);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(tituloJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloJLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarBinario() {
        File ruta = new File("jugadores.dat");
        try {

            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                
                StringTokenizer st = new StringTokenizer(linea, ", ");
                j = new Jugador();
                j.setId(Integer.parseInt(st.nextToken()));
                j.setNombre((String)(st.nextToken()));
                j.setApellido((String)(st.nextToken()));
                j.setPartidasJugadas(Integer.parseInt(st.nextToken()));
                j.setPartidasGandas(Integer.parseInt(st.nextToken()));
                j.setPartidasPerdidas(Integer.parseInt(st.nextToken()));
                this.agregarJugador.getProceso().agregarRegistro(j);
            }

            bu.close();
        } catch (Exception ex) {
            this.agregarJugador.mensaje("Error al cargar archivo: " + ex.getMessage());
        }
    }

    public void listarRegistro() {
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Id");
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("P. jugadas");
        dt.addColumn("P. ganadas");
        dt.addColumn("P. perdidas");

        tablaJugadores.setDefaultRenderer(Object.class, new imgTabla());

        Object fila[];
        fila = new Object[tablaJugadores.getColumnCount()];
        for (int i = 0; i < agregarJugador.getProceso().cantidadRegistro(); i++) {
            j = agregarJugador.getProceso().obtenerRegistro(i);
            fila[0] = j.getId();
            fila[1] = j.getNombre();
            fila[2] = j.getApellido();
            fila[3] = j.getPartidasJugadas();
            fila[4] = j.getPartidasGandas();
            fila[5] = j.getPartidasPerdidas();
            dt.addRow(fila);
        }

        tablaJugadores.setModel(dt);
        tablaJugadores.setRowHeight(60);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaJugadores;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables

    private Jugador j;
    private AgregarJugador agregarJugador;
}
