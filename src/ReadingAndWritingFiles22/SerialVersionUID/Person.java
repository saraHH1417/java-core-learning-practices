package ReadingAndWritingFiles22.SerialVersionUID;

import java.io.Serializable;

class Person implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}