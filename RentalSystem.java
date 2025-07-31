import java.util.Scanner;
public class RentalSystem
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Welcome to Vehical rental system");
        System.out.println("1.Car \n 2.Bike \n 3. Bus ");
        System.out.println("Choose any vehical ");
        int option = sc.nextInt();

        RentalServise ren= new RentalServise();
        switch (option)
        {
            case 1 -> {
                Vehicle car = new Car ("BMW ", 2025);
                System.out.println("Car Rental Cost: "+ ren.rentVehicale(car, 5));
                car.displayInfo();
            }

            case 2 -> {
                Vehicle Bike = new Car ("Honda", 2023);
                System.out.println("Bike Rental Cost: "+ ren.rentVehicale(Bike, 10));
                Bike.displayInfo();
            }

            case 3 -> {
                Vehicle Bus = new Bus ("Valvo B11R", 2024);
                System.out.println("Bus Rental Cost: "+ ren.rentVehicale(Bus, 25));
                Bus.displayInfo();
            }
        }

    }
}