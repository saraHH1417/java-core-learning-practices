package Swing;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel implements ColorChangeListener {
    public MainPanel() {
        setBackground(Color.green);
    }

    public void changeColor(Color color) {
        setBackground(color);
    }
}
