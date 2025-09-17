package day4;

public class SwitchExample {

	public static void main(String[] args) {
	
		int day = 30;
		
		switch (day)
		{
			// Without the break it cause what known as fall-through
			// Expression evaluate to byte, short, char, ...
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wenersday");break;
			case 5: System.out.println("Thursday");break;
			default : System.out.println("Invalid week number input");
		
		}

	}

}
