package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Welcome";
		
		// Second method
		String s1 = new String("Welcome"); 
		
		System.out.println(s +" "+s1);
		
		int len = s.length();
		// System.out.println(len);
		System.out.println(s.length());
		
		// charAt(int index): Returns the character at the specified index.
		s= "Selenium";
		System.out.println(s.charAt(0));// S
		
		// isEmpty(): Checks if the string is empty.
		
		s = "";
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		// equals - Compares this string to the specified object for equality. Returns true/false
		String name = "Victoire";
		
		System.out.println(name.equals("victoire"));
		System.out.println(name.equals("Victoire"));
		
		// equalsIgnoreCase - compares this string to another string, ignoring case
		System.out.println(name.equalsIgnoreCase("victoire"));
		
		//Concat(String str)  - Concatenates the Specified String to the end of this String.
		
		String greet = "Hello ";
		
		System.out.println(greet.concat(name));
		
		// indexOf - Returns the index of the first occurrence of the specified substring
		
		s = "I like coding. I like java coding";
		System.out.println(s.indexOf("coding"));
		System.out.println(s.indexOf("love"));//-1 which means not exist
		
		s = "I like coding. I like Java coding. I like python coding";
		System.out.println(s.lastIndexOf("coding"));// 49 , it will look for the last occurancy of the specify word
		// Contains - Check if the string contains the specified sequence of char values. Return true/false
		
		
		s = "Breakfast";
		System.out.println(s.contains("Break"));
		System.out.println(s.contains("real"));
		System.out.println(s.contains("fast"));
		
		// Substring() - Returns a Substring from the specified begin index to the specified end index
		
		s = "Information";
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(0, 11));
		System.out.println(s.substring(2, 8));
		
		//Substring() - Returns a substring from the specified index to the end.
		
		System.out.println(s.substring(2));
		
		// To the LowerCase - Converts all characters in the string to lower case
		System.out.println(s.toLowerCase());
		
		// To the UpperCase - Converts all characters in the string to Upper case
				System.out.println(s.toUpperCase());
				
		// trim() - Removes Leading and trailing whitespace from the string
		
		s="    Java    ";
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.trim());
		
		// Replace (char oldChar, char newChar) - Replaces all occurrences of the specified old character with the new one
		
		s = "Java|Selenium|Program";
		System.out.println(s.replace("|", ", "));
		
		// Replaces(CharSequence target, CharSequence replacement) each substring that matches the specified target sequence with the specified replacement sequences
		s = "I like Java, I like Selenium";
		System.out.println(s.replace("like", "love"));
		
		// split - Split the string around matches of the given regular expression.
		String email = "victoireushindi@371gmail.com";
		String emailSplit[] = email.split("@");
		System.out.println(emailSplit[0]);
		System.out.println(emailSplit[1]);
		
		// Split Ex2
		
		String fruits = " Apple, Banana, Mango";
		String []splitFruits = fruits.split(",");
		System.out.println(splitFruits[0]);
		System.out.println(splitFruits[1]);
		System.out.println(splitFruits[2]);
		System.out.println(Arrays.toString(splitFruits));
		
		// Join - Joins the specified elements with the specified delimiter.
		String date[] = {"26", "Mars", "2005"};
		String dataFormat = String.join("-", date);
		System.out.println(dataFormat);
		
		name = "Ushindi Victoire";
		
		System.out.println(name.contains("victoire"));
		System.out.println(name.toLowerCase().contains("victoire"));
		System.out.println(name.replace('V', 'v').contains("victoire"));
		
				
		
	}

}
