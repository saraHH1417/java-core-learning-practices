package FurtherOOP.MultipleInheritance;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
    public void run() {
        System.out.println("Hello!");
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("In java we don't have multiple inheritance," +
                "but we can use multiple interface inheritance instead");
        Person p1 = new Person();
        p1.greet();
        p1.speak();

        System.out.println("\n\n example abstract class");
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
    }
}
