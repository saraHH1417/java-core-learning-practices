package RockPaperScissor.Comparable;

import java.util.Arrays;

public class GFG {
    public static void main(String[] args)
    {

        int n = 4;
        Pair arr[] = new Pair[n];

        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);

        // Sorting the array
        Arrays.sort(arr);

        // printing the
        // Pair array
        print(arr);
    }

    public static void print(Pair[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
