package CollectionsRotaExercise27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCustomObjectsExercise {
    public static void main(String[] args) {
        System.out.println("HashMap");
        Map<Person, Integer> people = new HashMap<>();
        addItemsAndPrint(people);

        System.out.println("LinkedHashMap");
        Map<Person, Integer> peopleLinked = new LinkedHashMap<>();
        addItemsAndPrint(peopleLinked);

        System.out.println("TreeMap");
        Map<Person, Integer> peopleTree = new TreeMap<>();
        addItemsAndPrint(peopleTree);
    }

    public static void addItemsAndPrint(Map<Person, Integer> map) {
        map.put(new Person("James") , 34);
        map.put(new Person("Ema"), 23);
        map.put(new Person("Shilla"), 67);
        map.put(new Person("James"), 67);

        map.forEach((k, v) -> {
            System.out.print(k);
            System.out.println(v);
        });
    }
}
