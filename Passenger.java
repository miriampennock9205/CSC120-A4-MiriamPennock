public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean boardCard(Car c)
    {
        return c.addPassenger(this);
    }
    
    public boolean getOffCar(Car c)
    {
        return c.removePassenger(this);
    }
}
