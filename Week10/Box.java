
public class Box extends Rectangle {
	// we handle the fields that are new to Box
	private double height;

	public Box(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	// getters and setters for the new field
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// New method called volume
	public double volume() {
		return this.getLength() * this.getWidth() * height;
	}

	// surface area
	@Override
	public double area() {
		//You can integrate the base method in your override
		return 2 * (this.getLength() * this.getWidth() + 
				this.getLength() * height + 
				this.getWidth() * height);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
