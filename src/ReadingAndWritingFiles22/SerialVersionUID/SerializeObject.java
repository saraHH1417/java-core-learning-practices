package ReadingAndWritingFiles22.SerialVersionUID;

import java.io.*;

public class SerializeObject {
    public static void main(String[] args) {
        Person p1 = new Person("Joe" , 1);

        String pathString = "test.bin";

        Serializable[] persons = new Serializable[2];
        persons[0] = new Person("jane", 2);
        persons[1] = new Person("kim", 3);

        try(var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
            os.writeObject(persons);
        }catch (FileNotFoundException e) {
            System.out.println("Can not create file: " + pathString);
        }catch (IOException e) {
            System.out.println("Can not write file: " + pathString);
        }
        System.out.println("Completed. " + pathString + " read successfully.");
    }
}
