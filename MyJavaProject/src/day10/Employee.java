package day10;

public class Employee {
	
	int empId;
	String empName;
	String job;
	Double salary; 
	
	void displayEmployeesDetails(){
		//Statement
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(job);
		System.out.println(salary);
		
	}
	
	 

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();// Here a storage is create in the memory
		emp1.empId = 101 ;
		emp1.empName = "Kevin";
		emp1.job = "Developer";
		emp1.salary = 52100.64 ; 
		
		

	}

}
