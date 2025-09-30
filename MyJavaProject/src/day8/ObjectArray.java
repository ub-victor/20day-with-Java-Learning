package day8;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		/* In array with Object data type can Store any data type in it */
		Object obj[] = {"Welcome", 10, true,100,19, 'b'}; // This is called Object type array
		System.out.println(Arrays.toString(obj));
		
		for(Object o: obj) {
			System.out.println(o);
		}

	}

}
