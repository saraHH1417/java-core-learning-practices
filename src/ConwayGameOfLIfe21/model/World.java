package ConwayGameOfLIfe21.model;

public class World {
    private int rows;
    private int columns;

    private boolean[][] grid;

    public World(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        grid = new boolean[rows][columns];
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
}
