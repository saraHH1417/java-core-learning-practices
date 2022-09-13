package Collections25.HashSet;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Person other) {
        return  other.name.compareTo(this.name);
    }
}
