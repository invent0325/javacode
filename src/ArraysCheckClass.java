import java.util.Arrays;

public class ArraysCheckClass {
    public static void main(String[] args) {

        Students[] st = new Students[10];
        Object[] obj = new Object[2];
        Grades[] gd = new Grades[2];

        st[0] = new Students("James");
        st[1] = new Students("Karl");
        st[2] = new Students("John");

        obj[0] = new Book("Welcome to Jungle");
        obj[1] = new Book("Nightmare at Elm");

        gd[0] = new Grades(92);
        gd[1] = new Grades(89);

    }

    static class Students {

        public Students(String s) {
            System.out.println(s);
        }
    }

    static class Book {
        public Book(String book) {
            System.out.println(book);
        }
    }
    
    static class Grades {

        public Grades(int i) {
            System.out.println(i);
        }
    }
}
