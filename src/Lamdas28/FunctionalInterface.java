package Lamdas28;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void run();
    private void run1() {
        System.out.println("run1");
    }

    default void run2() {
        System.out.println("run2");
    }
    default void run3() {
        run1();
        System.out.println("run3");
    }
}
