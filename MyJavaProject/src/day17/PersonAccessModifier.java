package day17;

public class PersonAccessModifier {
	
	public String name = "Ushindi Bihame Victoire";
	private int age= 21;
	
	public static void showAge(){ // 
		System.out.println(getAge(10));
	}

	public static void main(String[] args) {
		showAge();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
