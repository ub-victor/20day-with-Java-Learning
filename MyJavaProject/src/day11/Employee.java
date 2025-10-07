package day11;

public class Employee {
	
	int eid;
	String ename;
	boolean sal;
	
	void displayEmpData() {
		System.out.println("Employee ID: "+ eid);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Salary: "+ sal);
	}
	
	void setEmpData(int id, String name, boolean pay) {
		eid = id;
		ename = name;
		sal = pay;
		
		
		}
	
	
	
}