package Collections25.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashSet<String> fruits= new HashSet<>(); // hashset is called hash set because it uses has algorithm
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("orange");

        System.out.println(fruits.contains("grape"));
        System.out.println(fruits.contains("pear"));
        for (String fruit: fruits) {
            System.out.println(fruit);
        }


        HashSet<HashCodeSpirit> creatures = new HashSet<>();
        creatures.add(new HashCodeSpirit(1, "james"));
        creatures.add(new HashCodeSpirit(2, "cat"));
        creatures.add(new HashCodeSpirit(3, "mouse"));
        creatures.add(new HashCodeSpirit(4, "horse"));
        creatures.add(new HashCodeSpirit(1, "jim"));
        creatures.forEach(System.out::println);

        System.out.println("\nUnion and iteration");
        HashSet<String> fruitsUnion = new HashSet<String>(Set.of("apple", "banana", "cherry", "pear", "carriot", "celery"));
        HashSet<String> fruits2Union = new HashSet<String>(Set.of("apple", "banana","blackberry", "pear" , "cherry"));

        System.out.println("Union hashSets");
        HashSet<String> union= new HashSet<>(fruitsUnion);
        union.addAll(fruits2Union);
        union.forEach(System.out::println);

        System.out.println("Retain hashSets");
        HashSet<String> intersection= new HashSet<>(fruitsUnion);
        intersection.retainAll(fruits2Union);
        intersection.forEach(System.out::println);

        System.out.println("remove all method");
        fruitsUnion.removeAll(fruits2Union);
        fruitsUnion.forEach(System.out::println);
    }
}
