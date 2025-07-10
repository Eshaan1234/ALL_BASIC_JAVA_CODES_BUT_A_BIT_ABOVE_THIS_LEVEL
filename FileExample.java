import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        // Write to file
        FileWriter writer = new FileWriter("demo.txt");
        writer.write("Hello Java File");
        writer.close();

        // Read from file
        FileReader reader = new FileReader("demo.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}
