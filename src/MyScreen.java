import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class MyScreen extends JFrame {
    public MyScreen() {
        setVisible(true);
        setSize(new Dimension(500, 500));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
