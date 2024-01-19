import javax.swing.*;
import java.awt.*;
public class ChessBoardExample extends JFrame {
    private static final int SIZE = 8;
    private static final int SQUARE_SIZE = 50;
    public ChessBoardExample() {
        setTitle("Chess Board Example");
        setSize(SIZE * SQUARE_SIZE, SIZE * SQUARE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawChessBoard(g);
            }

            private void drawChessBoard(Graphics g) {
                for (int row = 0; row < SIZE; row++) {
                    for (int col = 0; col < SIZE; col++) {
                        Color squareColor = (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
                        g.setColor(squareColor);
                        g.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
                    }
                }
            }
        };
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChessBoardExample example = new ChessBoardExample();
            example.setVisible(true);
        });
    }
}