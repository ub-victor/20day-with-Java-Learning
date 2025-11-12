package bk;

public class OpenAccount extends Bpr {
	
	private int nationalId;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private String phoneNumber;
	private double initialBalance;

	public OpenAccount(int bankId, String bankName, String bprAddress, int nationalId, String firstName,
			String lastName, int age, String address, String phoneNumber, double initialBalance) {
		super(bankId, bankName, bprAddress);
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.initialBalance = initialBalance;
	}


	// getter and setter methods
	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

}


