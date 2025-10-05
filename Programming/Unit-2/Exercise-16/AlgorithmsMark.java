import java.util.Scanner;

public class AlgorithmsMark
{
	private static final float TEST_PERCENTAGE = 30;
	private static final float PARTIAL_PERCENTAGE = 55;
	private static final float FINAL_PROJECT_PERCENTAGE = 15;


	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		float testMark = 0;
		
		float partialMark1 = 0;
		float partialMark2 = 0;
		float partialMark3 = 0;

		float finalProjectMark = 0;
		
		float resultMark = 0;
		
		
		// Setting marks
		
		System.out.print("Set test mark: ");
		testMark = input.nextFloat();
		
		System.out.print("Set first partial mark: ");
		partialMark1 = input.nextFloat();
		
		System.out.print("Set second partial mark: ");
		partialMark2 = input.nextFloat();
		
		System.out.print("Set third partial mark: ");
		partialMark3 = input.nextFloat();
		
		System.out.print("Set final project mark: ");
		finalProjectMark = input.nextFloat();
		
		System.out.print("\n");
		
		
		// Limiting marks
		
		testMark = Math.min(10.0f, Math.max(0.0f, testMark));
		partialMark1 = Math.min(10.0f, Math.max(0.0f, partialMark1));
		partialMark2 = Math.min(10.0f, Math.max(0.0f, partialMark2));
		partialMark3 = Math.min(10.0f, Math.max(0.0f, partialMark3));
		finalProjectMark = Math.min(10.0f, Math.max(0.0f, finalProjectMark));
		
		
		// Computing final mark
		
		resultMark = (testMark * TEST_PERCENTAGE + (partialMark1 + partialMark2 + partialMark3) * PARTIAL_PERCENTAGE / 3 + finalProjectMark * FINAL_PROJECT_PERCENTAGE) / 100;
		System.out.printf("Final mark: %.2f.", resultMark);
	}
}