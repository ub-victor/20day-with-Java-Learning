package day13;

public class StaticExample {
	
	int a= 10;
	int b = 20;
	
	void m1(){
		System.out.println("We are in m1 static method");
	}
	
	void m2(){
		System.out.println("We are in m2 not-static method");
	}
	
	public static void main(String[] args) {
		
		StaticExample p = new StaticExample();
		
		System.out.println(p.a);
		System.out.println(p.b);
		
	}

}
