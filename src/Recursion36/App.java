package Recursion36;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();

        System.out.println("The factorial of " + number + " is " + factorial(number));
        System.out.println("The factorial recurse of " + number + " is " + factorialRecurse(number));
        recurse(4);
        System.out.print("Please enter recurse sum: ");
        int numberSum = scanner.nextInt();
        System.out.println("The recurse sum of " + numberSum + " is " + recurseSum(numberSum));

    }

    private static int factorialRecurse(int value) {
        if(value == 1) {
            return value;
        }
        return value * factorial(value - 1);
    }

    private static int recurseSum(int value) {
        if(value == 0) {
            return value;
        }
        return value + recurseSum(value - 1);
    }

    private static void recurse(int value) {
        System.out.println(value);
        if(value == 0) {
            return;
        }
        recurse(value - 1);
    }

    private static int factorial(int value) {
        int result = 1;
        for (int i = value; i > 1; i--) {
            result*=i;
        }
        return  result;
    }
}
