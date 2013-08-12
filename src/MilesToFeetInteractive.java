import java.util.Scanner;

public class MilesToFeetInteractive {

	public static void main(String[] args) {
		//Declare variable and initialize name constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		float uncleFeet, uncleMiles;
		
		//Comment :) 
		System.out.println("Lets Start To Convert");
		
		//Initialized Scanner
		Scanner kbrd = new Scanner(System.in);
		
		//User Input
		System.out.print("Enter Number In Miles: ");
		uncleMiles = kbrd.nextFloat();
		
		//Convert Miles to Feet
		uncleFeet = uncleMiles * FEET_PER_MILE;
		
		//System Output
		System.out.println("The distance between your house and your distanation is, " + uncleFeet + "Ft!");
	}

}
