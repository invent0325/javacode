public class ConstructExampleClass {
    public static void main(String[] args) {

        Pup p = new Pup("Kramer", 3);
        System.out.println(p);
    }

    public static class Pup {
        String name;
        int age;

        public Pup(String name, int age ) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Pup{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
