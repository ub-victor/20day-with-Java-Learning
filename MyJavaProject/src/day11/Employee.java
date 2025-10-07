package day11;

public class Employee {
	
	int eid;
	String ename;
	double sal;
	
	void displayEmpData() {
		System.out.println("Employee ID: "+ eid);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Salary: "+ sal);
	}
	
	void setEmpData(int id, String name, double pay) {
		eid = id;
		ename = name;
		sal = pay;
		
		 
		}
	
	Employee (){ // this is a construction  like a method but with same name as class with  no return type any value
		
	}
	
	
	
}