package day13;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.setData("Victoire", 20);
//		p.name = "Victoire";
//		p.age = 20;
		
		// to set the name or use the other class variable here we will do this
		p.setName("Victoire");
		p.setAge(25);
		
		Person p1 = new Person();
		
		p1.setName("Placide");
		p1.setAge(10);
		
		
//		p.displayPersonDetails();
//		p1.displayPersonDetails();
		// if you what specific info
		
		//System.out.println(p.getAge());
		//System.out.println(p1.getAge());
		
		System.out.println("Person 1 details: ");
		System.out.println(p.getName());
		System.out.println(p1.getAge());

	}

}
