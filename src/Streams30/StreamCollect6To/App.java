package Streams30.StreamCollect6To;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        List<Set<Integer>> list = List.of(Set.of(1, 2, 3), Set.of(4, 5, 6), Set.of(7, 8, 9));
        list
                .stream()
                .flatMap(s -> s.stream())
                .forEach(System.out::println);

        System.out.println("\n**-> Stream exercise 1");
        List<String> words = Files
                .lines(Paths.get("1984.txt"))
                .map(l -> l.split("[^a-zA-Z]"))
                .map(Arrays::asList)
                .flatMap(l -> l.stream())
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());
        int count = 0;
        for (String word: words) {
            System.out.printf("%-10s", word);
            if(++count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\n**-> Reduce");
        System.out.println(IntStream.range(0, 6).sum());
        int value = IntStream.range(0, 5).reduce(0, (subTotal, item) -> {
            System.out.println("Subtotal is: " + subTotal);
            return subTotal + item;
        });
        System.out.println(value);
        System.out.println("subtotal at first is the first parameter of the reduce method then every time," +
                " it changes to the value that returns from the method");

        OptionalInt value2 = IntStream.range(2, 6).reduce((subTotal, item) -> {
            System.out.println("Subtotal is: " + subTotal);
            return subTotal + item;
        });
        System.out.println("the result of second method is: " + value2);
        System.out.println("In the second way the initial value of subtotal is the first parameter of intStreamRange");

        System.out.println("\n\n**-> Stream Combiners");
        System.out.println(" first with reduce");
        var resultSentence = Stream.of("Hello" , "how" , "are", "you")
                .reduce((subTotal, item) -> subTotal + " " + item);
        System.out.println(resultSentence);
        System.out.println("now with combiner");
        var resultSentence2 = Stream.of("Hello" , "how" , "are", "you")
                .parallel()
                .reduce("", (subTotal, item) -> subTotal + " " + item , (p1, p2) -> p1 + p2);
        System.out.println(resultSentence2);

        System.out.println("\n**-> Exercise 2 factorial");
        var factorial = IntStream.range(1, 5).reduce(1, (subtotal, valueF) -> subtotal * valueF);
        System.out.println(factorial);
    }
}
