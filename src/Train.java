public class Train extends Transportation {

    int trainNumber = 90234;
    String trainName = "Mandavi Express" ;

    Train() {
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
