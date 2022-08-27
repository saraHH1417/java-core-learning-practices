package Swing;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // note that invokeLater is a static method for swingUtilities class
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new MainFrame("Test Swing App");
        });

    }
}
