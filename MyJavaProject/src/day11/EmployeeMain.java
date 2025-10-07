package day11;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		
		System.out.println("Using object reference variable");
		System.out.println();
		e1.eid = 101;
		e1.ename = "Victo";
		e1.sal = 34554.34;
		
		e1.displayEmpData();
		System.out.println();
		System.out.println("Using User-defined method");
		
		e1.setEmpData(120, "Robert", 345.45);
		e1.displayEmpData();
	
	}
	
}
