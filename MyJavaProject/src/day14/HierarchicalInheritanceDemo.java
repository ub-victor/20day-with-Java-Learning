package day14;

class Parent{
	
	void display(int a) {
		System.out.println(a);
	}
	
}

class Child1 extends Parent{
	
	void show(int b){
		System.out.println(b);
	}
	
}

class Child2 extends Child1{
	
	void print(int c){
		System.out.println(c);
	}
	
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.display(10);
		c1.show()
		

	}

}
