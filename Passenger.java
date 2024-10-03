/**
 * The Passenger class represents an individual passenger with a name who can board and
 * get off a train car.
 */
public class Passenger {
    
    private String name;

     /**
     * Constructor for the Passenger class.
     * Initializes a new passenger with the given name.
     *
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

     /**
     * Returns the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName()
    {
        return name;
    }

     /**
     * Boards the specified car by adding the passenger to it.
     *
     * @param c The car the passenger is attempting to board.
     * @return true if the passenger successfully boards the car, false otherwise.
     */
    public boolean boardCard(Car c)
    {
        return c.addPassenger(this);
    }
    
    /**
     * Gets off the specified car by removing the passenger from it.
     *
     * @param c The car the passenger is attempting to get off.
     * @return true if the passenger is successfully removed from the car, false otherwise.
     */
    public boolean getOffCar(Car c)
    {
        return c.removePassenger(this);
    }
}
