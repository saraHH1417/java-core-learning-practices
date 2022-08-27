package Swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());
        add(new Toolbar(), BorderLayout.NORTH);
        add(new MainPanel(), BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
