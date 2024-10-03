import java.util.ArrayList;

/**
 * The Train class represents a train composed of an engine and multiple cars.
 * Each car holds a set number of passengers, and the train is powered by an engine.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

     /**
     * Constructs a Train object with the specified engine fuel type, fuel capacity, 
     * number of cars, and passenger capacity per car.
     *
     * @param fuelType The type of fuel used by the train's engine.
     * @param fuelCapacity The maximum fuel level of the train's engine.
     * @param nCars The number of cars attached to the train.
     * @param passengerCapacity The number of passengers each car can hold.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)
    {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++)
        {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the engine of the train.
     *
     * @return The engine of the train.
     */
    public Engine getEngine()
    {
        return engine;
    }

    /**
     * Returns the car at the specified index.
     *
     * @param i The index of the car.
     * @return The car at the given index.
     */
    public Car getCar(int i)
    {
        return cars.get(i);
    }

    /**
     * Returns the total passenger capacity of the train by summing the capacity of all cars.
     *
     * @return The total passenger capacity of the train.
     */
    public int getMaxCapacity()
    {
        int totalCapacity = 0;
        for (Car c : cars)
        {
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * Returns the number of seats remaining across all cars in the train.
     *
     * @return The total number of seats available in the train.
     */
    public int seatsRemaining()
    {
        int remainingSeats = 0;
        for (Car c : cars)
        {
            remainingSeats += c.seatsRemaining();
        }
        return remainingSeats;
    }

     /**
     * Prints a manifest of all passengers in each car of the train.
     * Each car is numbered in the output, followed by a list of its passengers.
     */
    public void printManifest()
    {
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }
}
