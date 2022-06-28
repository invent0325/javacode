public class Printer<T>  {
    T thingToCheck;

    public Printer(T thingToCheck) {
        this.thingToCheck = thingToCheck;
    }

    public void print() {
        System.out.println(thingToCheck);
    }
}
