// Java code for Stream.min() method to get
// the minimum element of the Stream
// according to the provided Comparator.
import java.util.*;
import java.util.stream.Stream;

class GFG {

    // Driver code
    public static void main(String[] args)
    {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
       Integer var = list.stream().min(Integer::compare).get();
        System.out.println(var);

        System.out.println("-----------------------");

        List<Integer> list1 = Arrays.asList(-9, -28, 0, 25, 4, 95, 2312);
        Optional<Integer> value = list1.stream().max(Comparator.naturalOrder());
        if(value.isPresent()) {
            System.out.println(value.get());
        } else {
            System.out.println("Null");
        }
    }
}