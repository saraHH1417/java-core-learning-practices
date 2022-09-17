package MethodReferences29.MethodReferenceArbitrary;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    private String name;

    public Person() {
        this.name = "[no name]";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(@NotNull Person other) {
        return this.name.compareTo(other.name);
    }
}
