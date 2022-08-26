package OverloadingMethods;

public class ConstructorChainingPerson {
    private String name;
    private int height;
    private static final String NO_NAME = "not supplied";


    public ConstructorChainingPerson() {
        this(NO_NAME, 0);
    }

    public ConstructorChainingPerson(String name) {
        this(name, 0);
    }

    public ConstructorChainingPerson(int height) {
        this(NO_NAME, height);
    }

    public ConstructorChainingPerson(String name , int height) {
        this.name = name;
        this.height = height;

        System.out.println("Main constructor");
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
