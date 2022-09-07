package Generics24;


import Generics24.Collections.Wrapper;
import Generics24.Hierarchy.Cat;
import Generics24.Hierarchy.Creature;
import Generics24.Hierarchy.Mammal;

public class App {
    public static void main(String[] args) {
        Wrapper<Creature> wrapper = new Wrapper<Creature>(); // <> this is generics sign
        Cat cat = new Cat("Joe");
        wrapper.set(cat);

        Cat retrieved= (Cat) wrapper.get();
        System.out.println(retrieved);

        wrapper.set(new Mammal("Juliet"));
        System.out.println(wrapper.get());
    }
}
