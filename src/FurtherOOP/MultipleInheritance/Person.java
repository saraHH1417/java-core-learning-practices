package FurtherOOP.MultipleInheritance;

public class Person implements Speaker, Greeter{
    @Override
    public void greet() {
        System.out.println("Hello!");
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking");
    }
}
