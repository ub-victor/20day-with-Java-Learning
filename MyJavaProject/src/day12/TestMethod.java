package day12;

public class TestMethod {

	int num;
	
	void modifyValue(int n) {
		 n = n+10;
		 System.out.println("The value in the method: "+ n);
	}
	
	void modifyObject(TestMethod t) {
		t.num = t.num + 10;
		System.out.println("THe value in the method: "+ t.num);
		
	}
	

}
