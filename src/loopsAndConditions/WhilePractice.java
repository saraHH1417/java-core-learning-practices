package loopsAndConditions;

public class WhilePractice {

    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 100) {
            System.out.printf("Counter is: %d\n", counter);
            counter++;
        }

        // prefix and postfix
        int test = 10;
        int anotherTest = 5;
        int test1 = anotherTest++; // this first assign variable then increments it
        int test2 = ++anotherTest; // this first increment value then assigns it
        System.out.println("test++ "+ test++);
        System.out.println("++test " + ++test);
        System.out.println("test1 using another test: " + test1);
        System.out.println("test2 using another test: " + test2);

        System.out.println("now test is: " + test);
        System.out.println("now another test value is: "+ anotherTest);
        int total = test + anotherTest++;
        int total1 = test + ++anotherTest;
        System.out.printf("The total value is: %d and the total1 value is: %d\n", total, total1);

        int otters = 5;
        int giraffes = 10;
        int elephants = 3;

        int animals = --elephants + ++otters + giraffes++ + elephants;
        System.out.println("otters: " + otters);
        System.out.println("giraffes: " + giraffes);
        System.out.println("elephants: "+ elephants);
        System.out.println("animals: " + animals);
    }
}
