package Day7;

import java.util.Arrays;

public class SortingExampleOnArray {

	public static void main(String[] args) {
		int a[] = {20,10,40,50,30};
		
		System.out.println("Before sorting: "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: "+ Arrays.toString(a));
	}

}
