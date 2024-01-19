import javax.swing.*;
import java.awt.*;

public class BlueBoxExample extends JFrame {
    public BlueBoxExample(){
        setTitle("Blue Box Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 200, 200);
            }
        };
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BlueBoxExample example = new BlueBoxExample();
            example.setVisible(true);
        });
    }
}
