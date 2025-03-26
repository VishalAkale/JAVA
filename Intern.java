// package in;

public abstract class Intern  implements Employee
{
    @SuppressWarnings("FieldMayBeFinal")
    private double stipend;
    @SuppressWarnings("unused")
    Intern(double stipend )
    {
        this.stipend=stipend;
        
    }
    public double calculateSal() 
    {
        return this.stipend;
        }
}