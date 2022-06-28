import java.util.HashMap;

public class MapsHash {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 3123);
        empIds.put("Carl", 4232);
        empIds.put("Jerry", 8223);

        System.out.println(empIds.get("Carl"));
    }
}
