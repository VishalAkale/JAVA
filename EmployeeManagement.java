public class EmployeeManagement 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        Employee eob;
        eob= new FullTimeEmployee(45000);
        System.out.println("Salary of Full time Employee: ");
        eob.calculateSal();

        eob = new PartTimeEmployee(10000,50);
        System.out.println("Salary of part time Employee: ");
        eob.calculateSal();

        eob = new Intern(15000);
        System.out.println("Salary of new Intern:");
        System.oot.println(eob.calculateSal());
    }
}
