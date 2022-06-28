public class mainCheese {
    public static void main(String[] args) {

        Cheese myCheese = new Cheese(100);

        increseStinkiness(myCheese);

        System.out.println(myCheese.getLevelOfStinkiness());
    }

    private static void increseStinkiness(Cheese cheese) {
        cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 10);
    }
}
