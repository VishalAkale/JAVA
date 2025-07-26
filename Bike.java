
public class Bike extends Vehicle
{
   final double ratePerDay = 300.5f;

   @SuppressWarnings("unused")
    Bike(String b, int y)
    {
        super(b,y);
    }

    @Override
    public double calculateRentalCost(int day)
    {
        return day*this.ratePerDay;
    }
}