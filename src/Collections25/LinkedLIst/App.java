package Collections25.LinkedLIst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();

        texts.add("dog");
        texts.add("cat");
        texts.add("rat");

        for (var text: texts) {
            System.out.println(text);
        }

        System.out.println("\nList Interface 1");
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(56);
        numbers.add(323);
        numbers.add(78);
        displayList(numbers);

        System.out.println("\nList Interface 2");
        List<Integer> numbersList= new LinkedList<>();
        numbersList.add(56);
        numbersList.add(323);
        numbersList.add(78);
        displayList(numbersList);
    }


    private static void displayList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}
