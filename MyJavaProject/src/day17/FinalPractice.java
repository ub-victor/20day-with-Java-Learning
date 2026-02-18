package day17;

public class FinalPractice {

	public static void main(String[] args) {
		int a = 40;
		Integer b = a; // autobaxing
		
		int c = b; // Uboxing
		
		Integer z = 20;
		z = 30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(z);
		System.out.println(Integer.compare(100, 20)); // -1 if the 1st < that the 2rd 
		System.out.println(Integer.max(4, 9)); // to check the max 

	}

}