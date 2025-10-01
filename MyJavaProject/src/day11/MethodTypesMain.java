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
		
		// Takes  params Return Value
		
		System.out.println(mt.m4("Smith", 20)); 
		String str = mt.m4("Victoire", 20);
		System.out.println(str.trim()); // trim method is type of no params and now value
		   

	}

}
