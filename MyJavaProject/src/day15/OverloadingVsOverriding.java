package day15;

class ABC {
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	void m1(int a ) { // Overriding
		System.out.println(a);
		
	}
	
	void m2(int b ) { // Overriding
		System.out.println(b);
		
	}
	
	void m2(int b ) { // Overriding
		System.out.println(b);
		
	}
	
	
	
	
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		

	}

}
