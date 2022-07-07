package welcome.com;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class DatatypesClass {
    public static void main(String[] args) {

        AtomicInteger myValue = new AtomicInteger();
        System.out.println(myValue);
        System.out.println(Sequencer.next());
    }
    static class Sequencer {
        static AtomicLong sequenceNumber = new AtomicLong(17);

        public static long next() {
            long x = sequenceNumber.getAndIncrement();
            System.out.println(x);
            return 0 ;
        }
    }
}
