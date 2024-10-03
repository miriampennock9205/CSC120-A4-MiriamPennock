/**
 * The Engine class represents a train engine that uses a specific fuel type and manages
 * fuel levels. It supports refueling and consuming fuel while the engine is running.
 */
public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

     /**
     * Constructor for the Engine class.
     * Initializes the engine with a specified fuel type and maximum fuel level.
     * The engine starts with a full tank of fuel.
     *
     * @param fuelType The type of fuel the engine uses.
     * @param maxFuelLevel The maximum fuel capacity of the engine.
     */
    public Engine(FuelType fuelType, double maxFuelLevel)
    {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Refuels the engine to its maximum fuel capacity.
     */
    public void refuel()
    {
        this.currentFuelLevel = this.maxFuelLevel;
    }


    /**
     * Consumes fuel as the engine runs.
     * If there is sufficient fuel, it reduces the fuel level by 10 units.
     * 
     * @return true if the engine successfully consumes fuel, false if fuel is empty.
     */
    public boolean go()
    {
        if (this.currentFuelLevel > 0)
        {
            this.currentFuelLevel -= 10;
            System.out.println("Fuel level: " + this.currentFuelLevel);
            return true;
        }
        return false;
    }

     /**
     * Returns the type of fuel the engine uses.
     *
     * @return The fuel type of the engine.
     */
    public FuelType getFuelType()
    {
        return fuelType;
    }

     /**
     * Returns the current fuel level in the engine.
     *
     * @return The current amount of fuel in the engine.
     */
    public double getCurrentFuelLevel()
    {
        return currentFuelLevel;
    }

     /**
     * Returns the maximum fuel level the engine can hold.
     *
     * @return The maximum fuel capacity of the engine.
     */
    public double getMaxFuelLevel()
    {
        return maxFuelLevel;
    }

}