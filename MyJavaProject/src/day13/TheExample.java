package day13;

public class TheExample {
	
	int a,b;  // Class variables
	
	/*
	void setData(int x, int y) { // x and be are Local Variables
		a = x;
		b = y;
	}
	*/
	
	void setData(int a, int b) {
		this.a = a;// "this" is used to indicate class variable
		this.b  = b;
	}
	
	void displayData() {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		
		TheExample t = new  TheExample();
		t.setData(10, 10);
		
		t.displayData(); 
		

	}

}
