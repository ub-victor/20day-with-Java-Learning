package day15;

class BackAccount{
	double balance;
	
	BackAccount (double balance){
		this.balance = balance;
	}
	
	double calculateInterest (double rate) {
		return balance * rate;
	}
}

class SavingsAccount extends BackAccount{
	double interestRate1;
	
	SavingsAccount( double balance, double interestRate){
		super(balance);
		this.interestRate1 = interestRate;
	
	}
	double interestRate;
}

public class FinalMethod {

	public static void main(String[] args) {
		

	}

}
