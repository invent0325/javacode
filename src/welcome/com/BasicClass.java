package welcome.com;

public class BasicClass {
    public static void main(String[] args) {
        String greetings = "Welcome to Core Java";
        System.out.println(greetings);

        for(int i = 0; i > greetings.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}
