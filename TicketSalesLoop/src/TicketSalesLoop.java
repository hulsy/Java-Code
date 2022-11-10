import java.util.Scanner;

public class TicketSalesLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ticketsLeft = 100;
		int ticketsRequested;
		
		System.out.println("There are " + ticketsLeft + " tickets available");
		while (ticketsLeft > 0) {
			System.out.print("How many tickets would you like to buy? ");
			ticketsRequested = sc.nextInt();
			if (ticketsRequested <= ticketsLeft) {
				ticketsLeft -= ticketsRequested;
				System.out.println("There are " + ticketsLeft + " tickets available");
			} else if (ticketsRequested > ticketsLeft) {
				System.out.println("Not enough tickets left");
				System.out.println("There are " + ticketsLeft + " tickets available");
			}
		} System.out.println("SOLD OUT!!!");

	}

}
