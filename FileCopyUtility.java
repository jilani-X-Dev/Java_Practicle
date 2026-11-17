import java.io.*;

public class FileCopyUtility {

    public static void main(String[] args) throws IOException {

        // Create binary source file
        FileOutputStream binary =
            new FileOutputStream("source.bin");

        for (int i = 0; i < 10000; i++) {
            binary.write(i % 256);
        }

        binary.close();

        // Copy binary file using byte streams
        long start = System.nanoTime();

        FileInputStream in =
            new FileInputStream("source.bin");

        FileOutputStream out =
            new FileOutputStream("copy.bin");

        byte[] buffer = new byte[1024];
        int bytes;

        while ((bytes = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytes);
        }

        in.close();
        out.close();

        long byteTime = System.nanoTime() - start;

        // Create text file
        FileWriter writer = new FileWriter("source.txt");
        writer.write("Welcome to Java File Handling.");
        writer.close();

        // Copy text using character streams
        start = System.nanoTime();

        FileReader reader = new FileReader("source.txt");
        FileWriter textWriter = new FileWriter("copy.txt");

        char[] chars = new char[1024];
        int count;

        while ((count = reader.read(chars)) != -1) {
            textWriter.write(chars, 0, count);
        }

        reader.close();
        textWriter.close();

        long charTime = System.nanoTime() - start;

        System.out.println("Binary File Copied Successfully");
        System.out.println("Text File Copied Successfully");

        System.out.println("Byte Stream Time: " + byteTime);
        System.out.println("Character Stream Time: " + charTime);
    }
}