package Collections25.CustomObjectsInMapExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Map<Person, Integer> people = new HashMap<>();
        System.out.println("HashMap people");
        addItemsAndPrint(people);

        Map<Person, Integer> people2 = new LinkedHashMap<>();
        System.out.println("LinkedHashMap People");
        addItemsAndPrint(people2);

        Map<Person, Integer> people3 = new TreeMap<>();
        System.out.println("TreeMap people3");
        addItemsAndPrint(people3);

        System.out.println(people3.get(new Person("Joe")));
        System.out.println(people3.containsKey(new Person("Ema")));
        System.out.println(people3.get(new Person("hjhhh")));
        System.out.println(people3.containsKey(new Person("fdssss")));
    }

    public static void addItemsAndPrint(Map<Person, Integer> map) {
        map.put(new Person("Joe"), 32);
        map.put(new Person("Ema"), 65);
        map.put(new Person("Estella"), 18);
        map.put(new Person("Joe"), 32);

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
