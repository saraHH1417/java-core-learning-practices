package Collections25.LinkedLIst;

import java.util.Objects;

public class Spider {
    private String name;
    public Spider(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spider spider = (Spider) o;
        return Objects.equals(name, spider.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
