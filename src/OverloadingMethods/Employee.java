package OverloadingMethods;

public class Employee extends Person{
    public Employee(String name) {
        super(name);
        System.out.println("employee constructor");
    }
}
