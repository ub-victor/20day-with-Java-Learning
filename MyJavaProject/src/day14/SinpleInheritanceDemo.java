package day14;

class A{
	int a;
	
	void display() {
		System.out.println("In class A: "+ a);
	}
}

class B extends A{
	int b;
	
	void show() {
		System.out.println("In class B:" + b);
	}
}


public class SinpleInheritanceDemo {
	
	
	public static void main(String[] args) {
		
		A aObject = new A();
		aObject.a = 10;
		aObject.display();
		
		B bObj = new B();
		bObj.a =10;
		bObj.b = 20;
		

	}

}
