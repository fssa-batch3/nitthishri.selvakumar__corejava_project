package day4.practice;


class RightAngelTringle extends Polygon1 {
	protected double length;
	protected double base;
	protected double hypotenuse;
	
	public RightAngelTringle(double length, double base) throws Exception {
		super(4);
		if(length <= 0 || base <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.base = base;
		this.hypotenuse = hypotenuse;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.base * this.hypotenuse;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	
	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		this.hypotenuse  = Math.round(Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.length, 2)));
		return this.length + this.base + this.hypotenuse ;
	}
}