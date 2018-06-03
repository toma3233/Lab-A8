/**
 * 
 * @author  Tom Abraham
 * period # 1
 */
import java.util.Scanner;
public class Elevator {
	final int MAX_FLOORS = 20;
	
	public Elevator() {
		
	}
	
	public void simulate() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Floor: ");
		if (scan.hasNextInt()) {
			int newFloor = scan.nextInt();
			
			if (newFloor == 13) {
				System.out.println("Error: There is no thirteenth floor");
			}
			else if (newFloor <= 0 || newFloor > 20) {
				System.out.println("Error: The floor must be between 1 and 20");
			}
			else {
				int actualFloor;
				if (newFloor > 13) {
					actualFloor = newFloor - 1;
				}
				else {
					actualFloor = newFloor;
				}
				System.out.println("Thank you, I will take you to the actual floor " + actualFloor);
				

			}
			
			
			
			
		}
		else {
			System.out.println("Error: Not an integer");
		}
		
		
	
		
		/*if ((!(newFloor == 13)) && newFloor >= 1 && newFloor < 13) {
			System.out.printf("Floor: %d\n", newFloor);
			System.out.printf("Thank you, I will take you to the actual floor %d\n" , newFloor);
			if ((!(newFloor == 13)) && newFloor >= 1 && (newFloor > 13 && newFloor <= MAX_FLOORS)) {
				//System.out.printf("Floor: %d\n", newFloor);
				System.out.printf("Floor : %d\nThank you, I will take you to the actual floor %d\n" , newFloor, (newFloor - 1));
			}
		}
		
		if (!scan.hasNextInt()) {
			System.out.println("Error: Not an integer");
		}
		
		if (newFloor < 0 || newFloor > MAX_FLOORS) {
			System.out.println("Error: The floor must be between 1 and 20");
		}
		
		if (newFloor == 13) {
			System.out.println("Error: There is no thireenth floor");
		}*/
		
		
		
	}	
}
