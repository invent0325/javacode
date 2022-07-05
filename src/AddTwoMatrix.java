import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in Matrix ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] first = new int[m][n];
        int[][] second = new int[m][n];

        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first Matrix");

        int c;
        for (c = 0; c < m; c++) {
            int d;
            for (d = 0; d < n; d++)
                first[c][d] = sc.nextInt();
        }

        for (c = 0; c < m; c++) {
            int d;
            for (d = 0; d < n; d++)
                second[c][d] = sc.nextInt();
                sum[c][d] = first[c][d] + second[c][d];
            System.out.println(sum[c][d]);
        }
    }
}
