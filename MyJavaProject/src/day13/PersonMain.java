package day13;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.name = "Victoire";
//		p.age = 20;
		p.setData("Victoire", 20);
		
		p.displayPersonDetails();

	}

}
