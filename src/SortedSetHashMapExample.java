import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetHashMapExample {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int j : new int[]{2, 4, 1, 1, 3}) {
            sortedSet.add(j);
        }

        System.out.println(sortedSet);  //[1,2,3]

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : new int[]{4, 2, 3}) {
            list.add(i);
        }
        list.forEach(System.out::print);
    }
}
