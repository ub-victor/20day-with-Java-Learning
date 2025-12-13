package day16;

//Abstract class
abstract class Shapes {
 abstract double area();  // abstract method
}

//Subclass 1: Circle
class Circle extends Shapes {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return 3.14 * radius * radius;
 }
}

//Subclass 2: Rectangle
class Rectangle extends Shapes {
 double width;
 double height;

 Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 double area() {
     return width * height;
 }
}
public class MainAbs {

	public static void main(String[] args) {
		
	}
}
