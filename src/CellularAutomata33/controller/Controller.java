package CellularAutomata33.controller;

import CellularAutomata33.gui.ArtPanel;
import CellularAutomata33.gui.MainFrame;

public class Controller {
    private MainFrame mainFrame;
    private ArtPanel artPanel;
    public Controller() {
        artPanel = new ArtPanel(new Rule(90));
        mainFrame = new MainFrame();

        mainFrame.setContentPane(artPanel);
    }
}
