import java.util.Scanner;

public class WrapDemo 
{
    @SuppressWarnings("UnnecessaryTemporaryOnConversionFromString")
    public static void main(String[] args) 
    {
        Float P = 0.0f;
        Float I = 0.0f;
        int y = 0;

        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Enter the Principal Amount: ");
            P = Float.parseFloat(scanner.nextLine());

            System.out.println("Enter the Interest Rate: ");
            I = Float.parseFloat(scanner.nextLine());

            System.out.println("Enter the Number of Years: ");
            y = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format. Please enter valid numbers.");
            System.exit(1);
        }

        float value = loan(P, I, y);
        System.out.println("Final Value Is: " + value);
    }

    static float loan(float P, float I, int y) 
    {
        float sum = P;
        for (int year = 1; year <= y; year++) 
        
        {
            sum += (P * I) / 100;
        }
        return sum;
    }
}
