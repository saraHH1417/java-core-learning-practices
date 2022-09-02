package ConwayGameOfLIfe21;

import ConwayGameOfLIfe21.gui.MainFrame;
import ConwayGameOfLIfe21.model.World;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MainFrame();
//            }
//        });
//        SwingUtilities.invokeLater(() -> new MainFrame());
        SwingUtilities.invokeLater(MainFrame::new);

    }
}
