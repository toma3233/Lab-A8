/**
 * 
 * @author Tom Abraham
 * period # 1
 */

public class RichterScale {
	/**
	 * This is a static class named getEffect
	 * It is used for getting the effect of a earthquake with a specific magnitude
	 * @param richter The value for richter, which is the magnitude of the earthquake, gets passed in from the driver
	 * The class consists of mainly if statements in order to precisely output the correct effect for each magnitude
	 */
	public static void getEffect(double richter)
	{
		if (richter < 4.5){
			System.out.println("No destruction of buildings");
			//your code goes here
		}
		
		if (richter >= 4.5 && richter < 6){
			System.out.println("Damage to poorly constructed buildings");
			
		}
		
		if (richter >= 6 && richter < 7){
			System.out.println("Many buildings considerably damaged, some collapse");
			
		}
		
		if (richter >= 7 && richter < 8){
			System.out.println("Many buildings destroyed");
			
		}
		
		if (richter >= 8){
			System.out.println("Most structures fall");
			
		}
	}
}
