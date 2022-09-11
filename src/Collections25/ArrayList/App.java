package Collections25.ArrayList;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;
import java.util.*;

class PersonReverseAlpha implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person2.getName().compareTo(person1.getName());
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(43);
        list.add(545);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("\nFor loop");
        for (Integer n : list) {
            System.out.println(n);
        }

        System.out.println("\nFor loop different method");
        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);

            System.out.println(i + ": " + n);
        }

        System.out.println("\nFor loop third method");
        list.forEach(System.out::println);

        System.out.println("\nFor loop fourth method");
        list.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("\nFor loop after sorting");
        Collections.sort(list);
        list.forEach(System.out::println);

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Joe", 23));
        people.add(new Person("Pip", 19));
        people.add(new Person("Estella", 5));
        people.add(new Person("Biddy", 45));
        System.out.println("\nIterating people");
        people.forEach(System.out::println);
        System.out.println("\nIterating loop after change");
        people.set(2, new Person("Jimmy", 87));
        people.forEach(System.out::println);

        Collections.sort(people);
        System.out.println("\nIterating loop after sort");
        people.forEach(System.out::println);

        System.out.println("\nComparable interface and compareTo method");
        String name1 = "cde";
        String name2 = "dfdwe";
        int comparison = name1.compareTo(name2);
        System.out.println(comparison);
        int reverseComparison = name2.compareTo(name1);
        System.out.println(reverseComparison);

        // if compare to method returns negative number it means don't replace them with each other,
        // but if it returns positive number, it means replace them
        System.out.println("\nCompare method");
        Collections.sort(people, new PersonReverseAlpha());
        people.forEach(System.out::println);

        System.out.println("\nAnonymous compare class");
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return  Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
                //for more read ability
                Integer age1 = o1.getAge();
                Integer age2 = o2.getAge();
                return age1.compareTo(age2);
            }
        });

        people.forEach(System.out::println);


        System.out.println("\nArraylist Exercise");

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>(); // the Double in the right side is not necessary
        // because of diamond syntax after java 7
        float total = 0f;
        while (true) {
            System.out.print("Please enter a number or type 'stop' for exiting >");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                numbers.add(value);
                total += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            }
        }
        scanner.close();

        if (numbers.size() > 0) {
            System.out.println("\nYou entered");
            numbers.forEach(e -> {
                System.out.printf("%.2f\n", e);
            });

            System.out.printf("Average value: %.2f\n", total / numbers.size());
        } else {
            System.out.println("No numbers entered");
        }

    }
}
