package FurtherOOP;

public class App {
    public static void main(String[] args) {
        Cat a1 = new Cat();
        Animal a2 = a1; // this is called upcasting
        Animal a3 = (Animal)a1; // this is called subtype polymorphism (Animal)a1
        Animal a4 = new Animal();
//        Cat a5 = (Cat) a4; // this is called down casting and be careful it is error prone and should be done carefully

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a2 == a1);
        System.out.println(a3);
        System.out.println(a4);
//        System.out.println(a5);

        // object class in java
        Object o1 = getAnimal();
        System.out.println(o1);

        System.out.println("\nNow the sweet topic of abstract classes");
        GameObject[] objs = {new Player() , new Monster()};

        for (var obj: objs) {
            System.out.println(obj);
            obj.describe();
        }

//        new GameObject(); // this does not work because Game object is an abstract class and can not be instantiated
        System.out.println("Now we have the sweet topic of interfaces");
        Describable[] objects = {new Computer() , new Person()};

        for (Describable obj: objects) {
            System.out.println(obj.getDescription());
        }

        DefaultRunnable defaultRunnableObj = new Machine();
        defaultRunnableObj.run();
        defaultRunnableObj.displayDetails();
        defaultRunnableObj.defaultMethodInterface();


        System.out.println("\n\n multiple inheritance is in another package in this package");
    }

    public static Object getAnimal() {
        return new Animal();
    }
}
