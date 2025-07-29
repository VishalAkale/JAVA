
public class Car extends Vehicle
{
    final double ratePerDay = 700.5f;

    @SuppressWarnings("unused")
    Car(String b, int y)
    {
        super(b,y);
    }

    @Override
    public double calculateRentalCost(int day)
    {
        return day*this.ratePerDay;
    }
}