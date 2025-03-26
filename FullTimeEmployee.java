// package in;

public abstract class FullTimeEmployee implements Employee 
{
    @SuppressWarnings("FieldMayBeFinal")
    private double monthlySal;

    // Constructor to initialize the monthly salary
    public FullTimeEmployee(double sal) 
    {
        this.monthlySal = sal;
    }

    public double calculateSal() 
    {
        return this.monthlySal;
    }

    // // Optional: Override toString for better representation
    // @Override
    // public String toString() {
    //     return "FullTimeEmployee{" +
    //             "monthlySal=" + monthlySal +
    //             '}';
}
