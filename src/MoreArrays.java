import java.util.Arrays;

public class MoreArrays {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5};

        int[] smallCopy = Arrays.copyOf(array1, 3);  //[0, 1, 2]
        System.out.println(Arrays.toString(smallCopy));

        int[] largeCopy = Arrays.copyOf(array1, 10); //[0, 1, 2, 3, 4, 5, 0, 0, 0, 0]
        System.out.println(Arrays.toString(largeCopy));

        //Similarly, the copyOfRange() method can be used to copy the items range of the old array into a new array.

        int[] array2 = {0, 1, 2, 3, 4, 5};

        int[] smallCopyRange = Arrays.copyOfRange(array2, 1, 3); // [1, 2]
        int[] largeCopyRange = Arrays.copyOfRange(array2, 2, 10); // [2, 3, 4, 5, 0, 0, 0, 0]

        System.out.println(Arrays.toString(smallCopyRange));
        System.out.println(Arrays.toString(largeCopyRange));
    }
}
