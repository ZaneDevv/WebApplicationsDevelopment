import java.util.Scanner;

public class TripAToB
{
	private static final int SECONDS_IN_ONE_DAY = 86400;
	private static final String RESULT_PRINT_FORMAT = "Leaving the city A at %02d:%02d:%02d, you will arrive city B at %02d:%02d:%02d";

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte startTripHours = 0;
		byte startTripMinutes = 0;
		byte startTripSeconds = 0;
		
		int startTripInSeconds = 0;
		int arriveCityTripInSeconds = 0;
		
		byte arriveCityTripHours = 0;
		byte arriveCityTripMinutes = 0;
		byte arriveCityTripSeconds = 0;
		
		int secondsForCityB = 0;
		
		
		// Setting time values
		
		System.out.println("Set the time when the cyclist left the city.");
		
		System.out.print("Set the hours when the cylist left: ");
		startTripHours = input.nextByte();
		
		System.out.print("Set the minutes when the cylist left: ");
		startTripMinutes = input.nextByte();
		
		System.out.print("Set the seconds when the cylist left: ");
		startTripSeconds = input.nextByte();
		
		System.out.print("\nSet the seconds the cyclist will last to arrive to the city B: ");
		secondsForCityB = input.nextInt();
		
		
		startTripHours = (startTripHours < 0) ? 0 : (startTripHours >= 24) ? 23 : startTripHours;
		startTripMinutes = (startTripMinutes < 0) ? 0 : (startTripMinutes >= 60) ? 59 : startTripMinutes;
		startTripSeconds = (startTripSeconds < 0) ? 0 : (startTripSeconds >= 60) ? 59 : startTripSeconds;

		
		// Solving problem
		
		startTripInSeconds = startTripSeconds + 60 * (startTripMinutes + startTripHours * 60);
		arriveCityTripInSeconds = (startTripInSeconds + secondsForCityB) % SECONDS_IN_ONE_DAY;
		
		arriveCityTripSeconds = (byte)(arriveCityTripInSeconds % 60);
		arriveCityTripMinutes = (byte)((arriveCityTripInSeconds / 60) % 60);
		arriveCityTripHours = (byte)((arriveCityTripInSeconds / 3600) % 24);
		
		System.out.printf(RESULT_PRINT_FORMAT, startTripHours, startTripMinutes, startTripSeconds, arriveCityTripHours, arriveCityTripMinutes, arriveCityTripSeconds);
	}
}