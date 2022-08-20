package loopsAndConditions;

import java.util.Scanner;

public class CheckingPassword {
    public static void main(String[] args) {
        final String USER_PASSWORD = "VERY_SECRET";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password > ");
            String password = scanner.nextLine();

            if(password.equals(USER_PASSWORD)) {
                System.out.println("Access granted.");
                break;
            }
            else if(password.equals("q"))  {
                System.out.println("quitting...");
                break;
            } else {
                System.out.println("Access denied");
            }
        }
        scanner.close();


        // do while
        int count = 0;
        System.out.println("First loop:");
        do {
            System.out.println("Count: " + count);
        } while (++count < 10);

        do {
            System.out.println("Count: " + count);
        } while (count++ < 10);

        // variables scope video 28
        {
            int value = 10;
        }
        // Error => out of scope // this returns an error because the curly brackets limits the value scope
//        System.out.println(value);
    }
}
