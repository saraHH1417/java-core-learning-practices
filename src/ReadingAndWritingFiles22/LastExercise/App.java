package ReadingAndWritingFiles22.LastExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        String filePath = "/media/sara/hdd/programming/projects/inTheNameOfGodjava/JavaCourse/src/ReadingAndWritingFiles22/LastExercise/reactiontimes.csv";

        try(var br = new BufferedReader(new FileReader(filePath))) {
            String line;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int total = 0;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] fields = line.split(",");
                if (fields.length != 3) {
                    System.out.println("Line doesn't contain 3 fields :(" + line);
                    continue;
                }

                int reactionTime = 0;
                try {
                    reactionTime = Integer.parseInt(fields[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Number badly formatted in file: "+ fields[2] + " on line " + lineNumber);
                }

                if (reactionTime < min) {
                    min = reactionTime;
                }
                if (reactionTime > max) {
                    max = reactionTime;
                }
                total += reactionTime;
                lineNumber++;
            }

            if (lineNumber == 0) {
                System.out.println("No lines in file");
                return;
            }
            System.out.println("Min: " + min +  " ms");
            System.out.println("Max: " + max + " ms");
            System.out.println("Average: " + (double)total/lineNumber+ " ms");
        }catch (FileNotFoundException e) {
            System.out.println("Can not find " + filePath);
        }catch (IOException e) {
            System.out.println("Can not read " + filePath);
        }
    }
}
