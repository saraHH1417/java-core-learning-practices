package ConwayGameOfLIfe21.model;

import java.util.Arrays;
import java.util.Random;

public class World {
    private int rows;
    private int columns;

    private boolean[][] grid;
    private  boolean[][] buffer;

    public World(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        grid = new boolean[rows][columns];
        buffer = new boolean[rows][columns];
    }

    public boolean getCell(int row, int col) {
        return grid[row][col];
    }

    public void setCell(int row, int col, boolean status) {
//        System.out.println('i');
//        System.out.println(getCell(row, col));
//        System.out.println(status);
        grid[row][col] = status;
//        System.out.println("new status" + status);
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return columns;
    }

    public void randomize() {
        Random random = new Random();

        for (int i =0; i < (rows*columns)/10; i++) {
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            setCell(row, col, true);
        }
    }

    public void clear() {
        for (int row = 0; row < rows; row++) {
//            for(int col =0; col< columns; col++) {
//                setCell(row, col, false);
//            }
            Arrays.fill(grid[row] , false);
        }
    }

    private int countActiveNeighbours(int row, int col) {
        int neighbors = 0;
        for (int rowOffset = -1; rowOffset <=1; rowOffset++) {
            for (int colOffset = -1; colOffset <= 1; colOffset++) {
                if (rowOffset == 0 && colOffset == 0) {
                    continue;
                }
                int gridRow = row + rowOffset;
                int gridCol = col + colOffset;

                if(gridRow < 0 || gridCol < 0 || gridRow == rows || gridCol == columns) {
                    continue;
                }

                boolean sttaus = getCell(gridRow, gridCol);
                if (sttaus) {
                    neighbors++;
                }
            }
        }
        return  neighbors;
    }

    public void next() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns ; col++) {
                int activeNeighbours = countActiveNeighbours(row, col);
                System.out.println("(" + row + "," + col + ")" + activeNeighbours);

                boolean status = false;

                if(activeNeighbours < 2) {
                    status = false;
                } else if(activeNeighbours > 3) {
                    status = false;
                } else if( activeNeighbours == 3) {
                    status = true;
                } else if (activeNeighbours == 2) {
                    status = getCell(row, col);
                }

                buffer[row][col] = status; // we create a new array and use it, so when we loop the array,
                // and change values, number of neighbours doesn't change
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col=0; col< columns; col++) {
                grid[row][col] = buffer[row][col];
            }
        }
    }
}
