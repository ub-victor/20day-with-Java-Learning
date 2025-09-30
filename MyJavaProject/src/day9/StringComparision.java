package day9;

public class StringComparision {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello"; // String Literal
		
		System.out.println();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));  // Best practice on String
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println();
		
		System.out.println(str3 == str4); // Check references
		System.out.println(str3.equals(str4));// it will output true as equal verify the contents 
		
		//Case 3
		String str5 = "hello";
		String str6 = new String("hello");
		String str7 = str6;
		
		System.out.println();
		
		System.out.println(str5 == str6); // Check references
		System.out.println(str5.equals(str6));
		
		// Case 7
		System.out.println();
		
		System.out.println(str6 == str7); //true because str7 got his value from str6
		System.out.println(str6.equals(str7));
		
		

	}

}
