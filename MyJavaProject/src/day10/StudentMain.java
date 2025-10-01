package day10;

public class StudentMain {

	public static void main(String[] args) {

		
		// Create object with reference variable
		

		Student s = new Student();
		s.sid = 1001;
		s.sname = "Victoire";
		s.grade = 'A';
		s.printStudentData();  
		


/*

This will output something like : Student id: 0, Name:null, Grade:
Due to the fact we did not yet create a reference object an object without reference variable
		
		new Student();
		
		new Student().sid = 1002;
		new Student().sname = "Kyle";
		new Student().grade = 'B';
		
		new Student().printStudentData();

*/
		

	}

}
