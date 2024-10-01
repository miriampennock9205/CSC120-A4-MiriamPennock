import java.util.ArrayList;
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity)
    {
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public int getCapacity()
    {
        return maxCapacity;
    }

    public int seatsRemaining()
    {
        return maxCapacity - passengers.size();
    }

    public boolean addPassenger(Passenger p)
    {
        if (seatsRemaining() > 0)
        {
            passengers.add(p);
            return true;
        }
        return false;
    }

    public boolean removePassenger(Passenger p)
    {
        return passengers.remove(p);
    }

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