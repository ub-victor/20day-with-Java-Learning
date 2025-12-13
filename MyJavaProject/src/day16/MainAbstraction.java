package day16;

//Abstract class
abstract class Employee {

 String name;

 // Constructor
 Employee(String name) {
     this.name = name;
 }

 // Abstract method
 abstract double calculateSalary();

 // Concrete method
 void displayEmployee() {
     System.out.println("Employee Name: " + name);
 }
}

//Subclass 1: Full-Time Employee
class FullTimeEmployee extends Employee {

 double baseSalary;

 FullTimeEmployee(String name, double baseSalary) {
     super(name);
     this.baseSalary = baseSalary;
 }

 @Override
 double calculateSalary() {
     return baseSalary;
 }
}

//Subclass 2: Part-Time Employee
class PartTimeEmployee extends Employee {

 int hoursWorked;
 double hourlyRate;

 PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
     super(name);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}


public class MainAbstraction {

	public static void main(String[] args) {
		 Employee emp1 = new FullTimeEmployee("Alice", 3000);
	        Employee emp2 = new PartTimeEmployee("Bob", 80, 15);

	        emp1.displayEmployee();
	        System.out.println("Salary: $" + emp1.calculateSalary());

	        System.out.println();

	        emp2.displayEmployee();
	        System.out.println("Salary: $" + emp2.calculateSalary());

	}

}
