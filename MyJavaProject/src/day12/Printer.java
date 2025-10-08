package day12;

public class Printer {
	
	void print(String document) {
		
		System.out.println("Printing String document: "+ document);
		
	}
	
	
	// Method to print a Integer (for ex: document ID)
	void print(int document) {
			
			System.out.println("Printing String document: "+ document);
			
		}// Method to print a double (for ex: price)
	void print(double document) {
		
		System.out.println("Printing String document: "+ document);
		
	}
	
		

	
	
	public static void main(String[] args) {
		
		Printer p = new Printer();
		

	}

}
