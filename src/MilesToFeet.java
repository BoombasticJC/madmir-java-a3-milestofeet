
public class MilesToFeet {

	public static void main(String[] args) {
		//Declared and initialize name constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		//Declare  and initialize variables
		float uncleMiles = 8.5f;
		float uncleFeet = uncleMiles * FEET_PER_MILE;
		
		//Display Output
		System.out.println("The Distance to my Uncle's House is " + uncleMiles + " Miles.");
		System.out.println("That's " + uncleFeet + "Feet" );
		
	}

}
