package loopsAndConditions;

import java.util.stream.IntStream;

public class StreamLoops {
    public static void main(String[] args) {
        IntStream.range(0,5).forEach(System.out::println);

        System.out.println("Multiply by 2");
        IntStream.range(0,5).forEach(i -> {
            System.out.println(i*2);
        });
    }
}
