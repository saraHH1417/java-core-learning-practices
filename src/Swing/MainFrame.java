package Swing;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.util.function.ToLongBiFunction;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
        super(title);
        final MainPanel mainPanel = new MainPanel();
        final Toolbar toolbar = new Toolbar();
        toolbar.setColorChanger(mainPanel);

        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
