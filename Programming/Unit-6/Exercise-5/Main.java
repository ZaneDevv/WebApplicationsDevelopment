import java.util.Scanner;


/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		Car[] cars = {
			new Car("Tesla", "Tesla Model 3", 2023),
			new Car("Toyota", "Corolla", 2023),
			new Car("Ford", "Ford Mustang Mach-E", 2023),
			new Car("BMW", "BMW i4", 2023),
			new Car("Volkwagen", "Volkswagen Golf GTI", 2023)
		};

		Car[] specifiedCars = new Car[0];


		// Looking for Models

		System.out.print("Set a model: ");
		specifiedCars = obtainCarsWithModel(cars, input.nextLine());


		// Showing result

		for (Car car : specifiedCars)
		{
			if (car == null)
			{
				continue;
			}

			System.out.print("\n");
			System.out.printf("Brand: %s\nModel: %s\nYear: %d", car.getBrand(), car.getModel(), car.getYear());
		}


		input.close();
	}



	private static Car[] obtainCarsWithModel(Car[] cars, String model)
	{
		Car[] result = new Car[0];
		Car[] copiedResult = new Car[0];

		for (Car car : cars)
		{
			if (car == null)
			{
				continue;
			}

			if (car.getModel().equalsIgnoreCase(model))
			{
				result = new Car[result.length + 1];

				for (int i = 0; i < copiedResult.length; i++)
				{
					result[i] = copiedResult[i];
				}
				result[result.length - 1] = car;

				copiedResult = result;
			}
		}

		return result;
	}
}