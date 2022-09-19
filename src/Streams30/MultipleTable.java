package Streams30;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultipleTable {
    public static void main(String[] args) {
        System.out.println("First way");
        IntStream.range(1, 13)
                .forEach(n -> {
                    IntStream.range(1, 13).forEach(k -> {
                        System.out.printf("%-5d", n*k);
                    });
                    System.out.println();
                });
        System.out.println("\n\nSecond way");
        var multipleTable = IntStream.range(1, 13)
                .mapToObj(n -> {
                    return IntStream.range(1, 13)
                            .map(k -> k *n)
                            .mapToObj(s -> String.format("%-5s", s))
                            .collect(Collectors.joining());
                })
                .collect(Collectors.joining("\n"));
        System.out.println(multipleTable);
    }
}
