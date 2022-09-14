package Collections25.CustomObjectsInMapExercise;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public int compareTo(@NotNull Person o) {
        return this.name.compareTo(o.name);
    }
}
