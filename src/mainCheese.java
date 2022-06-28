public class mainCheese {
    public static void main(String[] args) {

        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStinkiness(10);
        increseStinkiness();

        System.out.println(myCheese.getLevelOfStinkiness());
    }

    private static void increseStinkiness() {
        Cheese cheese = new Cheese();
        cheese.setLevelOfStinkiness(756);
        //cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 10);
    }
}
