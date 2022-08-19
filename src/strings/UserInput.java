package strings;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is short for system input
        // or the input that we get from console
        System.out.println("Enter value in fahrenheit to convert > ");
        double fahrenheit = scanner.nextFloat();

        double celsius = (fahrenheit - 32) * 0.5 / 9.0;
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius. \n", fahrenheit, celsius);
        scanner.close();

        String testScannerNextLIne = "Hello scanner \n 1 2 3 4 numbers";
        Scanner newScanner = new Scanner(testScannerNextLIne);
        String nextLine1 = newScanner.nextLine();
        String nextLine2 = newScanner.nextLine();
//        String nextLine3 = newScanner.nextLine();
        newScanner.close();

        System.out.printf("Scanner next line is %s\n", nextLine1);
        System.out.printf("Scanner next line is %s\n", nextLine2);
//        System.out.printf("Scanner next line is %s", nextLine3); // these two commented lines gives us error
    }
}
