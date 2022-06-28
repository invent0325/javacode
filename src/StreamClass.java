import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        try (Stream<String> streamEmpty = Stream.empty()) {
        }

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println(streamOfCollection.sorted());

    }
}
