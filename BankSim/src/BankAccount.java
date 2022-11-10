
public class BankAccount {
	private double balanceChecking = 0;
	private double balanceSavings = 0;
	
	public void setBalances(double balanceChecking, double balanceSavings) {
			this.balanceChecking = balanceChecking;
			this.balanceSavings = balanceSavings;
	}
	
	public double getBalanceChecking() {
		return balanceChecking;
	}
	public double getBalanceSavings() {
		return balanceSavings;
	}
	
	public void depositChecking (double amount) {
		this.balanceChecking += amount;
	}
	public void depositSavings (double amount) {
		this.balanceSavings += amount;
	}
	public void withdrawChecking (double amount) {
		this.balanceChecking -= amount;
		if (balanceChecking < 0) {
			this.balanceChecking += amount;
			System.out.println("Insufficient funds to perform that transaction.");
		}
	}
	public void withdrawSavings (double amount) {
		this.balanceSavings -= amount;
		if (balanceSavings < 0) {
			this.balanceSavings += amount;
			System.out.println("Insufficient funds to perform that transaction.");
		}
	}
	public void transferFromChecking (double amount) {
		this.balanceChecking -= amount;
		this.balanceSavings += amount;
		if (balanceChecking < 0) {
			this.balanceChecking += amount;
			this.balanceSavings -= amount;
			System.out.println("Insufficient funds to perform that transaction.");
		}
	}
	public void transferFromSavings (double amount) {
		this.balanceSavings -= amount;
		this.balanceChecking += amount;
		if (balanceSavings < 0) {
			this.balanceChecking -= amount;
			this.balanceSavings += amount;
			System.out.println("Insufficient funds to perform that transaction.");
		}
	}
}
