import java.util.ArrayList;
import java.util.Arrays;

public class Apples {
    public static void main(String[] args) {
        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        System.out.println(Arrays.toString(friendsArray));
        System.out.println(friendsArrayList);
    }
}
