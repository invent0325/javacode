import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayExample {
    public static void main(String[] args) {

        int constVal = 0;

        int[] a = new int[2];
        IntStream.range(constVal, a.length).forEach(System.out::println);
        System.out.println();
        int[] x = new int[3];
        IntStream.range(constVal, x.length).forEach(System.out::println);
        System.out.println();
        String[] names = {"John", "James", "Jane"};
        for(String s: names) {
            System.out.println(s);
        }

        String[] status = { "Active", "Inactive", "Purged" };

        for(String st : status)
        {
            System.out.println(st);
        }

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        Integer valueMax = list.stream().max(Integer::compare).get();
        Integer valueMin = list.stream().min(Integer::compare).get();

        System.out.println(valueMax);
        System.out.println(valueMin);
    }
}
