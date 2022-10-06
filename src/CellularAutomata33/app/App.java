package CellularAutomata33.app;

import CellularAutomata33.controller.Controller;

import javax.swing.*;
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Controller::new);
    }
}
