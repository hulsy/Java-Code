import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String userChoice;
		int compChoice;

		System.out.println("Let's play Rock, Paper, Scissors!");
		System.out.println("Make your choice:");
		userChoice = sc.next().toLowerCase();
		compChoice = random.nextInt(3);
		
		if (userChoice.equals("rock")){
			if (compChoice == 0) {
				System.out.println("AI picks rock.. TIE!");
			}
			else if (compChoice == 1) {
				System.out.println("AI picks paper... YOU LOSE!!");
			}
			else if (compChoice == 2) {
				System.out.println("AI picks scissors... YOU WIN!!");
			}
		}
		if (userChoice.equals("paper")){
			if (compChoice == 0) {
				System.out.println("AI picks rock.. YOU WIN!!");
			}
			else if (compChoice == 1) {
				System.out.println("AI picks paper... TIE!");
			}
			else if (compChoice == 2) {
				System.out.println("AI picks scissors... YOU LOSE!!");
			}
		}
		if (userChoice.equals("scissors")){
			if (compChoice == 0) {
				System.out.println("AI picks rock.. YOU LOSE!!");
			}
			else if (compChoice == 1) {
				System.out.println("AI picks paper... YOU WIN!!");
			}
			else if (compChoice == 2) {
				System.out.println("AI picks scissors... TIE!");
			}
		}
	}

}
