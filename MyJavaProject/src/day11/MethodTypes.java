package day11;

public class MethodTypes {

		// No params no return value
	
		 void m1(){ //method signature
			
			 //Statement
			 
			 System.out.println("Welcome");
			 
		}
		 
		 
		// No params Return Value , the instead of using void we will give the method the return Type
		
		String m2(){
			return ("Welcome to java Programming");
		}
		
		// Takes params No Return Value
		
		void m3(String name) {
			System.out.println("Hi dear "+name);
		}
		
		// Takes  params Return Value
		
		String m4(String name, int age) {
			return ("Hi "+ name+ " I am "+ age);
		}
		
		
		
		
		
		

}
