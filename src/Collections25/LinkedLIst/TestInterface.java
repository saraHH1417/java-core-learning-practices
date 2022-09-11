package Collections25.LinkedLIst;

public interface TestInterface {
    default void defaultMethod() {
        System.out.println("default method");
    }
    static void staticMethod() {
        System.out.println("Static method");
    }
}
