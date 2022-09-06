package ConwayGameOfLIfe21.gui;

import ConwayGameOfLIfe21.model.World;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel {
    private final static int CELLSIZE = 100;

    private final static Color foregroundColor = Color.GREEN;
    private final static  Color backgroundColor = Color.BLACK;
    private final static  Color gridColor = Color.GRAY;

    private static  int leftRightMargin;
    private static int topBottomMargin;

    private World world;
    public GamePanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = (e.getY() - topBottomMargin) /CELLSIZE;
                int col =(e.getX() - leftRightMargin)/ CELLSIZE;

                if( row >= world.getRows() || col >= world.getCols()) {
                    return;
                }
                System.out.println(row + ", " + col);
                boolean status = world.getCell(row, col);
                world.setCell(row, col, !status);

                repaint();
            }
        });

//        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(this::next,
//                500,
//                500,
//                TimeUnit.MILLISECONDS);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
        topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;

        int rows = (height - 2 * topBottomMargin)/CELLSIZE;
        int cols = (width - 2 * leftRightMargin)/CELLSIZE;

        if (world == null) {
            world = new World(rows, cols);
        } else if (world.getRows() != rows || world.getCols() != cols) {
            world = new World(rows, cols);
        }

        g2.setColor(backgroundColor);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);

        for (int col = 0; col < cols; col++) {
            for(int row =0; row < rows; row++) {
                boolean status = world.getCell(row, col);
                fillCell(g2, row, col, status);
            }
        }

    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        g2.setColor(gridColor);

        for (int x = leftRightMargin; x <= width - leftRightMargin; x+= CELLSIZE) {
            g2.drawLine(x,topBottomMargin ,x, height - topBottomMargin);
        }

        for (int y = topBottomMargin; y <= height - topBottomMargin; y+=CELLSIZE) {
            g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
        }
    }

    private void fillCell(Graphics2D g2, int row, int col, boolean status) {
        Color color = status ? foregroundColor : backgroundColor;
        g2.setColor(color);

        int x = leftRightMargin + (col * CELLSIZE);
        int y = topBottomMargin + (row * CELLSIZE);

        g2.fillRect(x +1, y +1, CELLSIZE - 1, CELLSIZE - 1); // +1 and -1 is for not damaging grid
    }

    public void randomize() {
        world.randomize();
        repaint();
    }

    public void clear() {
        world.clear();
        repaint();
    }

    public void next() {
        world.next();
        repaint();
    }

    public void save(File selectedFile) {
        world.save(selectedFile);
    }

    public void open(File selectedFile) {
        world.load(selectedFile);
        repaint();
    }
}
