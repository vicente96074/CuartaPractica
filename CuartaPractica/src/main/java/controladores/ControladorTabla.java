package controladores;

import gui.RSScaleLabel;
import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tablero.Casilla;

public class ControladorTabla {

    public ControladorTabla(JFrame tablaFrame) {
        this.tablaFrame = tablaFrame;
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        tabla = new ArrayList<>();
        panelPrincipal = new JPanel();
        labelDado = new JLabel();
        imagenEscalada = new RSScaleLabel();
        resultaDado = new JLabel();
        tituloNomJLabel = new JLabel();
        tituloPosJLabel = new JLabel();
        nJugadores = new JComboBox<>();
        aceptar = new JButton();

        j1 = new JLabel();
        j2 = new JLabel();
        j3 = new JLabel();
        j4 = new JLabel();

        posJ1 = new JLabel();
        posJ2 = new JLabel();
        posJ3 = new JLabel();
        posJ4 = new JLabel();

        avatarJ1 = new JLabel("J1");
        avatarJ2 = new JLabel("J2");
        avatarJ3 = new JLabel("J3");
        avatarJ4 = new JLabel("J4");

        turno = new JLabel();
        tituloTurno = new JLabel();
        salir = new JButton();

        tablaFrame.setLayout(null);
        tablaFrame.setLocationRelativeTo(null);
        tablaFrame.setTitle("Escaleras y serpientes");
        tablaFrame.setSize(880, 900);
        tablaFrame.setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(51, 255, 204));
        panelPrincipal.setBounds(0, 0, 900, 900);
        panelPrincipal.setLayout(null);

        nJugadores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nJugadores.setBounds(620, 20, 100, 30);
        nJugadores.setForeground(new java.awt.Color(0, 0, 0));
        nJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2", "3", "4"}));

        aceptar.setText("ACEPTAR");
        aceptar.setBounds(725, 20, 120, 30);
        aceptar.setForeground(Color.BLACK);
        aceptar.setBackground(new java.awt.Color(102, 255, 255));
        aceptar.setFont(new java.awt.Font("Dialog", 1, 14));
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
        });

        salir.setText("SALIR");
        salir.setBounds(670, 600, 160, 40);
        salir.setForeground(Color.BLACK);
        salir.setBackground(new java.awt.Color(102, 255, 255));
        salir.setFont(new java.awt.Font("Dialog", 1, 22));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        resultaDado.setBounds(710, 400, 100, 50);
        resultaDado.setForeground(Color.black);
        resultaDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultaDado.setFont(new java.awt.Font("Dialog", 1, 24));

        tituloNomJLabel.setBounds(620, 50, 150, 50);
        tituloNomJLabel.setForeground(Color.black);
        tituloNomJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNomJLabel.setFont(new java.awt.Font("Dialog", 1, 16));
        tituloNomJLabel.setText("NOMBRE ");

        tituloPosJLabel.setBounds(720, 50, 150, 50);
        tituloPosJLabel.setForeground(Color.black);
        tituloPosJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPosJLabel.setFont(new java.awt.Font("Dialog", 1, 16));
        tituloPosJLabel.setText("POSICION");

        avatarJ1.setForeground(Color.red);
        avatarJ2.setForeground(Color.pink);
        avatarJ3.setForeground(Color.blue);
        avatarJ4.setForeground(Color.yellow);

        j1.setBounds(620, 100, 150, 50);
        j1.setForeground(Color.black);
        j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j1.setFont(new java.awt.Font("Dialog", 1, 16));

        posJ1.setBounds(720, 100, 150, 50);
        posJ1.setForeground(Color.red);
        posJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posJ1.setFont(new java.awt.Font("Dialog", 1, 16));

        j2.setBounds(620, 160, 150, 50);
        j2.setForeground(Color.black);
        j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j2.setFont(new java.awt.Font("Dialog", 1, 16));

        posJ2.setBounds(720, 160, 150, 50);
        posJ2.setForeground(Color.red);
        posJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posJ2.setFont(new java.awt.Font("Dialog", 1, 16));

        j3.setBounds(620, 220, 150, 50);
        j3.setForeground(Color.black);
        j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j3.setFont(new java.awt.Font("Dialog", 1, 16));

        posJ3.setBounds(720, 220, 150, 50);
        posJ3.setForeground(Color.red);
        posJ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posJ3.setFont(new java.awt.Font("Dialog", 1, 16));

        j4.setBounds(620, 280, 150, 50);
        j4.setForeground(Color.black);
        j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j4.setFont(new java.awt.Font("Dialog", 1, 16));

        posJ4.setBounds(720, 280, 150, 50);
        posJ4.setForeground(Color.red);
        posJ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posJ4.setFont(new java.awt.Font("Dialog", 1, 16));

        turno.setBounds(720, 350, 150, 50);
        turno.setForeground(Color.blue);
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setFont(new java.awt.Font("Dialog", 1, 16));

        tituloTurno.setBounds(620, 350, 150, 50);
        tituloTurno.setForeground(Color.black);
        tituloTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTurno.setFont(new java.awt.Font("Dialog", 1, 16));
        tituloTurno.setText("Turno de: ");

        labelDado.setBounds(710, 450, 100, 100);
        labelDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDadoJLabelMouseClicked(evt);
            }
        });

        tablaFrame.add(panelPrincipal);
        panelPrincipal.add(labelDado);
        panelPrincipal.add(resultaDado);
        panelPrincipal.add(nJugadores);
        panelPrincipal.add(tituloNomJLabel);
        panelPrincipal.add(tituloPosJLabel);
        panelPrincipal.add(j1);
        panelPrincipal.add(j2);
        panelPrincipal.add(j3);
        panelPrincipal.add(j4);
        panelPrincipal.add(posJ1);
        panelPrincipal.add(posJ2);
        panelPrincipal.add(posJ3);
        panelPrincipal.add(posJ4);
        panelPrincipal.add(turno);
        panelPrincipal.add(tituloTurno);
        panelPrincipal.add(aceptar);
        panelPrincipal.add(salir);

        limpiarJugadores();
        generarTablero();
        agregarImagen();
        //iniciarJugadores();
    }

    public void generarTablero() {
        int filaImpar = 0;
        int columna = 0;

        for (int i = 0; i < 10; i++) {    //generamos a las filas
            columna = 1;
            if (filaImpar % 2 != 0) {
                idCasilla = idCasilla - 9;
            } else {
                idCasilla -= 11;
            }

            for (int j = 0; j < 10; j++) {
                if (filaImpar % 2 != 0) {
                    Casilla casilla = new Casilla(idCasilla, (filaImpar + 1), columna, posX, posY);
                    panelPrincipal.add(casilla);
                    tabla.add(casilla);
                    posX += 60;
                    idCasilla++;
                } else {
                    Casilla casilla = new Casilla(idCasilla, (filaImpar + 1), columna, posX, posY);
                    panelPrincipal.add(casilla);
                    tabla.add(casilla);
                    posX += 60;
                    idCasilla--;
                }
                columna++;
            }
            posX = 10;
            posY += 60;
            filaImpar++;
        }
    }

    private void agregarImagen() {
        URL url1 = getClass().getResource("/imagenes/dado.png");
        imagenEscalada.setImagenLocal(labelDado, url1);
    }

    private int dado() {
        int numeroAleatorio = (int) (Math.random() * (6) + 1);
        return numeroAleatorio;
    }

    public void labelDadoJLabelMouseClicked(java.awt.event.MouseEvent evt) {
        int res = dado();
        resultaDado.setText(String.valueOf(res));
        moverJugador();
    }

    public void salirMouseClicked(java.awt.event.MouseEvent evt) {
        this.tablaFrame.hide();
    }

    public void aceptarMouseClicked(java.awt.event.MouseEvent evt) {
        String j = (String) nJugadores.getSelectedItem();
        nJ = Integer.parseInt(j);
        iniciarJugadores();
        aceptar.setEnabled(false);
    }

    public void iniciarJugadores() {
        limpiarJugadores();
        int pos = 0;
        for (int i = 0; i < 100; i++) {
            if (tabla.get(i).getId() == 1) {
                pos = i;
                break;
            }
        }

        for (int i = 1; i <= nJ; i++) {
            agregarAvatar(pos, i);
        }
    }

    public void moverJugador() {
        if (turnoDado == 1) {
            turno.setText(String.valueOf(j1.getText()));
            int posActual = Integer.parseInt(posJ1.getText());
            int posNueva = posActual + Integer.parseInt(resultaDado.getText());
            quitarJLabel(posActual, avatarJ1);
            agregarAvatar(posNueva, 1);
            turnoDado++;
            posJ1.setText(String.valueOf(posNueva));

        } else if (turnoDado == 2) {
            turno.setText(String.valueOf(j2.getText()));
            int posActual = Integer.parseInt(posJ2.getText());
            int posNueva = posActual + Integer.parseInt(resultaDado.getText());
            quitarJLabel(posActual, avatarJ2);
            agregarAvatar(posNueva, 2);
            turnoDado++;
            posJ2.setText(String.valueOf(posNueva));

        } else if (turnoDado == 3) {
            turno.setText(String.valueOf(j3.getText()));
            int posActual = Integer.parseInt(posJ3.getText());
            int posNueva = posActual + Integer.parseInt(resultaDado.getText());
            quitarJLabel(posActual, avatarJ3);
            agregarAvatar(posNueva, 3);
            turnoDado++;
            posJ3.setText(String.valueOf(posNueva));

        } else if (turnoDado == 4) {
            turno.setText(String.valueOf(j4.getText()));
            int posActual = Integer.parseInt(posJ4.getText());
            int posNueva = posActual + Integer.parseInt(resultaDado.getText());
            quitarJLabel(posActual, avatarJ4);
            agregarAvatar(posNueva, 4);
            turnoDado++;
            turnoDado = 1;
            posJ4.setText(String.valueOf(posNueva));

        }
    }

    public void quitarJLabel(int pos, JLabel label) {
        tabla.get(pos).remove(label);
        this.tablaFrame.pack();
    }

    public void agregarAvatar() {

    }

    private void agregarAvatar(int pos, int j) {
        switch (j) {
            case 1:
                tabla.get(pos).add(avatarJ1);
                break;
            case 2:
                tabla.get(pos).add(avatarJ2);
                break;
            case 3:
                tabla.get(pos).add(avatarJ3);
                break;
            case 4:
                tabla.get(pos).add(avatarJ4);
                break;
        }
        this.tablaFrame.pack();
    }

    private void limpiarJugadores() {
        aceptar.setEnabled(true);
        j1.setText(String.valueOf("Jugador 1"));
        j2.setText(String.valueOf("Jugador 2"));
        j3.setText(String.valueOf("Jugador 3"));
        j4.setText(String.valueOf("Jugador 4"));
        posJ1.setText(String.valueOf(0));
        posJ2.setText(String.valueOf(0));
        posJ3.setText(String.valueOf(0));
        posJ4.setText(String.valueOf(0));
        turno.setText(String.valueOf(j1.getText()));
    }

    private JFrame tablaFrame;
    private ArrayList<Casilla> tabla;
    private int idCasilla = 111;
    private int posX = 10;
    private int posY = 10;
    private JPanel panelPrincipal;
    private JLabel labelDado;
    private RSScaleLabel imagenEscalada;
    private JLabel tituloNomJLabel;
    private JLabel tituloPosJLabel;
    private JLabel resultaDado;
    private JLabel j1;
    private JLabel j2;
    private JLabel j3;
    private JLabel j4;
    private JLabel posJ1;
    private JLabel posJ2;
    private JLabel posJ3;
    private JLabel posJ4;
    private JLabel turno;
    private JLabel tituloTurno;
    private JButton salir;
    private JComboBox<String> nJugadores;
    private JButton aceptar;
    private JLabel avatarJ1;
    private JLabel avatarJ2;
    private JLabel avatarJ3;
    private JLabel avatarJ4;
    private int nJ;
    private int turnoDado = 1;
}
