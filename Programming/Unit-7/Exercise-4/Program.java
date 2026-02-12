import com.vehicles.*;
import com.utils.Printer;
import java.util.Scanner;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        // Variables

        Scanner input = new Scanner(System.in);

        Bike bike = new Bike();
        Car car = new Car();

        int chosenOption = 0;


        // Program

        do
        {
            showOptions();
            chosenOption = input.nextInt();

            actToOption(chosenOption, bike, car);
        }
        while (chosenOption != 12);


        input.close();
    }


    private static void showOptions()
    {
        System.out.println("OPTIONS - VEHICLES");
        System.out.println("========================================================================");
        System.out.println("\t1. Roll with bike 10 km");
        System.out.println("\t2. Change pinions - Show the change");
        System.out.println("\t3. Show bike\'s kilometers (total and partial)");
        System.out.println("\t4. Show all the bike\'s information");
        System.out.println("\t5. Roll car with 1000 km");
        System.out.println("\t6. Check car");
        System.out.println("\t7. Show car\'s kilometers (total and partial)");
        System.out.println("\t8. Get to know the kilometers that subtract for the car\'s check");
        System.out.println("\t9. See all the car\'s information");
        System.out.println("\t10. Check the created vehicles amount");
        System.out.println("\t11. Check the all vehicle\'s total kilometers");
        System.out.println("\t12. Exit");
        System.out.println("\t\tPick an option (1-12):");
        System.out.println("=========================================================================");
    }


    private static void actToOption(int chosenOption, Bike bike, Car car)
    {
        switch (chosenOption) // Für meinen Entwicklungsumgbugenlehrer ^^
            {
                case 1:
                    bike.travel(10);
                    break;
                
                case 2:
                    bike.changePinions((int)(1 + Math.random() * 9));
                    break;

                case 3:
                    System.out.printf("Total: %.2f\nPartial: %.2f\n", bike.getKilometersTraveled(), bike.getPartialKilometers());
                    break;

                case 4:
                    System.out.println(bike);
                    break;
                
                case 5:
                    car.travel(1000);
                    break;
                
                case 6:
                    car.check();
                    break;
                
                case 7:
                    System.out.printf("Total: %.2f\nPartial: %.2f\n", car.getKilometersTraveled(), car.getPartialKilometers());
                    break;
                
                case 8:
                    break;

                case 9:
                    System.out.println(car);
                    break;
                
                case 10:
                    System.out.printf("#Vehicles: %d\n", Vehicle.getCreatedVehicles());
                    break;
                
                case 11:
                    System.out.printf("Total kilometers: %.2f\n", Vehicle.getTotalKilometers());
                    break;

                case 12:
                    System.out.println(Printer.ANSI_CYAN + "Exit");
                    break;
                
                default:
                    Printer.error("Option does not exist!\n");
            }
    }
}