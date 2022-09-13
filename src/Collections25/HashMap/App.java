package Collections25.HashMap;

import jdk.jshell.EvalException;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(0, "Maryam");
        people.put(7, "James");
        people.put(1, "Fred");
        people.put(9, "Sevin");

        people.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println("index 9 of people is " + people.get(9));

        System.out.println("PI number is " + Math.PI);
        System.out.println("absolute of -9 is " + Math.abs(-9));

        Map<Integer, String> months1 = new HashMap<>(Map.of(1 , "Jan" , 2, "Feb"));
        Map<Integer, String> months2 = new HashMap<>(Map.ofEntries(
                Map.entry(3, "Mar"),
                Map.entry(4, "Apr"),
                Map.entry(5, "May")

        ));

        months1.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
        System.out.println("next map is coming loop using lambda :)");
        months2.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("loop using for each using entry set");
        for (Map.Entry<Integer, String> entry: months2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("loop using key set using map.entry is faster");
        for (Integer monthCode: months2.keySet()) {
            String monthName = months2.get(monthCode);

            System.out.println(monthCode + ": " + monthName);
        }

        System.out.println("Loop using iterator");

        Iterator<Map.Entry<Integer, String>> iterator = months2.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Ordered Maps");
        Map<Integer, String> monthLinkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> monthTreeMap = new TreeMap<>();

        monthLinkedHashMap.put(3, "Mar");
        monthLinkedHashMap.put(6, "June");
        monthLinkedHashMap.put(1, "Jan");

        monthTreeMap.put(8, "Aug");
        monthTreeMap.put(6 , "June");
        monthTreeMap.put(7, "July");

        System.out.println("linked hash map");
        monthLinkedHashMap.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println("TreeMap");
        monthTreeMap.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }
}
