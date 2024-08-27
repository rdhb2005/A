import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class GamePanel extends JPanel implements ActionListener {

    private final int TILE_SIZE = 25;
    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    private final LinkedList<Point> snake = new LinkedList<>();
    private Point food;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;

    private Color snakeColor = Color.PINK;
    private Color headColor = new Color(255, 105, 180);
    private int delay;
    private Runnable onExit;

    private JButton retryButton;
    private JButton exitButton;
    private JButton leaveButton;
    private int foodCount = 0;
    private JLabel foodCountLabel;

    public GamePanel(Color snakeColor, int delay, Runnable onExit) {
        this.snakeColor = snakeColor;
        this.delay = delay;
        this.onExit = onExit;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(34, 139, 34));
        setFocusable(true);

        foodCountLabel = new JLabel("Comida: 0", SwingConstants.CENTER);
        foodCountLabel.setForeground(Color.YELLOW);
        foodCountLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(foodCountLabel, BorderLayout.NORTH);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                }
            }
        });

        leaveButton = new JButton("Salir");
        leaveButton.setBounds(WIDTH - 80, HEIGHT - 50, 70, 30);
        leaveButton.setFocusable(false);

        leaveButton.addActionListener(e -> {
            if (onExit != null) {
                onExit.run();
            }
        });

        setLayout(null);
        add(leaveButton);

        initGame();
    }

    private void initGame() {
        running = true;
        direction = 'R';
        snake.clear();
        snake.add(new Point(WIDTH / 2, HEIGHT / 2));
        spawnFood();
        foodCount = 0;
        foodCountLabel.setText("Comida: " + foodCount);

        if (timer != null) {
            timer.stop();
        }
        timer = new Timer(delay, this);
        timer.start();

        removeButtons();
    }

    private void spawnFood() {
        int x = (int) (Math.random() * (WIDTH / TILE_SIZE)) * TILE_SIZE;
        int y = (int) (Math.random() * (HEIGHT / TILE_SIZE)) * TILE_SIZE;
        food = new Point(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            checkFood();
        }
        repaint();
    }

    private void move() {
        Point head = new Point(snake.getFirst());

        switch (direction) {
            case 'U':
                head.y -= TILE_SIZE;
                break;
            case 'D':
                head.y += TILE_SIZE;
                break;
            case 'L':
                head.x -= TILE_SIZE;
                break;
            case 'R':
                head.x += TILE_SIZE;
                break;
        }

        if (head.x < 0) head.x = WIDTH - TILE_SIZE;
        if (head.x >= WIDTH) head.x = 0;
        if (head.y < 0) head.y = HEIGHT - TILE_SIZE;
        if (head.y >= HEIGHT) head.y = 0;

        snake.addFirst(head);
        snake.removeLast();
    }

    private void checkCollision() {
        Point head = snake.getFirst();
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                timer.stop();
                showGameOverButtons();
            }
        }
    }

    private void checkFood() {
        if (snake.getFirst().equals(food)) {
            snake.add(new Point(food));
            spawnFood();
            foodCount++;
            foodCountLabel.setText("Comida: " + foodCount);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (running) {
            g.setColor(Color.RED);
            g.fillRect(food.x, food.y, TILE_SIZE, TILE_SIZE);

            for (int i = 1; i < snake.size(); i++) {
                Point p = snake.get(i);
                g.setColor(snakeColor);
                g.fillRect(p.x, p.y, TILE_SIZE, TILE_SIZE);
            }

            g.setColor(headColor);
            Point head = snake.getFirst();
            g.fillRect(head.x, head.y, TILE_SIZE, TILE_SIZE);

            g.setColor(Color.WHITE);
            g.fillOval(head.x + 5, head.y + 5, 10, 10);
            g.fillOval(head.x + 15, head.y + 5, 10, 10);

            g.setColor(Color.BLACK);
            g.fillOval(head.x + 7, head.y + 7, 5, 5);
            g.fillOval(head.x + 17, head.y + 7, 5, 5);
        } else {
            drawGameOverMessage(g);
        }
    }

    private void drawGameOverMessage(Graphics g) {
        String message = "Juego Terminado";
        Font font = new Font("Arial", Font.BOLD, 40);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(message, (WIDTH - metrics.stringWidth(message)) / 2, HEIGHT / 2 - 30);
    }

    private void showGameOverButtons() {
        retryButton = new JButton("Reintentar");
        exitButton = new JButton("Salir");

        retryButton.setBounds((WIDTH / 2) - 110, HEIGHT / 2 + 10, 120, 40);
        exitButton.setBounds((WIDTH / 2) + 10, HEIGHT / 2 + 10, 120, 40);

        retryButton.setFocusable(false);
        exitButton.setFocusable(false);

        retryButton.addActionListener(e -> {
            initGame();
            removeButtons();
        });

        exitButton.addActionListener(e -> {
            if (onExit != null) {
                onExit.run();
            }
        });

        setLayout(null);
        add(retryButton);
        add(exitButton);
        revalidate();
        repaint();
    }

    private void removeButtons() {
        if (retryButton != null && exitButton != null) {
            remove(retryButton);
            remove(exitButton);
            revalidate();
            repaint();
        }
    }
}
