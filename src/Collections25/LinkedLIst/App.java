package Collections25.LinkedLIst;

import Collections25.ArrayList.Person;
import Generics24.Hierarchy.Cat;
import Generics24.Hierarchy.Creature;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class App implements TestInterface {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();

        texts.add("dog");
        texts.add("cat");
        texts.add("rat");

        for (var text : texts) {
            System.out.println(text);
        }

        System.out.println("\nList Interface 1");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(56);
        numbers.add(323);
        numbers.add(78);
        displayList(numbers);

        System.out.println("\nList Interface 2");
        List<Integer> numbersList = new LinkedList<>();
        numbersList.add(56);
        numbersList.add(323);
        numbersList.add(78);
        displayList(numbersList);

        System.out.println("\nVideo 12 initializing lists with lists");
        List<Integer> list1 = new ArrayList<>(List.of(18, 19, 20));
        List<Integer> list2 = new ArrayList<>(list1);
        List<Integer> list3 = new ArrayList<>();

        System.out.println("list2: ");
        list2.forEach(System.out::println);
        list3.addAll(list1);
        list3.add(345);
        System.out.println("list3: ");
        list3.forEach(System.out::println);

        System.out.println("\nstatic and default methods in interfaces");
        (new App()).defaultMethod();
        TestInterface.staticMethod();

        System.out.println("\nVariable arguments");
        new App().run(3, "hello", "this is", "string", "arguments");

        System.out.println("\nInstance of tutorial:");
        Creature c1 = new Creature("creature");
        Object c2 = c1;
        Cat c3 = new Cat("kitty");
        Serializable c4 = (Serializable) c3;

        System.out.println(c2 instanceof Integer);
        System.out.println(c3 instanceof Cat);
        System.out.println(c3 instanceof Creature);
        System.out.println(c3 instanceof Serializable);

        System.out.println("\nEquals keyword");
        Person p1 = new Person("Joe", 25);
        Person p2 = new Person("Joe", 25);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println("\nRemoving items from lists");
        List<Spider> spiders = new ArrayList<Spider>(List.of(
                new Spider("Tiddy"),
                new Spider("Betty"),
                new Spider("Sherin"),
                new Spider("Fereddy"),
                new Spider("Kitty"),
                new Spider("batman"),
                new Spider("bath")));

        Cat sherin = new Cat("Sherin");
        spiders.forEach(System.out::println);
        spiders.remove(1);
        spiders.remove(sherin); // be careful that if we dont define equals method in spiders class this won't remove
        // the shering from list because this shering and that shering don't have the same reference in memory.
        // if we don't define the equals method java checks their reference on memory for equality
        System.out.println("\nAfter removing index one and sherin cat");
        spiders.forEach(System.out::println);
    }

    public void run(int number, String... texts) {
        System.out.println(number);
        for (String text : texts) {
            System.out.println(text);
        }
    }

    private static void displayList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}
