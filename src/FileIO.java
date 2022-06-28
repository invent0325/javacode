import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String... args) {

        String[] names = {"John", "Carl", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.append("\nwrite again");
            writer.write("\nKeep writing to the file as long as it goes");

            for(String s : names) {
                writer.write("\n" + s);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
