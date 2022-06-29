import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Carl");
        map.put(3, "Donna");
        System.out.println(map);

        map.replace(1, "John");
        System.out.println(map);
    }
}
