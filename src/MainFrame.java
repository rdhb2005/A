import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(Juegos juegos) {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Color snakeColor = Color.PINK;
        int difficulty = 100;

        SwingUtilities.invokeLater(() -> {
            new GameFrame(snakeColor, difficulty, () -> {
                juegos.setVisible(true);
                this.setVisible(false);
            }).setVisible(true);
        });

        setLocationRelativeTo(null);
    }
}
