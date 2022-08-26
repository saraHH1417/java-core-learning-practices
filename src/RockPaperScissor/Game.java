package RockPaperScissor;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private GameObject[] objects = {new Rock() , new Scissor(), new Paper()};
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public void run() {
        String[] status = {"lose" , "draw", "win"};

        System.out.println("Game running...");
        int wins = 0;

        for (int i = 0 ; i < 3; i++) {
            System.out.println("Choose an object");
            System.out.print("1.Rock\n2.Paper\n3.Scissors\n> ");

            int objectIndex = scanner.nextInt();

            GameObject obj1 = objects[objectIndex - 1];
            GameObject obj2 = objects[random.nextInt(objects.length)];
            System.out.println("user choice: " + obj1);
            System.out.println("system choice: " + obj2);

            int comparison = obj1.compareTo(obj2);
            System.out.println(status[comparison + 1]);

            wins += comparison;

            System.out.println("\n");
        }

        System.out.println(this.result(wins));

        scanner.close();
    }

    private String result(int wins) {
        if(wins > 0) {
            return "You won!";
        } else if ( wins < 0) {
            return "You lost!";
        } else {
           return "It's a draw";
        }
    }
}
