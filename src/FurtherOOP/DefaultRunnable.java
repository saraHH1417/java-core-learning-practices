package FurtherOOP;

public interface DefaultRunnable extends Runnable{
    default void defaultMethodInterface() {
        System.out.println("This is default method of interface, that you don't have to implement it " +
                "in the class that implements interface and " +
                "also you can rewrite it with override if you want");
    }
    void displayDetails();
}
