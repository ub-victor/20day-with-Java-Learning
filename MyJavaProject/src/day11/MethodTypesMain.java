package day11;

public class MethodTypesMain {

	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		mt.m1();
		
		// No Params Return value , we have to Capture the type used
		/*
		  String str = mt.m2();
		  
		 System.out.println(str);
		 */
		System.out.println(mt.m2());
		
		// Takes params No Return Value
		
		mt.m3("Victoire");
		   

	}

}
