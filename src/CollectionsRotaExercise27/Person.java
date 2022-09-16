package CollectionsRotaExercise27;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person implements Comparable<Person> {
    private String name;
    private Set<Skill> skills;
    private boolean onHoliday = false;

    public Person(String name) {
        this.name = name;
        skills = new HashSet<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public Set<Skill> getSkills() {
        return this.skills;
    }

    public void setOnHoliday(boolean onHoliday) {
        this.onHoliday = onHoliday;
    }

    public boolean isOnHoliday() {
        return this.onHoliday;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\t");

        for (Skill skill: skills) {
            sb.append(skill).append("\t");
        }

        return sb.toString();
    }


    @Override
    public int compareTo(@NotNull Person other) {
        return this.name.compareTo(other.name);
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
}
