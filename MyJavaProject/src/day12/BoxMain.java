package day12;

public class BoxMain {

	public static void main(String[] args) {
		
		Box b = new Box();
		
		
		Box bo = new Box(15.5, 8.6, 5.4);
		
		Box cube = new Box(3);
		
		
		
		System.out.println(b.volume());
		System.out.println(bo.volume());
		System.out.println(cube.volume());

	}

}
