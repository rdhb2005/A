import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame(Color snakeColor, int delay, Runnable onExit) {
        setTitle("Juego del gusano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        GamePanel gamePanel = new GamePanel(snakeColor, delay, onExit);
        add(gamePanel);
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
