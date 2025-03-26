// package in;

public abstract class PartTimeEmployee  implements Employee
{
    @SuppressWarnings("FieldMayBeFinal")
    private double hourlySal;
    @SuppressWarnings({"FieldMayBeFinal", "unused"})
    private int hoursWorked;
    @SuppressWarnings("unused")
    PartTimeEmployee(double sal,int hours)
    {
            this.hourlySal=sal;
            this.hoursWorked=hours;
    }

    public double calculateSal() 
    {
       return this.hourlySal;
       }
}