import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)
    {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++)
        {
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Car getCar(int i)
    {
        return cars.get(i);
    }

    public int getMaxCapacity()
    {
        int totalCapacity = 0;
        for (Car c : cars)
        {
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    public int seatsRemaining()
    {
        int remainingSeats = 0;
        for (Car c : cars)
        {
            remainingSeats += c.seatsRemaining();
        }
        return remainingSeats;
    }

    public void printManifest()
    {
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }
}
