
public class Bus extends Vehicle
{
   final double ratePerDay = 1000.5f;

   @SuppressWarnings("unused")
    Bus (String b, int y)
    {
        super(b,y);
    }

    
   @SuppressWarnings("override")
    public double calculateRentalCost(int day)
    {
        return day*this.ratePerDay;
    }
}