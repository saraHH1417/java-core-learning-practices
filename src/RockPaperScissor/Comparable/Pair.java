package RockPaperScissor.Comparable;
import java.util.*;

class Pair implements Comparable<Pair> {
    String x;
    int y;

    public Pair(String x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    @Override public int compareTo(Pair a)
    {
        // if the string are not equal
        if (this.x.compareTo(a.x) != 0) {
            return this.x.compareTo(a.x);
        }
        else {
            // we compare int values
            // if the strings are equal
            return  this.y - a.y;
        }
    }
}

