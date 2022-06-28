public class GenericsExample {
    public static void main(String[] args) {
        IntegerPrinter it = new IntegerPrinter(24);
        DoublePrinter dt = new DoublePrinter(10.21);
        StringPrinter st = new StringPrinter("Hello World");

        it.print();
        dt.print();
        st.print();
    }

    public static class IntegerPrinter {
        Integer thingToPrint;
        public IntegerPrinter(Integer thingToPrint) {
            this.thingToPrint = thingToPrint;
        }

        public void print() {
            System.out.println(thingToPrint);
        }
    }

    public static class DoublePrinter {
        Double thingToPrintDouble;
        public DoublePrinter(Double thingToPrintDouble) {
            this.thingToPrintDouble = thingToPrintDouble;
        }

        public void print() {
            System.out.println(thingToPrintDouble);
        }
    }

    public static class StringPrinter {
        String thingToPrintString;
        public StringPrinter(String thingToPrintString) {
            this.thingToPrintString = thingToPrintString;
        }

        public void print() {
            System.out.println(thingToPrintString);
        }
    }
}
