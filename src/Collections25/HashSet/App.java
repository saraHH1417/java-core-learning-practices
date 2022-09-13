package Collections25.HashSet;

import java.util.*;

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

        System.out.println("\nLinkedHashSet");
        LinkedHashSet<String> fruitsLinked = new LinkedHashSet<>();
        fruitsLinked.add("banana");
        fruitsLinked.add("carriot");
        fruitsLinked.add("mango");
        fruitsLinked.add("onion");

        for (var fruit: fruitsLinked) {
            System.out.println(fruit);
        }

        System.out.println(fruitsLinked.contains("cherry"));
        System.out.println(fruitsLinked.contains("banana"));

        System.out.println("\nTreeSet");
        TreeSet<Person> people = new TreeSet<Person>();

        people.add(new Person("Ethel"));
        people.add(new Person("Ellen"));
        people.add(new Person("Sour"));
        people.add(new Person("James"));

        for (var person: people) {
            System.out.println(person);
        }

        System.out.println("\nSortedSet");
        Set<Integer> numbers1 = new HashSet<>();
        Set<Integer> numbers2 = new LinkedHashSet<>();
        Set<Integer> numbers3= new TreeSet<>();

        SortedSet<Integer> numbers4= new TreeSet<>();
        numbers4.add(2);
        numbers4.add(6);
        numbers4.add(5);
        numbers4.add(3);

        numbers4.forEach(System.out::println);

        System.out.println("Descending iterrator");
        TreeSet<Integer> treeSetDesc= new TreeSet<>(numbers4);
        for (Iterator<Integer> treeSetIt = treeSetDesc.descendingIterator(); treeSetIt.hasNext();) {
            System.out.println(treeSetIt.next());
        }

        /*
            1- Are duplicates allowed?
                -yes List
                   -  Will Items be added somewhere other than start of thar list?
                        - yes: ArrayList
                        -no LinkedList (only when items are added at the start of list and memory usage is not first priority)
                - no  Set
                    - Should Items be ordered?
                        - yes Sort items in natural order?
                            - yes TreeSet
                            - no LinkedHashSet => sort Items in order added
                        - no HashSet
         */
    }
}
