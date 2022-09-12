package Collections25.HashSet;

import java.util.Objects;

public class HashCodeSpirit {
    public int id;
    public String name;

    public HashCodeSpirit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeSpirit that = (HashCodeSpirit) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + ": " + name;
    }
}
