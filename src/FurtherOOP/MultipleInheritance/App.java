package FurtherOOP.MultipleInheritance;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task extends TimerTask {
    public void run() {
        JOptionPane.showMessageDialog(null, "Egg cooked");
    }
}

class TaskInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Timer running");
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
        timer.scheduleAtFixedRate(new Task(),  20000L, 20000L);

        System.out.println("\n \n Here we have interface example");
        ScheduledExecutorService executor =  Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new TaskInterface(), 0, 10L, TimeUnit.SECONDS);


    }
}
