package day12;

public class PassParamsToMain {

	public static void main(String[] args) {
		 
		for(String s: args) {
			System.out.println(s);
		}
		
		System.out.println("Length of array: "+  args.length);

	}

}
