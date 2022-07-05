import java.util.ArrayDeque;

public class myArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Object> ad = new ArrayDeque<>();
        ad.add("hello");
        System.out.println(ad);
        ad.addFirst("world");
        ad.addFirst("james");
        System.out.println(ad);
        ad.addLast("java");
        System.out.println(ad);

        ArrayDeque<Object> ad1;
        ad1 = ad.clone();
        System.out.println(ad1);

    }
}
