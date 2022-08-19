package loopsAndConditions;

public class ForLoops {
    public static void main(String[] args) {
        for(int i =0 ; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // Infinite for loop
//        for(;;) {
//            System.out.println("Infinity");
//        }

        boolean condition = 2 < 67;
        boolean condition1 = 4 > 6;
        System.out.println("condition: " + condition);
        System.out.println("condition1: "+ condition1);

        int cats = 10;
        int dogs = 5;

        System.out.printf("Cats are greater than dogs: %b\t" , cats > dogs);
        System.out.printf("Dogs are greater thn cats: %b\t", dogs > cats);

        // Equality operator
        System.out.printf("Number of dogs are equal to number of cats: %b", dogs == cats);

        // Do not use == with doubles , because doubles origins are approximate and comparing a things that
        // doesn't have absolute value with something with a absolute value may doesn't give us the result we expect
    }
}
