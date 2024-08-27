import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Bars {

    private JProgressBar IconoCa;
    private JProgressBar IconoAg;
    private JProgressBar IconoPi;
    private javax.swing.Timer timer;
    private boolean imageShown = false; 

    public Bars(JProgressBar iconoCa, JProgressBar iconoAg, JProgressBar iconoPi) {
        this.IconoCa = iconoCa;
        this.IconoAg = iconoAg;
        this.IconoPi = iconoPi;

        IconoCa.setValue(10);
        IconoCa.setStringPainted(true);
        
        IconoAg.setValue(50);
        IconoAg.setStringPainted(true);
        
        IconoPi.setValue(50);
        IconoPi.setStringPainted(true);

        timer = new javax.swing.Timer(800, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isAnyBarAtZero = false;

                if (IconoCa.getValue() > 0) {
                    IconoCa.setValue(IconoCa.getValue() - 1);
                } else {
                    isAnyBarAtZero = true;
                }

                if (IconoAg.getValue() > 0) {
                    IconoAg.setValue(IconoAg.getValue() - 1);
                } else {
                    isAnyBarAtZero = true;
                }

                if (IconoPi.getValue() > 0) {
                    IconoPi.setValue(IconoPi.getValue() - 1);
                } else {
                    isAnyBarAtZero = true;
                }

                if (isAnyBarAtZero && !imageShown) {
                    imageShown = true; 
                    timer.stop();
                    openNewWindow();
                }
            }
        });
        timer.start();
    }

    public void openNewWindow() {
        JFrame newFrame = new JFrame("Imagen de Fin");
        newFrame.setSize(400, 400);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setLocationRelativeTo(null);

        URL imageUrl = getClass().getResource("/imagenes/Dead.jpeg");
        if (imageUrl != null) {
            ImageIcon originalIcon = new ImageIcon(imageUrl);
            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            
            JLabel imageLabel = new JLabel(resizedIcon);

            newFrame.add(imageLabel);
            newFrame.setVisible(true);

            new javax.swing.Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            }).start();
        }
    }

    public JProgressBar getProgresoBar1() {
        return IconoCa;
    }

    public JProgressBar getProgresoBar2() {
        return IconoAg;
    }

    public JProgressBar getProgresoBar3() {
        return IconoPi;
    }

    public void setProgresoBar1Value(int value) {
        IconoCa.setValue(value);
    }

    public void setProgresoBar2Value(int value) {
        IconoAg.setValue(value);
    }

    public void setProgresoBar3Value(int value) {
        IconoPi.setValue(value);
    }

    public int getProgresoBar1Value() {
        return IconoCa.getValue();
    }

    public int getProgresoBar2Value() {
        return IconoAg.getValue();
    }

    public int getProgresoBar3Value() {
        return IconoPi.getValue();
    }
}
