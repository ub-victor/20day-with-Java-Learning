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
	double  interestRate;
	
	SavingsAccount( double balance, double  interestRate){
		super(balance);
		this. interestRate =  interestRate;
	
	}
	double calculateInterest(double rate) {
		return balance * rate * 2
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		

	}

}
