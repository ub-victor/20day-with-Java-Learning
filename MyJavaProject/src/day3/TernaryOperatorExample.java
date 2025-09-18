package day3;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		
		// var booleanExpression ? result : result2
		
		int a=10, b=20;
		int result = (a>b)? a:b;
		System.out.println(result);
		
		//eg 2
		int person_age = 19;
		String result2 = (person_age>=18) ? "Eligible for vote" : "Not Eligible";
		System.out.println(result2);
		
		// eg 3
		
//		String result3 = (10==10)? "Correct" : "Incorrect";
//		System.out.println(result3);
		int e = 10, f=10;

		boolean isCorrect = (e == f);
		System.out.println(isCorrect ? "Correct" : "Incorrect");
	}

}
