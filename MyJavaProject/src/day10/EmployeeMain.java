package day10;
// We do not need to import the previous class as we are in the same package

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();// reference / instance variable
		emp1.empId = 201 ;
		emp1.empName = "Scott";
		emp1.job = "Analyst";
		emp1.salary = 23000.00; 
		
		emp1.displayEmployeesDetails();

	}

}
