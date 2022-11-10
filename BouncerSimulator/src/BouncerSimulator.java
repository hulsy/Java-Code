import java.util.Scanner;

//class to make sure a bar can only allow 100 patrons max at any given time
public class BouncerSimulator {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_PATRONS = 100;
		int currentPatrons = 0;
		int patronsInOut = 0;
		String arrivalDeparture;
		
		System.out.print("How many people in your group? ");
		currentPatrons = sc.nextInt();
		System.out.println(currentPatrons + "/" + MAX_PATRONS + " capacity");
		
		while (currentPatrons < MAX_PATRONS) {
			System.out.print("How many people in your group? ");
			patronsInOut = sc.nextInt();
			System.out.print("Arrival or departure? ");
			arrivalDeparture = sc.next();
			if (arrivalDeparture.toLowerCase().equals("arrival")) {
				if ((currentPatrons + patronsInOut) <= MAX_PATRONS) {
					currentPatrons += patronsInOut;
				} else System.out.println("Not enough open seats in the bar for that group size");
			} else {
				if ((currentPatrons - patronsInOut) >= 0) {
					currentPatrons -= patronsInOut;
				} else System.out.println("I don't have that many people on my list.... who SNUCK IN?!!");	
			}
				
			System.out.println(currentPatrons + "/" + MAX_PATRONS + " capacity");
		}
		System.out.println("We are at full capacity for the evening! Better luck next time.");
	}
}
