package day9;

import java.util.Arrays;

public class ReversingAString {

	public static void main(String[] args) {
		
		String str = "Victoire";
		String revStr = "";
		
	
/*
		// Method 1
		// Length and CharAt()
		for (int i= str.length()-1; i>=0; i--) {
			revStr += str.charAt(i); // ChatAt come with a character at the specified index
		}
		
		System.out.println("Reverse String is: "+ revStr);

*/
	// Method 2	
/*
		
		char charArr[] = str.toCharArray(); // it will convert the string value to element in an array of character
		

		System.out.println(Arrays.toString(charArr));
		
		for(int i=charArr.length-1; i>0; i--) {
			
			revStr+=charArr[i];
		}
		System.out.println(revStr);
		
*/
		
		// 3Method 3
		
		StringBuffer strBuff = new StringBuffer("Selenium");
		System.out.println(strBuff.reverse());
		System.out.println(strBuff.length()); // We can just say it extend the ability of normal String
	}
}
