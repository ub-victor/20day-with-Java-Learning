package day12;

public class Box {

		double length, breadth, height;
		
		Box(){ /// Construction is used to initialize the class variables
		/*	length = 0;
			breadth=0;
			height = 0;
			
		*/
			length = breadth =  height = 0;
		}
		
		Box(double l, double b, double h){
			length = l;
			breadth = b;
			height = h;
		}
		
		Box(double l){
			length = breadth =  height = 0;
		}

}
