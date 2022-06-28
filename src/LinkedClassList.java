import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedClassList {
    public static void main(String[] args) {
        String[] stuff;
        LinkedList<String> theList = new LinkedList<>(List.of());

        theList.add("pumkingf");
        theList.addLast("firstthing");

        stuff = theList.toArray(new String[0]);

        System.out.println(Arrays.toString(stuff));
        System.out.println(theList);
    }
}
