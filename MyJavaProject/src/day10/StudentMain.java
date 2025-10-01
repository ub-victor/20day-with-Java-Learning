package day10;

public class StudentMain {

	public static void main(String[] args) {

		
		// Create object with reference variable
		
/*
		Student s = new Student();
		s.sid = 1001;
		s.sname = "Victoire";
		s.grade = 'A';
		s.printStudentData();
		
*/
		
		new Student();
		
		new Student().sid = 1002;
		new Student().sname = "Kyle";
		new Student().grade = 'B';
		
		new Student().printStudentData();
		
		
		

	}

}
