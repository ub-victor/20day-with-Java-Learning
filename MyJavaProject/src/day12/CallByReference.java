package day12;

public class CallByReference {
	
	public static void main(String[] args) {
		
		TestMethod tm = new TestMethod();
		
		//int origNum = 100;
		int origNum = tm.num = 100;
		System.out.println("Value before method call: "+ origNum);
		
		tm.modifyObject(tm);
		
		System.out.println("Value after method call: "+ origNum);
		
		
		
	}

}
