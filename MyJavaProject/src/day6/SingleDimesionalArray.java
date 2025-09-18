package day6;

public class SingleDimesionalArray {

	public static void main(String[] args) {
		// Method 1
		// Declaration & Instantiation of an array
		int a[] = new int[5];
		
		// Store value into an array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//Method 2
		//int []b = {60,70,80,90,110};
		
		// Find size of an array
		
	//	System.out.println(a.length);
	//	System.out.println(a.length);
		
		// Read single value from an array
		
	//	System.out.println(a[0]);
	//	System.out.println(a);
		
		// Read multiple  value from an array
		/*
		 	Iterates from 0 through a.length - 1 inclusive.
			Runs a.length times.
			Equivalent to iterating over all valid indices of the array; safe for a[index].
		 * */
//		for(int index=0; index < a.length; index++) {
//			System.out.println(a[index]);
//		}
		
		// Enhanced for loop .. for each loop
		// Syntax
		//for(datatype var:array name)
		for(int element:a ) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
