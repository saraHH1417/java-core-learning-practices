package Streams30.StreamIntro1To7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Array stream");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 6, 4, 3, 7, 9));
        numbers.stream().forEach(System.out::println);
        System.out.println("Numbers thread");
        Stream.of(1, 2, 3).forEach(System.out::println);

        System.out.println("Stream generate");
        Stream.generate(() -> "hello").limit(5).forEach(System.out::println);

        System.out.println("List stream // streams api function is more powerful than list api functions");
        List.of(1, 2, 3).stream().forEach((num) -> {
            System.out.print(num + ", ");
        });

        System.out.println("\n\n\n**-> File stream");
        Files.lines(Paths.get("animalFarm.txt")).forEach(System.out::println);

        System.out.println("\n\n**-> Transforming streams");
        var names = List.of("OLiva", "Emma", "Charlotte", "Sophia", "Aria", "Ava", "Chloe", "Zoey", "Abigail", "Amilia");
        names
                .stream()
                .map(Person::new)// this is the same with s -> new Person(s) lambda
                .forEach(System.out::println);

        System.out.println("**-> My dearest Regex ;)))");
        String line = "This is a sentence. It contains some words, and some punctuation";
        String[] words = line.split("[^a-zA-Z]");
        Stream.of(words).forEach(System.out::println);

        System.out.println("\n Collectors and peek in stream");
        List<Person> namesList = names
                .stream()
                .peek(s -> System.out.println(s + ": " + s.getClass()))
                .map(Person::new)
                .peek(s -> System.out.println(s + ": " + s.getClass())) // after mapping items from string clas to person class
                .collect(Collectors.toList());
        System.out.println(namesList);

        System.out.println("\n**-> Count in stream. Note that now that we are using count, peek doesn't work");
        long namesListCount = names
                .stream()
                .map(Person::new)
                .peek(s -> System.out.println(s + ": " + s.getClass()))
                .count();

        System.out.println("The count is :" + namesListCount);

    }
}
