package Lamdas28;

import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        var list = List.of("one", "two", "three");
        System.out.println("Using anonymous class");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        System.out.println();
        list.forEach(System.out::println);
        list.forEach(s -> {
            System.out.print(s + " ");
        });

        System.out.println("lambda expressions and functional interface with one parameter");
        System.out.println("** -> Functional interfaces and create a lambda expression with them");
        Runner run =  (String text) -> {
            System.out.println(text);
        };
        run.execute("runner 1 text");
        System.out.println(run instanceof  Runner);
        System.out.println(run instanceof Object);
        System.out.println(run.getClass());

        Runner run2 = (text) -> {
            System.out.println(text);
        };
        run2.execute("runner 2 text");

        Runner run3 = text -> {
            System.out.println(text);
        };
        run3.execute("runner 3 text");

        Runner run4 = text -> System.out.println(text);;
        run4.execute("runner 4 text");

        System.out.println("**-> functional interface and lambda expressions with two parameter");
        RunnerMultiple runnerMultiple = (s1, s2) -> System.out.println(s1 + " " + s2);
        greet(runnerMultiple);
    }

    public static void greet(RunnerMultiple runner) {
        runner.runnerMultipleExecute("Hello" , "Runner Multiple");
    }
}
