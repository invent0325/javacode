package welcome.com;

public class WrapperClass {
    public static void main(String[] args) {

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);

        double x = 0;
        System.out.println(Double.isNaN(x));
    }
}
