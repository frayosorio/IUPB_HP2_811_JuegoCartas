import java.util.Random;

import javax.swing.JPanel;

public class Jugador {
    private final int TOTAL_CARTAS = 10;
    private final int MARGEN_IZQUIERDA = 10;
    private final int MARGEN_SUPERIOR = 10;
    private final int DISTANCIA=40;

    private Random r = new Random();
    private Carta[] cartas = new Carta[TOTAL_CARTAS];

    public void repartir() {
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.setLayout(null);
        pnl.removeAll();
        int xCarta = MARGEN_IZQUIERDA+TOTAL_CARTAS*DISTANCIA;
        for (Carta carta : cartas) {
            carta.mostrar(xCarta, MARGEN_SUPERIOR, pnl);
            xCarta -= DISTANCIA;
        }
        pnl.repaint();
    }
}
