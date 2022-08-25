package Inheritance.FruitsAndProtected;

public class Fruit {
    protected int id;

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                '}';
    }
}
