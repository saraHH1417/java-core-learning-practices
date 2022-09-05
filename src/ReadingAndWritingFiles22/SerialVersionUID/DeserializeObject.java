package ReadingAndWritingFiles22.SerialVersionUID;

import java.io.*;

public class DeserializeObject {
    public static void main(String[] args) {
        String pathString = "test.bin";


        try(var os = new ObjectInputStream(new FileInputStream(pathString))) {
            Serializable[] persons = (Serializable[]) os.readObject();// we should cast the object that returns from the readObject method
            //, to the object type that we know we have saved before
            for (Serializable /* or var */ p: persons) {
                System.out.println(p);
                Person person = (Person) p;
                System.out.println("The below object is have been read from file\n" +person);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Can not open file: " + pathString);
        }catch (IOException e) {
            System.out.println("Can not read file: " + pathString);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot read object from file: " + pathString);
        }
    }
}
