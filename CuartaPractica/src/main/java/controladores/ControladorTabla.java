package controladores;

import gui.RSScaleLabel;
import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jugador.Jugador;
import tablero.Casilla;

public class ControladorTabla {

    public ControladorTabla(JFrame tablaFrame) {
        this.tablaFrame = tablaFrame;
        jugadores = new Jugador[4];
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
        
        j1 = new JLabel();
        j2 = new JLabel();
        j3 = new JLabel();
        j4 = new JLabel();
        
        posJ1 = new JLabel();
        posJ2 = new JLabel();
        posJ3 = new JLabel();
        posJ4 = new JLabel();
        
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
        panelPrincipal.add(salir);

        limpiarJugadores();
        generarTablero();
        agregarImagen();
        iniciarJugadores();
    }

    public void generarTablero() {
        int filaImpar = 0;

        for (int i = 0; i < 10; i++) {    //generamos a las filas
            if (filaImpar % 2 != 0) {
                idCasilla = idCasilla - 9;
            } else {
                idCasilla -= 11;
            }

            for (int j = 0; j < 10; j++) {
                if (filaImpar % 2 != 0) {
                    Casilla casilla = new Casilla(idCasilla, posX, posY);
                    panelPrincipal.add(casilla);
                    tabla.add(casilla);
                    posX += 60;
                    idCasilla++;
                } else {
                    Casilla casilla = new Casilla(idCasilla, posX, posY);
                    panelPrincipal.add(casilla);
                    tabla.add(casilla);
                    posX += 60;
                    idCasilla--;
                }

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
    }

    public void salirMouseClicked(java.awt.event.MouseEvent evt) {
        this.tablaFrame.hide();
    }
    
    private void iniciarJugadores(){
        avatarJ1 = new JLabel("J1");
        avatarJ1.setForeground(Color.red);
        int pos = 0;
        for(int i=0; i<100; i++){
            if(tabla.get(i).getId() == 1){
                pos = i;
                break;
            }
        }
        System.out.println("pos "+pos);
        tabla.get(pos).add(avatarJ1);
    }
    
    private void limpiarJugadores() {
        j1.setText(String.valueOf("Jugador 1"));
        j2.setText(String.valueOf("Jugador 2"));
        j3.setText(String.valueOf("Jugador 3"));
        j4.setText(String.valueOf("Jugador 4"));
        posJ1.setText(String.valueOf(0));
        posJ2.setText(String.valueOf(0));
        posJ3.setText(String.valueOf(0));
        posJ4.setText(String.valueOf(0));
        turno.setText(String.valueOf(j1.getText()));
        //turno.setText(String.valueOf(jugadores[0]));
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
    private Jugador[] jugadores;
    
    private JLabel avatarJ1;
    private JLabel avatarJ2;
    private JLabel avatarJ3;
    private JLabel avatarJ4;
}
