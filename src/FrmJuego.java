import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FrmJuego extends JFrame {

    public FrmJuego() {
        setSize(800, 400);
        setTitle("Juego de Cartas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JButton btnRepartir=new JButton("Repartir");
        btnRepartir.setBounds(10,10,100,25);
        add(btnRepartir);

        JButton btnVerificar=new JButton("Verificar");
        btnVerificar.setBounds(120,10,100,25);
        add(btnVerificar);

        JTabbedPane tpJugadores=new JTabbedPane();
        tpJugadores.setBounds(10, 50, getWidth()-40, getHeight()-100);
        add(tpJugadores);

        JPanel pnlJugador1=new JPanel();
        pnlJugador1.setBackground(new Color(0, 255, 0));
        JPanel pnlJugador2=new JPanel();
        pnlJugador2.setBackground(new Color(0, 255, 255));


        tpJugadores.add(pnlJugador1, "Martín Estrada Contreras");
        tpJugadores.add(pnlJugador2, "Raul Vidal");

    }

}
