package CollectionsRotaExercise27;

public interface test {
    static void sayHello() {
        System.out.println("hello statically");
    }

    default void sayHelloDefault() {
        System.out.println("hello default");
    }

}
