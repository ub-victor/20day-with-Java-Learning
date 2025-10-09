package day12;

public class PassParamsToMain {

	public static void main(String[] args) {
		 
		for(String s: args) {
			System.out.println(s);
		}
		
		System.out.println("Length of array: "+  args.length);

	}

}

/*
 * To give the main method value, as it declare to have String array
 * 1. Right click then Run Configuration then
 * 2. In the main you check where written Main class, you copy it 
 * 3. search for the main class then okay
 * 4. click of the Arguments
 * 
 * 
 * */
