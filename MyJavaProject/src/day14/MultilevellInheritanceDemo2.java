package day14;

class A1{
	
	int a;
	
	void display() {
		System.out.println("In class A: "+ a);
	}
}

class B1 extends A1{
	int b;
	
	void show() {
		System.out.println("In class B:" + b);
	}
}

class C1 extends B1{
	int c;
	
	void show() {
		System.out.println("In class c:" + c);
	}
}


public class MultilevellInheritanceDemo2 {
	
	
	public static void main(String[] args) {
		
		C1 cObject = new C1();

	}

}
