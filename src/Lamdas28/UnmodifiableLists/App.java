package Lamdas28.UnmodifiableLists;

import CollectionsRotaExercise27.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        People people = new People();
        var peopleList1 = people.get();
        peopleList1.remove(1);
        System.out.println("People list 1");
        peopleList1.forEach(System.out::println);

        var peopleList2 = people.get();
        System.out.println("People list 2");
        peopleList2.forEach(System.out::println);

        System.out.println("Unmodifiable people");
        var unmodifiableList = people.getUnmodifiablePeople();
//        unmodifiableList.add("Jim"); this returns error. Because the list that we returned from method is unmodifiable
        unmodifiableList.forEach(System.out::println);

        System.out.println("**-> predicates");
        Predicate<String> p = new Predicate<>() {
            @Override
            public boolean test(String s) {
                return s.length() < 4;
            }
        };
        System.out.println(p.test("one"));
        System.out.println(p.test("three"));

        System.out.println("predicate different writing style");
        Predicate<String> p2 = s -> s.length() < 4;
        System.out.println(p2.test("one"));
        System.out.println(p2.test("three"));

        System.out.println("**-> filtering lists");
        System.out.println("unmodifiable list wit list.of");
        List<Integer> numbers = List.of(3, 56, 5, 7, 9, 2, 1);
//        numbers.add(67); this returns an error

        System.out.println(numbers.getClass());
        numbers.forEach(System.out::println);

        System.out.println("modifiable list");
        List<Integer> numbersModify = new ArrayList<>(List.of(3, 56, 5, 7, 9, 2, 1));
        numbersModify.add(87);
        numbersModify.removeIf( n -> n < 10);
        System.out.println(numbersModify.getClass());
        numbersModify.forEach(System.out::println);


    }
}
