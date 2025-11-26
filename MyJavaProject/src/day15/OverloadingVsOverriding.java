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
		System.out.println(a*a);
		
	}
	
	void m2(int b ) { // Overriding
		System.out.println(b*b);
		
	}
	
	void m2(int a, int b ) { // Overloading
		System.out.println(a+b);
		
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		xyz.m1(2);
		xyz.m2(10,20); //Overloading
		xyz.m1(10);

	}

}
