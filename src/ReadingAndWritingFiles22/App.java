package ReadingAndWritingFiles22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Person implements Serializable{
    private String name;
    private transient int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class App {
    public static void main(String[] args) throws IOException {
        File currentDirectory = new File(".");
        System.out.println(currentDirectory.getAbsolutePath());
        System.out.println(currentDirectory.getCanonicalPath());
        for (String file: currentDirectory.list()) {
            System.out.println(file);
        }

        String text = "Hello\nthere";

        Path path = Paths.get("text.txt");
        System.out.println("path: " + path);

        Files.write(path, text.getBytes());

        String retrievedText = Files.readString(path);
        System.out.println(retrievedText);

        String fileLocation = "\\media\\sara\\hdd\\programming\\projects\\inTheNameOfGodjava\\JavaCourse\\text.txt";
        System.out.println(new File(fileLocation).exists());

        String fileLocationTwo = "/media/sara/hdd/programming/projects/inTheNameOfGodjava/JavaCourse/text.txt";

        System.out.println(new File(fileLocationTwo).exists());

        try(BufferedReader reader = new BufferedReader(new FileReader(fileLocationTwo))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }catch(FileNotFoundException e) {
           System.err.println("File not found: " + fileLocationTwo); // if we use err, the message will appear in red
        } catch(IOException e) {
            System.out.println("Error reading file: " + fileLocationTwo);
        }

        System.out.println("\n\nWriting text file line by line");
        String fileLocationThree = "test2.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocationThree))) {
            writer.write("orange");
            writer.newLine();
            writer.write("apple");
            writer.newLine();
            writer.write("banana");
            writer.newLine();
            writer.write("pear");
        }catch (IOException e) {
            System.out.println("Can not write file" + fileLocationThree);
        }

        System.out.println("File write completed: " + fileLocationThree);

        System.out.println("\n\n serializing objects");

        Person p1 = new Person("Joe" , 1);

        String pathString = "test.bin";

        try(var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
            os.writeObject(p1);
        }catch (FileNotFoundException e) {
            System.out.println("Can not create file: " + pathString);
        }catch (IOException e) {
            System.out.println("Can not write file: " + pathString);
        }

        System.out.println("Completed. " + pathString + " created.");

        try(var os = new ObjectInputStream(new FileInputStream(pathString))) {
            Person p = (Person) os.readObject(); // we should cast the object that returns from the readObject method
            //, to the object type that we know we have saved before
            System.out.println("The below object is have been read from file\n" +p);
        }catch (FileNotFoundException e) {
            System.out.println("Can not open file: " + pathString);
        }catch (IOException e) {
            System.out.println("Can not read file: " + pathString);
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot read object from file: " + pathString);
        }

        System.out.println("Completed. " + pathString + " read successfully.");

    }
}
