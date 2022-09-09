package Generics24;


import Generics24.Collections.Array;
import Generics24.Collections.Pair;
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

        System.out.println("\nPair class");
        Pair<Integer, Cat> pair = new Pair<>(5, new Cat("Tiddy"));
        System.out.println(pair);
        System.out.println(pair.getOne());
        System.out.println(pair.getTwo());

        System.out.println("\nArray class");
        Array<Cat> cats = new Array<>(2);
        cats.add(new Cat("Tiddy"));
        cats.add(new Cat("Tiddles"));

        Cat cat1 = cats.get(0);
        Cat cat2 = cats.get(1);

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(cats);

        System.out.println("\nGeneric methods");
        Cat c = find(cats, "Tiddy");
        System.out.println("found: "+ c);

        System.out.println("\nGeneric bounds");
        Array<Mammal> mammals = new Array<>(3);
        mammals.add(new Mammal("dolphin"));
        mammals.add(new Mammal("sheep"));

        feedAll(mammals);

        Array<Cat> catsss = new Array<>(2);
        catsss.add(new Cat("dolphin"));
        catsss.add(new Cat("sheep"));
        feedAll(catsss);

        System.out.println();
        addMammal(mammals);
        feedAll(mammals);

        Array<Creature> creatures = new Array<>(5);
        creatures.add(new Creature("worm"));
        addMammal(creatures);

        for (int i =0 ; i < creatures.size(); i++) {
            System.out.println(creatures.get(i));
        }
    }

    private static void feedAll(Array<? extends Mammal> mammals) {
        for (int i=0; i< mammals.size(); i++) {
            Mammal m = mammals.get(i);
            m.feed();
        }
    }

    private static <T> T find(Array<T> array, String text) {
        for(int i= 0; i < array.size(); i++) {
            T value = array.get(i);
            if (value.toString().equals(text)) {
                return  value;
            }
        }

        return null;
    }

    private static void addMammal(Array<? super Mammal> mammals) {
        mammals.add(new Mammal("giraffe"));
    }
}
