import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class newArrayList {
    public static void main(String[] args) {

        ArrayList<String> newString = new ArrayList<>();
        ArrayList<String> s1 = new ArrayList<>();

        newString.ensureCapacity(20);

        newString.add("hello");
        newString.add("world");
        newString.add(0, "James");

        System.out.println(newString);

        var s = newString.clone();
        System.out.println(s);
        System.out.println(newString.contains("hello"));
        System.out.println(newString.get(0));
        System.out.println(newString.indexOf("world"));

        Iterator<String> it = newString.iterator();
        System.out.println(it);
        System.out.println(it.next());
    }
}
