import java.util.Arrays;

public class ReverseExample {
    public static void main(String[] args) {
        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"A", "B", "C"};
        String[] a3 = {"X", "Y", "Z"};

        boolean matches = Arrays.equals(a1, a2);  //true
        System.out.println(matches);
        matches = Arrays.equals(a1, a3);  //false
        System.out.println(matches);

        String[][] a4 =
                {
                        {"A", "B", "C"},
                        {"X", "Y", "Z"}
                };
        String[][] a5 =
                {
                        {"A", "B", "C"},
                        {"X", "Y", "Z"}
                };

        boolean matches1 = Arrays.deepEquals(a4, a5);  //true
        System.out.println(matches1);

        Integer[][] a6 = {
                {1, 2, 3},
                {4, 5, 7}
        };
        Integer[][] a7 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        boolean intMatches = Arrays.deepEquals(a6, a7);
        System.out.println(intMatches);
    }
}
