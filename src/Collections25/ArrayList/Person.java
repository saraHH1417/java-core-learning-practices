package Collections25.ArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(@NotNull Person o) {
        int compareName = name.compareTo(o.name);
        if (compareName == 0) {
            return age.compareTo(o.age);
        }
        return compareName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

//    @Override
//    public boolean equals(Object other) {
//        if (other == null) {
//            return false;
//        }
//        if (!(other instanceof Person)) {
//            return false;
//        }
//        if (this.name == null) {
//            return false;
//        }
//
//        Person p = (Person) other;
//        if (p.name == null) {
//            return false;
//        }
//        return this.name.equals(p.name);
//    }
}
