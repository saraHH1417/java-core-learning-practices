package ReadingAndWritingFiles22.SerialVersionUID;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Joe" , 1);

        String pathString = "test.bin";

        try(var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
            os.writeObject(p1);
        }catch (FileNotFoundException e) {
            System.out.println("Can not create file: " + pathString);
        }catch (IOException e) {
            System.out.println("Can not write file: " + pathString);
        }
        System.out.println("Completed. " + pathString + " read successfully.");
    }
}
