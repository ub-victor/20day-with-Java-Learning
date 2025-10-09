package day12;

public class MainMethodOverload {
	
	void main(int x) {
		
		System.out.println(x);
		
	}
	
	void main(int x,int y) {
		
		System.out.println(x+y);
			
		}

	public static void main(String[] args) {
		
		MainMethodOverload m = new MainMethodOverload();
		
		m.main(10);
		m.main(5,6);
		

	}

}
