import java.util.Scanner;

public class BankSim {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount myAccount = new BankAccount();
		String account;

		System.out.print("Enter initial balance of your checking and savings accounts: ");
		myAccount.setBalances(sc.nextDouble(), sc.nextDouble());
		
		
		if (myAccount.getBalanceChecking() > 0 && myAccount.getBalanceSavings() > 0)
		{
	
			System.out.println("deposit, withdraw, or transfer?");
			String transaction = sc.next();
			
			if (transaction.equals("deposit"))
			{
				System.out.print("Which account would you like to deposit to: checking or savings? ");
				account = sc.next();
				
				if (account.equals("checking"))
				{
					System.out.print("How much would you like to deposit? ");
					myAccount.depositChecking(sc.nextDouble());
				} else if (account.equals("savings"))
				{
					System.out.print("How much would you like to deposit? ");
					myAccount.depositSavings(sc.nextDouble());
				} else System.out.println("Invalid account choice");
			}else if (transaction.equals("withdraw"))
			{
				System.out.print("Which account would you like to withdraw from: checking or savings? ");
				account = sc.next();
				
				if (account.equals("checking"))
				{
					System.out.print("How much would you like to withdraw? ");
					myAccount.withdrawChecking(sc.nextDouble());
				} else if (account.equals("savings"))
				{
					System.out.print("How much would you like to withdraw? ");
					myAccount.withdrawSavings(sc.nextDouble());
				} else System.out.println("Invalid account choice");
			} else if (transaction.equals("transfer"))
			{
				System.out.print("Which account would you like to transfer from: checking or savings? ");
				account = sc.next();
				
				if (account.equals("checking"))
				{
					System.out.print("How much would you like to transfer? ");
					myAccount.transferFromChecking(sc.nextDouble());
				} else if (account.equals("savings"))
				{
					System.out.print("How much would you like to transfer? ");
					myAccount.transferFromSavings(sc.nextDouble());
				} else System.out.println("Invalid account choice");
			}else System.out.println("Invalid transaction type!");
			
			System.out.printf("Balance in checking: $%.2f\n", myAccount.getBalanceChecking());
			System.out.printf("Balance in savings: $%.2f\n", myAccount.getBalanceSavings());
			
		} else System.out.println("Invalid starting balance");
	}
}
