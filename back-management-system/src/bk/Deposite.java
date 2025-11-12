package bk;

public class Deposite extends OpenAccount {
		private int transactionId;
		private double deposited;
		private double finalBalance;

		public Deposite(int bankId, String bankName, String bprAddress, int nationalId, String firstName,
				String lastName, int age, String address, String phoneNumber, double initialBalance, int transactionId,
				double deposited, double finalBalance) {
			super(bankId, bankName, bprAddress, nationalId, firstName, lastName, age, address, phoneNumber, initialBalance);
			this.transactionId = transactionId;
			this.deposited = deposited;
			this.finalBalance = finalBalance;
			

		
		}

		public int getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}

		public double getDeposited() {
			return deposited;
		}

		public void setDeposited(double deposited) {
			this.deposited = deposited;
		}

		public double getFinalBalance() {
			return finalBalance;
		}

		public void setFinalBalance(double finalBalance) {
			this.finalBalance = finalBalance;
		}

}

	
		



