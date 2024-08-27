import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Personaje {
    Laberinto lab = new Laberinto();
    int x = 40;
    int y = 40;
    int ancho = 40;
    int alto = 40;
    int movimiento = 40;

    public void paint(Graphics grafico){
        grafico.setColor(Color.orange);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);

        // Ojos
        grafico.setColor(Color.white);
        grafico.fillOval(x + 7, y + 8, 13, 13);
        grafico.fillOval(x + 21, y + 8, 13, 13);
        grafico.setColor(Color.black);
        grafico.fillOval(x + 11, y + 12, 5, 5); // Ojo izquierdo
        grafico.fillOval(x + 25, y + 12, 5, 5); // Ojo derecho

        // Boca
        grafico.setColor(Color.magenta);
        grafico.fillOval(x + 7, y + 24, 27, 7);
    }

    public void teclaPresionada(KeyEvent evento){
        int [][] laberinto = lab.obtieneLaberinto();

        if(evento.getKeyCode() == 37){ // Izquierda
            if(laberinto[y / 40][(x / 40) - 1] != 1){
                x = x - movimiento;
            }
        }
        if(evento.getKeyCode() == 39){ // Derecha
            if(laberinto[y / 40][(x / 40) + 1] != 1){
                x = x + movimiento;
            }
        }
        if(evento.getKeyCode() == 40){ // Abajo
            if(laberinto[(y / 40) + 1][x / 40] != 1){
                y = y + movimiento;
            }
        }
        if(evento.getKeyCode() == 38){ // Arriba
            if(laberinto[(y / 40) - 1][x / 40] != 1){
                y = y - movimiento;
            }
        }

        // Si llega al final pasar al siguiente nivel
        if(x == 840 && y == 440){
            JLaberinto.cambiaNivel();
            x = 40;
            y = 40;
        }
    }
}



