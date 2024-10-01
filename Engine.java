public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType fuelType, double maxFuelLevel)
    {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    public void refuel()
    {
        this.currentFuelLevel = this.maxFuelLevel;
    }

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

    public FuelType getFuelType()
    {
        return fuelType;
    }

    public double getCurrentFuelLevel()
    {
        return currentFuelLevel;
    }

    public double getMaxFuelLevel()
    {
        return maxFuelLevel;
    }

}