public class TrainTest
{
    public static void main(String[] args) {
        Train train = new Train(FuelType.STEAM, 100.0, 3, 5);
        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");

        train.getCar(0).addPassenger(p1);
        train.getCar(1).addPassenger(p2);

        train.printManifest();  // Should list Alice in Car 1 and Bob in Car 2

        train.getEngine().go();  // Decrease fuel and print fuel level
        train.printManifest();
    }
}