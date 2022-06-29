import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MoreCollections {
    public static void main(String[] args) {

        String[] array = {"A", "B", "C", "D", "E"};
        Collections.reverse(Arrays.asList(array));

        System.out.println(Arrays.toString(array));

        System.out.println(array.length);
        IntStream.range(0, array.length / 2).forEach(i -> {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        });

        System.out.println(Arrays.toString(array)); //[E, D, C, B, A]

    }
}
