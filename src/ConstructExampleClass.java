public class ConstructExampleClass {
    public static void main(String[] args) {

        Pup p = new Pup("Kramer", 3);
        System.out.println(p);

        Pup p1 = new Pup("Jarome", 8, "Dallas");
        System.out.println(p1);

        Pup p2 = new Pup("Cuban", "Delaware");
        System.out.println(p2);
    }

    public static class Pup {
        String name;
        int age;
        String location;

        public Pup(String name, int age ) {
            this.name = name;
            this.age = age;
        }

        public Pup(String name, int age, String location ) {
            this.name = name;
            this.age = age;
            this.location = location;
        }

        public Pup(String name, String location) {
            this.name = name;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Pup{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", location='" + location + '\'' +
                    '}';
        }
    }
}
