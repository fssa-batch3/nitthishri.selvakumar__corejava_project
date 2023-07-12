package day5.misc;

interface Shape {
	public  void draw();
}

class Rectangle2 implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		Shape rec = new Rectangle2();
		Shape square = new Square();
		rec.draw();
		square.draw();
	}
}
