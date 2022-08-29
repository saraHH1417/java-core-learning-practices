package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JToolBar {
    private ColorChangeListener colorChanger;

    public void setColorChanger(ColorChangeListener colorChanger) {
        this.colorChanger = colorChanger;
    }

    public Toolbar() {
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        System.out.println("\n Using lambda expression");
        redButton.addActionListener(e -> colorChanger.changeColor(Color.RED));

        System.out.println("\n\n Using anonymous class");
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChanger.changeColor(Color.BLUE);
            }
        });
        add(redButton);
        add(blueButton);
    }
}
