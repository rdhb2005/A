import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JLaberinto extends JPanel {
    Laberinto laberinto;
    Personaje personaje;
    public static int nivel = 1;
    private JFrame ventanaActual;
    private JButton leaveButton;

    public JLaberinto(JFrame ventana) {
        laberinto = new Laberinto();  
        personaje = new Personaje();  
        this.ventanaActual = ventana;

        leaveButton = new JButton("Salir");
        leaveButton.setBounds(830, 5, 70, 30); 
        leaveButton.setFocusable(false);
        leaveButton.addActionListener(e -> {
            ventanaActual.dispose();
            java.awt.EventQueue.invokeLater(() -> {
                Juegos ventanaJuegos = new Juegos();
                ventanaJuegos.setVisible(true);
            });
        });

        // Configuración del panel
        setLayout(null);
        add(leaveButton); // Agrega el botón al panel

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
                repaint();  
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics grafico) {
        super.paintComponent(grafico); 
        laberinto.paint(grafico);  
        personaje.paint(grafico);  
        
    }

    public static int cambiaNivel() {
        return nivel++;
    }

    public static int obtieneNivel() {
        return nivel;
    }

    public static void main(String[] args) {
        JFrame miVentana = new JFrame("Maze Game");
        JLaberinto game = new JLaberinto(miVentana);

        miVentana.add(game);
        miVentana.setSize(920, 540); 
        miVentana.setLocationRelativeTo(null); 
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            game.repaint();

            if (obtieneNivel() > 3) {
                JOptionPane.showMessageDialog(null, "You reached the end");

                miVentana.dispose();

                java.awt.EventQueue.invokeLater(() -> {
                    Juegos ventanaJuegos = new Juegos();
                    ventanaJuegos.setVisible(true);
                });

                break;  
            }
        }
        
    }
}
