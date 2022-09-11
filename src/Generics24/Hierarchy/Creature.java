package Generics24.Hierarchy;

import java.io.Serializable;

public class Creature implements Serializable {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void feed() {
        System.out.println(name + " feeding");
    }
}
