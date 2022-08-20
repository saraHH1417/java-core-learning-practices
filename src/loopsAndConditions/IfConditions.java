package loopsAndConditions;

import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter room temperature (F) > ");

        double temperatureF = scanner.nextDouble();


        double tempC = (temperatureF - 32) * (5.0 / 9.0);
        System.out.printf("Temperature Fahrenheit is: %.2f", temperatureF);
        System.out.printf(" and temperature celsisus is %.2f\n", tempC);

        if (tempC < 21.0) {
            System.out.println("Too cold!");
        } else {
            System.out.println("Warm enough.");
        }

        // one line if condition
        boolean isRaining = false;

        if (isRaining) System.out.println("It is raining!");
        else System.out.println("It's not raining!");

        // switch statements
        System.out.println("\n starting switch statements");
        int option = 0;
        switch(option) {
            case 0:
                System.out.println("Option 0 selected");
                break;
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 10:
                System.out.println("Option 10 selected");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }


        System.out.println("Please enter your input >");
        int userInput = scanner.nextInt();
        scanner.close();

        switch (userInput) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("How are you?");
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid input");
        }

    }
}
