import java.util.Arrays;

public class ArraysList1 {
    public static void main(String[] args) {
        String[] list = new String[]{"chicken", "bacon", "avocado"};
        for(String s: list) {
            System.out.print(s + " ");
        }

        System.out.println();

        int[] arr1 = new int[5];
        Arrays.fill(arr1, 100);
        for(Integer i : arr1)
            System.out.print(i + " ");
    }
}
