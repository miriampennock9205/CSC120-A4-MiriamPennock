import java.util.ArrayList;
/**
 * The Car class represents a train car that can hold a specified number of passengers.
 * It manages adding, removing, and printing passenger information.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructor for the Car class.
     * Initializes the car with a specified maximum capacity.
     *
     * @param maxCapacity The maximum number of passengers the car can hold.
     */
    public Car(int maxCapacity)
    {
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    /**
     * Returns the maximum capacity of the car.
     *
     * @return The maximum number of passengers the car can hold.
     */
    public int getCapacity()
    {
        return maxCapacity;
    }

    /**
     * Returns the number of seats remaining in the car.
     *
     * @return The number of empty seats available in the car.
     */
    public int seatsRemaining()
    {
        return maxCapacity - passengers.size();
    }

    /**
     * Adds a passenger to the car if there is space.
     *
     * @param p The passenger to be added to the car.
     * @return true if the passenger was successfully added, false otherwise.
     */
    public boolean addPassenger(Passenger p)
    {
        if (seatsRemaining() > 0)
        {
            passengers.add(p);
            return true;
        }
        return false;
    }

    /**
     * Removes a passenger from the car.
     *
     * @param p The passenger to be removed from the car.
     * @return true if the passenger was successfully removed, false otherwise.
     */
    public boolean removePassenger(Passenger p)
    {
        return passengers.remove(p);
    }

    /**
     * Prints the list of passengers currently in the car.
     * If the car is empty, it prints a message indicating that.
     */
    public void printManifest()
    {
        if (passengers.isEmpty())
        {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers:");
            for (Passenger p : passengers)
            {
                System.out.println(p.getName());
            }
        }
    }
}