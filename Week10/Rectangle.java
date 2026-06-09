//Rectangle shares the length with square
public class Rectangle extends Square {
	//we do not have to repeate ourselves with the length
	//we only deal with the fields that are NEW to rectangle
	private double width;
	public Rectangle(double length, double width) {
		//pass up the length to the square constructor
		super(length);
		//I handle only the new fields to rectangle
		this.width = width;
	}
	//getters and setter for only the new fields
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	//Area for a rectangle behaves differently
	@Override
	public double area() {
		//I can access the methods in the base class with this
		return this.getLength() * width;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle [length: " + this.getLength() + " width: " + width + " ]";
	}
	
	
	
	
}
