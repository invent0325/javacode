public class ExceptionHandling {
    public static void main(String... args) {

        String n = "hello";
        Class<? extends String> c = n.getClass();

        System.out.println(c);
        try {
            //code goes here
            int myInt = Integer.parseInt("22");

        } catch (Exception e ) {
            //Code that we want to show when exception occurs
            System.out.println("you cant make an int from string");
        }
        System.out.println("code ends here");
    }
}
