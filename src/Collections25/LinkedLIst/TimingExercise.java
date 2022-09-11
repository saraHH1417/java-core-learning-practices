package Collections25.LinkedLIst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimingExercise {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1832, 19342, 203434));

        arrayList.add(0, 100);
        arrayList.add(2, 56545);
        arrayList.forEach(System.out::println);

        System.out.println("Typing current time in java");
        System.out.println(System.currentTimeMillis());

        List<Integer> arrayListTime = new ArrayList<>();
        List<Integer> linkedListTime = new LinkedList<>();
        System.out.println("Array list time add to the end: " + timeOperations(arrayListTime));
        System.out.println("Linked list time add to the end: " + timeOperations(linkedListTime));

        List<Integer> arrayListTimeStart = new ArrayList<>();
        List<Integer> linkedListTimeStart = new LinkedList<>();
        System.out.println("Array list time add to the start: " + timeOperationsStart(arrayListTime));
        System.out.println("Linked list time add to the start: " + timeOperationsStart(linkedListTime));
    }

    public static long timeOperations(List<Integer> list)  {
        long start = System.currentTimeMillis();
        for (int i= 0; i < 1E5; i++) {
            list.add(i);
        }

        return System.currentTimeMillis() - start;
    }

    public static long timeOperationsStart(List<Integer> list)  {
        long start = System.currentTimeMillis();
        for (int i= 0; i < 1E5; i++) {
            list.add(50000, i);
        }

        return System.currentTimeMillis() - start;
    }
}
