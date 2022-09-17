package MethodReferences29;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    static class Run implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello is running");
        }
    }

    private static void greet() {
        System.out.println("Hello greet");
    }

    private static void sayHello() {
        System.out.println("Hello there say hello");
    }

    public static void main(String[] args) {
        var service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            System.out.println("Hello");
        }, 0, 1000, TimeUnit.MILLISECONDS);

        service.scheduleAtFixedRate(new Run(), 0, 1000, TimeUnit.MILLISECONDS);

        service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);

        System.out.println("**-> breaking down method references");
        Greeter g = ()-> System.out.println("greet functional interface");
        g.greet();

        System.out.println("**-> using method references");
        Greeter gSayHello = App::sayHello;
        gSayHello.greet();

        System.out.println("**->  method reference to static methods examples");
        var numbers = new ArrayList<>(List.of(1, 4, 6, 7, 8, 9, 45));
        numbers.removeIf(App::removeIf);
        numbers.replaceAll(App::replaceAll);

        numbers.forEach(System.out::println);

        System.out.println("**->  method reference to object methods examples");
        App app = new App();
        numbers.forEach(app::print);
    }

    private static boolean removeIf(int num) {
        return num < 4;
    }

    private static int replaceAll(int num) {
        return num * 2;
    }

    private void print(int value) {
        System.out.println("Got value: " + value);
    }
}
