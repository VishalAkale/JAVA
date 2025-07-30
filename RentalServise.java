public class RentalServise
{
    double rentVehicale(Vehicle vobj, int day)
    {
        return vobj.calculateRentalCost(day);
    }

    // Overload Method for returing a Vehicle with discount
    @SuppressWarnings("unused")
    double rentVehicale(Vehicle vobj, int day, double discount)
    {
        double cost = vobj.calculateRentalCost(day);
        return cost - (cost * discount/100);
    }
}



