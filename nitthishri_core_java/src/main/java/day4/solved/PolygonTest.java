package day4.solved;


abstract class Polygon {
	
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
}


 class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length; 
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}

public class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		try {
			
			rec = new Rectangle (10, 5);
			System.out.println(rec.calculateArea());
			
//			RightAngledTriangle ratt = new RightAngledTriangle(20.0, 10.0);
//			ratt.calculateArea();
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}