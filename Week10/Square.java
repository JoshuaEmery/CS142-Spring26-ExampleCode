//Square is going to be our base class
public class Square{
	//fields
	private double length;

	public Square(double length) {
		this.length = length;
	}
	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double area() {
		return length * length;
	}
	@Override
	public String toString() {
		return "Square [ length: " + length + " ]";
	}
	
	
	
	
	
}
