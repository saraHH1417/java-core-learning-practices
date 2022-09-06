package ReadingAndWritingFiles22.RWBinaryFiles;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class App {
    public static void main(String[] args) {
        new App().run();

        System.out.println("\n\nReading java class: \n");
        String classFile = "/media/sara/hdd/programming/projects/inTheNameOfGodjava/JavaCourse/out/production/JavaCourse/ReadingAndWritingFiles22/RWBinaryFiles/App.class";
        File file = new File(classFile);

        if(!file.exists()) {
            System.out.println("File does not exist: " + classFile);
        }

        try(var dis = new DataInputStream(new FileInputStream(file))) {
            int magicNumber = dis.readInt();
            System.out.printf("%x\n", magicNumber);

            int minorVersion = dis.readUnsignedShort();
            int majorVersion = dis.readUnsignedShort();

            System.out.println(majorVersion + ", " + minorVersion);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("completed");
    }

    public void run() {
        String fileName = "testReadingWritingBinaryFiles.bin";
        writeFile(fileName);
        readFile(fileName);
    }

    private void readFile(String fileName) {

        try(var dis = new DataInputStream(new FileInputStream(fileName))) {
            int value = dis.readInt();

            byte byte1 = dis.readByte();
            byte byte2 = dis.readByte();

            System.out.println(value + ", " + byte1 + ", " + byte2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n\nEndianness");
        int value = 0x01020304;
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(value);

        byte[] bytes = buffer.array();

        System.out.println("\nThe below bytes are in LITTLE_ENDIAN Order, meaning the least valuable byte comes first " +
                "and the most valuable byte comes at the end");
        for (var b: bytes) {
            System.out.printf("%02x ", b);
        }


    }

    private void writeFile(String fileName) {
        File file = new File(fileName);

        int value = 1;
        byte[] bytes = new byte[2];
        bytes[0] = 2;
        bytes[1] = 3;

        try(var dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(1);
            dos.write(bytes);
        } catch (FileNotFoundException e) {
            System.out.println("Can not create: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Can not write: " + file.getAbsolutePath());
        }

        System.out.println("Written " + file.getAbsolutePath());
    }

}
