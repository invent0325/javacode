public class mainPrinter {
    public static void main(String[] args) {

        Printer<Double> printer = new Printer<>(23.56);
        printer.print();

        Printer<String> printString = new Printer<>("Hello World");
        printString.print();
    }
}
