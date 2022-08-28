package InnerClass16;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    private String name;
    private String nickName = "Jojo";

    public App() {
        name = "Elizabeth";
    }
    public static void main(String[] args) {
        Fox fox = new Fox();
        System.out.println(fox);
        System.out.printf("%x\n", fox.hashCode());

        Fox fox2 = new Fox();
        System.out.println(fox2);

        Fox fox3 = fox;
        System.out.println("hash code of this object is: " + fox3.hashCode());
        System.out.printf("%x\n", fox3.hashCode());
        System.out.printf("%h\n", fox3);

        System.out.println("\n\nThe sweet topic of inner classes");
        App app = new App();
        app.run();

        System.out.println("Another way for calling run method");
        new App().run();

        System.out.println("\nstatic inner classes");
        Person p1 = new Person("ali");
        p1.print();

        Person.Head head = new Person.Head();
        head.print();

        Person.Body body = new Person.Body();
        body.print();

        Person p2 = new Person("zari");
        p2.display();

        Person.Printer printer = p2.new Printer();
        printer.print();

        System.out.println("\n\n Anonymous classes in java");
        new App().start();
    }
    public void start() {
        // the below is an anonymous class
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println(name);
            }
        };
        activate(runner);
//        activate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(name);
//            }
//        });
    }

    public void activate(Runnable runnable) {
        runnable.run();
    }

    public void run() {
         class Printer implements Runnable{
            public void print() {
                System.out.println(App.this.name);
            }
            @Override
            public void run() {
                print();
            }
        }
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
//        service.scheduleAtFixedRate(new Printer(), 0L, 1L, TimeUnit.SECONDS);

    }

}
