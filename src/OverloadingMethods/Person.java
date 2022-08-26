package OverloadingMethods;

public class Person {
    protected String name;
    private int height;

    public Person() {
        System.out.println("No parameter provided");
    }

    public Person(String name) {
        System.out.println("parameter name is "+ name);
        this.name = name;
    }

    public Person(String name, int height) {
        System.out.println("parameter name is " + name + " and parameter height is " + height);
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public void greet() {
        System.out.println("Hello gorgeous");
    }

    public void greet(String nameToGreet) {
        System.out.println("Hello gorgeous " + nameToGreet);
    }

    public void greet(String name, int height) {
        System.out.println("hello gorgeous " + name + " Your height is " + height);
    }
}
