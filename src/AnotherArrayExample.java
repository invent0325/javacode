import java.util.Arrays;

public class AnotherArrayExample {
    public static void main(String[] args) {

        String[] status = new String[]{"New", "Provisioned", "Waiting for Approval", "Approved", "Active"};
        String[] accounts = {"Savings", "Current", "Loans", "Mortgage", "Gold Deposit"};

        Arrays.stream(status).forEach(System.out::println);
        Arrays.stream(accounts).forEach(System.out::println);
    }
}
