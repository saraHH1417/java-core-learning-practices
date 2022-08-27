package FurtherOOP;

public class Machine implements DefaultRunnable{
    @Override
    public void displayDetails() {
        System.out.println("No details to display");
    }

    @Override
    public void run() {
        System.out.println("Machine running");
    }
}
