package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorButtonListener implements ActionListener {

    private ColorChangeListener colorChanger;
    private Color color;
    public ColorButtonListener(ColorChangeListener colorChanger, Color color) {
        this.colorChanger = colorChanger;
        this.color = color;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        colorChanger.changeColor(color);
    }
}

public class Toolbar extends JToolBar {
    public Toolbar(ColorChangeListener colorChanger) {
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        redButton.addActionListener(new ColorButtonListener(colorChanger, Color.RED));
        blueButton.addActionListener(new ColorButtonListener(colorChanger, Color.BLUE));
        add(redButton);
        add(blueButton);
    }
}
