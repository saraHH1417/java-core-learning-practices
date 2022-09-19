package Streams30.Collectors13To;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        var result = Stream.of("one", "two", "three", "four").collect(
                () -> new ArrayList<String>(),
                (list, item) -> list.add(item),
                ArrayList::addAll  // this is the same with (list1, list2) -> list1.addAll(list2)
        );
        System.out.println(result);

        System.out.println("\n\n**-> combining maps");
        IncrementMap map1 =  new IncrementMap();
        IncrementMap map2 =  new IncrementMap();
        map1.putAll(Map.of("one", 1, "two", 2));
        map2.putAll(Map.of("one", 1, "two", 2));
        combine(map1, map2);
        System.out.println(map1);

        System.out.println("**-> Exercise combining maps and collectors");

        var wordCount = Files
                .lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]"))
//                .filter(w -> w.length() > 0) this line doesn't work here because the result of lines and also maps is a stream of objects
//                ,and object is a non primitive type like String, that's why in filter we can use length method
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(w -> !w.isBlank())
                .map(String::toLowerCase)
                .collect(
                        IncrementMap::new,
                        App::accumulate,
                        App::combine
                );
        System.out.println(wordCount.getClass());
        System.out.println("1984 word count is: " + wordCount);
        AtomicInteger countLineWord = new AtomicInteger();
        wordCount.forEach((word, count) -> {
            System.out.printf("%-25s", (word + ": " + count));
            if (countLineWord.incrementAndGet() % 12 == 0) {
                System.out.println();
            }
        });

        System.out.println("\n\n**->Sorting streams");
        var wordList = wordCount
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((v1, v2) -> v2.compareTo(v1)))
                .collect(Collectors.toList());
        for (int i =0; i < wordList.size(); i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.printf("%-25s", (entry.getKey() + ": " + entry.getValue()));
            if (i % 12 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\n**-> group by streams");

        System.out.println("\n\n**->Sorting streams");
        var wordListGroup = Files
                .lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]"))
//                .filter(w -> w.length() > 0) this line doesn't work here because the result of lines and also maps is a stream of objects
//                ,and object is a non primitive type like String, that's why in filter we can use length method
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(w -> !w.isBlank())
                .map(String::toLowerCase)
                .collect(
//                        Collectors.groupingBy(word -> word.length() , Collectors.toSet()) //group by word length
//                        Collectors.groupingBy(Function.identity() , Collectors.counting()) //group by count
                        Collectors.groupingBy(word -> word.substring(0, 1), Collectors.toList()) // group by first character of word
                );

        System.out.println("WordList groupBy \n" + wordListGroup);
    }

    private static void combine(IncrementMap map1, IncrementMap map2) {
        map2.forEach(map1::putOrAdd);
    }

     private static void accumulate(IncrementMap map, String word) {
             map.putOrAdd(word, 1);
    }
}
