package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysOne {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};

        /*
        0. Tomatoes
        1. Pasta
        2. Onions
        * Note array indexes are zero-based
         */
        System.out.println(numbers[0]);

        String[] foods = {"Potatoes", "Rice", "Pasta", "Bread"};
        System.out.println(foods[0]);
        System.out.println(foods[1]);

        System.out.println("*** Traverse array with for loop");
        for(int i =0 ; i < foods.length; i++) {
            System.out.printf("%d. %s\n" , i, foods[i]);
        }

        System.out.println("*** Another way for traversing array");
        IntStream.range(0 , foods.length).forEach(i -> {
            System.out.printf("%d. %s\n", i, foods[i]);
        });

        System.out.println("*** Primitive arrays ***");
        // primitive arrays
        int[] integersArray = new int[3];
        integersArray[0] = 5;
        integersArray[1] = 10;
        integersArray[2] = 15;

        for(int i = 0; i < integersArray.length; i++) {
            System.out.printf("%d. %s\n" , i , integersArray[i]);
        }

        // Foreach in arrays
        System.out.println("*** for each in arrays");
        String[] fruits = {"banana" , "apple" , "grape" , "fruit"};

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println("*** Arrays Stream traverse first");
        String[] animals = {"horese" , "cat" , "snake" , "dog"};
        Arrays.stream(animals).forEach(System.out::println);

        System.out.println("*** Arrays Stream traverse second");
        int count = 0;
        Arrays.stream(animals).forEach(animal -> {
            System.out.printf("Animals:: %s\n", animal);
        });

    }
}

