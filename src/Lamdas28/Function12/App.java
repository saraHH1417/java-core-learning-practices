package Lamdas28.Function12;

import Lamdas28.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("**-> Unary operator");
        new App().run();

        System.out.println("**-> replace all");
        var numbers = new ArrayList<Integer>(List.of(1, 2, 4, 56, 67, 8));
        numbers.replaceAll(n -> n *n);
        numbers.forEach(System.out::println);
        var names = new ArrayList<String>(List.of("Bob", "Sue", "Giles", "Mary"));
        names.replaceAll(n -> "hello " + n);
        names.forEach(System.out::println);

        System.out.println("**-> multiThreading");
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Value of i is :" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        runnable.run();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
        System.out.println("Hello");

        t1.join();
        t2.join();
    }

    public void run() {
        calculateAndPrint(7, n -> n*n);
        calculateAndPrint(8, n -> n + 1);
        calculateAndPrint(9, n -> 0);
    }

    protected void calculateAndPrint(int value, UnaryOperator<Integer> procedure) {
        int result = procedure.apply(value);
        System.out.println(result);
    }
}
