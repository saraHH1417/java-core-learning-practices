package Generics24;

import Generics24.Collections.Array;
import Generics24.Collections.Util;
import Generics24.Hierarchy.Cat;
import Generics24.Hierarchy.Creature;
import Generics24.Hierarchy.Mammal;

public class ExerciseApp {
    public static void main(String[] args) {
        Array<Cat> source = new Array<>(2);
        source.add(new Cat("cat"));
        source.add(new Cat("dog"));

        Array<Creature> dest = new Array<>(2);
        Util.copy(source, dest);

        for (int i=0; i< source.size(); i++) {
            System.out.println(dest.get(i));
        }

        System.out.println("\nExercise two");
        Array<Cat> sourceItems = new Array<Cat>(2);
        sourceItems.add(new Cat("fox"));
        sourceItems.add(new Cat("cat"));

        Array<Mammal> destItems = new Array<Mammal>(2);
        destItems.addAll(sourceItems);

        for (int i =0 ; i < dest.size(); i++) {
            System.out.println(dest.get(i));
        }

    }
}
