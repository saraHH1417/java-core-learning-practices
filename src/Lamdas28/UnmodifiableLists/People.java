package Lamdas28.UnmodifiableLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {
    private List<String> people = new ArrayList<>();
    private List<String> unmodifiablePeople = new ArrayList<>();
    public People() {
        people.add("Bob");
        people.add("Sue");
        people.add("Jim");
        unmodifiablePeople.addAll(List.of("sari", "jimmy" , "mathew", "james"));
    }

    public List<String> get() {
        return people;
    }

    public List<String> getUnmodifiablePeople() {
        return Collections.unmodifiableList(unmodifiablePeople);
    }
}
