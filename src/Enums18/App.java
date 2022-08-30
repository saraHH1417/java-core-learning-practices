package Enums18;



import Enums18.RockPaperScissorEnum.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Fruit fruit1 = Fruit.APPLE;
        Fruit fruit2 = Fruit.BANANA;

        System.out.println(fruit1 == fruit2);

//        Fruit[] fruits = Fruit.values();
        for (Fruit fruit: Fruit.values()) {
            System.out.println(fruit);
        }

        System.out.println("\nfor getting enum position in array");
        System.out.println(Fruit.BANANA.ordinal());

        System.out.println("\nfor changing type string to enum type");
        Fruit fruit3 = Fruit.valueOf("ORANGE");
        System.out.println(fruit3);

        System.out.println("constructor");
        System.out.println(Fruit.APPLE);

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your input > ");
        Fruit fruit4 = Fruit.valueOf(scanner.nextLine());
        switch (fruit4) {
            case ORANGE -> System.out.println("orange");
            case BANANA -> System.out.println("banana");
            case APPLE -> System.out.println("apple");
            default -> System.out.println("invalid fruit");
        }

        new Game().run();

    }
}
