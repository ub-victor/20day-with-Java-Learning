package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// String - cannot change
		
	/*	String str = "Hello";
		// str = "Java"; // Changes reference but Hello still there in the string pool
		String str1 = str.concat(" World!");
		str.concat(" Hello");
		
		System.out.println(str1);
		System.out.println(str); */
		
		// StringBuffer - Is Mutable - it Can be change
		
		StringBuffer strBuff = new StringBuffer("Hello");
		strBuff.append(", World");
		
		System.out.println(strBuff);
		
		System.out.println();
		
		//eg:
		
		StringBuffer strBuff1 = new StringBuffer("Hello");
		StringBuffer strBuff2 = strBuff1.append(", World");
		
		System.out.println(strBuff1);
		System.out.println(strBuff2);
		
		System.out.println();
		
		StringBuilder strBuild1 = new StringBuilder("Hello");
		StringBuilder strBuild2 = strBuild1.append(", World");
		
		System.out.println(strBuild1);
		System.out.println(strBuild2);
			
	}

}
