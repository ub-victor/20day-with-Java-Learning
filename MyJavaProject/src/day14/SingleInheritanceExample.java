package day14;

class Employee{
	String name = "Victoire Ushindi";
	int empID = 27269;
	
	void word() {
		System.out.println(name + " Is working");
	}
}

class Manager extends Employee{
	String department = "Sales";
	
	void manage() {
		System.out.println(name + " Is manging the "+ department);
	}
}

public class SingleInheritanceExample {

	public static void main(String[] args) {
		
		
		Manager m = new Manager();
		System.out.println(m.manage());
		

	}

}
