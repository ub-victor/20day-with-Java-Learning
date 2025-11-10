package day13;

public class StaticExample {
	
	/*
	 static int a = 10; declares an integer variable a with a value of \(10\)
	 that has a static storage duration, meaning its value persists throughout
	 the program's execution, and its scope depends on where it is declared.
	 If declared inside a function, a retains its value across function calls and is only 
	 accessible within that function. If declared outside of any function, it becomes
	 a file-scope static variable, accessible only to the functions within that specific file. 
	 
	 the variable is accessible across the Object
	 * */
	
	static int a= 10;
	int b = 20;
	
	void m1(){
		System.out.println("We are in m1 static method");
	}
	
	static void m2(){
		System.out.println("We are in m2 not-static method");
	}
	
	static void m3(){
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(a); // Cannot access m() sd it is not-static
		//System.out.println(b);
		m2();  
		// m1();// Cannot access m() sd it is not-static
		
		StaticExample s = new StaticExample();
		s.m1();
		
 		
	}

}
