package Exceptions19;

import Exceptions19.CustomExceptions.OutOfRangeExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("one");
        Thread.sleep(2000);
        System.out.println("two");

        int number = tryCatch();
        System.out.println("You entered " + number);
        scanner.close();

        throwException();

        dbConnection();

        tryWithResources(); // try with resources will close the connection automatically

        tryWithResourcesScanner();
    }

    public static int tryCatch() { // throws NumberFormatException
        boolean gotNumber = false;
        int value = 0;

        do {
            System.out.print("Enter a number > ");
            String line = scanner.nextLine();
            try {
                value = Integer.parseInt(line);
                gotNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        }  while (!gotNumber);
        return value;
    }

    public static void throwException() throws Exception { // we should handle the exception either by throw or try catch
        // otherwise program gives error and doesn't compile
        Thermostat stat = new Thermostat();
        try {
            stat.setTemperature(89);
        } catch (OutOfRangeExceptions e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally runs always whether we have exception or not");
        }
//        try {
//            stat.setTemperature(89);
//        } catch (OutOfRangeExceptions | RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            stat.setTemperature(89);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dbConnection() {
        Database db = null;
        try {
            db = new Database("localhost:3306");
            db.getData();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        finally {
            try{
                db.close();
            }catch(NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Null pointer exception.");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void tryWithResources() {
        try(Database db = new Database("ab")) {
            db.getData();
        } catch (Exception e) {
            System.out.println("Catching exception...");
            System.out.println(e.getMessage());
        }
    }

    public void tryWithResourcesScanner() {
//        try (Scanner scanner = new Scanner(System.in)) { // scanner class also implements auto closable interface
//            //so we can use it in try with resources structure
//            System.out.print("Enter an integer > ");
//            int value = scanner.nextInt();
//            System.out.println("Value: " + value);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        }

    }


}
