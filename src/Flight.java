public class Flight extends Transportation {
    int flightNumber = 92234;
    String flightName = "Etihad Airways";

    Flight() {

    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", flightName='" + flightName + '\'' +
                '}';
    }
}
