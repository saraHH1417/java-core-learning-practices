package MethodReferences29.MethodReferenceArbitrary;

import java.util.ArrayList;
import java.util.List;

interface NameGetter {
    String get(Person p);
}

interface NameSetter {
    void set(Person p, String name);
}

interface PersonCreator {
    Person create();
}
interface PersonNameCreator {
    Person create(String name);
}


public class App {
    public static void main(String[] args) {
        Person person = new Person("Joe");
        NameGetter getter1 = p -> p.getName();
        System.out.println(getter1.get(person));

        NameGetter getter2 = Person::getName;
        System.out.println(getter2.get(person));

        NameSetter setter1 = (p, name) -> {
            p.setName(name);
        };
        setter1.set(person, "Mathew");
        System.out.println("The new person name is: " + getter1.get(person));
        NameSetter setter2 = Person::setName;
        setter2.set(person, "John");
        System.out.println("The new person name is: " + getter2.get(person));

        System.out.println("**-> compareTo method references");
        List<Person> people = new ArrayList<>(List.of(new Person("Mary"),
                new Person("Simon"),
                new Person("Joe")));

        people.sort(Person::compareTo);
        people.forEach(System.out::println);

        List<String> strings = new ArrayList<>(List.of("Apple", "orange", "banana", "Pear"));
        strings.sort(String::compareToIgnoreCase);
        strings.forEach(System.out::println);

        System.out.println("**-> Method reference to constructor");
        PersonCreator person1 = ()  -> new Person();
        Person p1 = person1.create();
        System.out.println(p1);

        PersonNameCreator person2 = Person::new;
        Person p2 = person2.create("Mathew");
        System.out.println(p2);
    }
}
