package day13;

public class StaticExample {
	
	static int a= 10;
	static int b = 20;
	
	void m1(){
		System.out.println("We are in m1 static method");
	}
	
	void m2(){
		System.out.println("We are in m2 not-static method");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
