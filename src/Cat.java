public class Cat extends Animal {
    String catFoodPreference;

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow meow meow");
    }
}
