import java.util.Scanner;

public class VelocityProblem
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double velocity0 = 0;
		double velocity1 = 0;
		
		double distance = 0;
		
		double timeToGetAheadSeconds = 0;
		double timeToGetAheadMinutes = 0;
		
		
		// Setting the values for speed and distance
		
		System.out.print("Set the velocity for the first vehicle: ");
		velocity0 = input.nextDouble();
		
		System.out.print("Set the velocity for the second vehicle: ");
		velocity1 = input.nextDouble();
		
		System.out.print("Set the distance between vehicles: ");
		distance = input.nextDouble();
		
		velocity0 = Math.abs(velocity0);
		velocity1 = Math.abs(velocity1);
		distance = Math.abs(distance);
		
		
		// Solving problem
		
		timeToGetAheadSeconds = distance / Math.abs(velocity0 - velocity1);
		timeToGetAheadMinutes = timeToGetAheadSeconds / 60;
		
		System.out.printf("The second vehicle will get ahead of the first one in %.2f minutes.", timeToGetAheadMinutes);
	}
}