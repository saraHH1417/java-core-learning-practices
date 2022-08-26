package RockPaperScissor;

import org.jetbrains.annotations.NotNull;

public class GameObject implements Comparable<GameObject> {
    private int id;
    private String name;


    private int[][] comparison = {
            //         rock    paper   scissor
            /*rock*/  {0, -1, 1},
            /*paper*/ {1, 0, -1},
            /*scissor*/{-1, 1, 0}
    };

    @Override
    public int compareTo(@NotNull GameObject o) {
        return comparison[this.id][o.id];
    }

    @Override
    public String toString() {
        return name;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
