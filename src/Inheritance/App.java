package Inheritance;

import Inheritance.FruitsAndProtected.Apple;
import Inheritance.FruitsAndProtected.Banana;
import Inheritance.FruitsAndProtected.Fruit;

public class App {
    public static void main(String[] args) {
        HouseCat cat1 = new HouseCat();
        cat1.vocalize();
        cat1.hunt();

        Tiger cat2 = new Tiger();
        cat2.vocalize();
        cat2.hunt();

        // this is called subtype polymorphism
        System.out.println("This is called subtype polymorphism");
        Cat cat3 = new Tiger();
        cat3.vocalize();
        cat3.hunt();

        System.out.println("The below lines are for each result");
        Cat[] cats = {new Cat() , new Tiger(), new HouseCat()};
        for (int i= 0 ; i < cats.length; i++) {
            System.out.println("cat number " + i);
            cats[i].vocalize();
            cats[i].hunt();
        }

        Cat subtypePolymorphismCat = new HouseCat();
        subtypePolymorphismCat.vocalize();
        subtypePolymorphismCat.hunt();

//        subtypePolymorphismCat.purr();
        // the above statement does not work and returns error

        System.out.println("This is casting , we're casting the objects that we have using " +
                "subtype polymorphism to the object that we know " +
                "have the purr method");
        ((HouseCat)subtypePolymorphismCat).purr();

        System.out.println("\nprotected keyword");
        Fruit fruit1 = new Apple();
        System.out.println("This is apple"  + fruit1);

        Fruit fruit2 = new Banana();
        System.out.println("This is banana "  + fruit2);
    }
}
