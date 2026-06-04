import java.util.Scanner;

public class AppTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5.0, 2);
		//calling an instanced method
		String quad = p1.quadrant();
		System.out.println("P1 lies in " + quad);
		Point p2 = new Point(-5, 10);
		double temp = p2.getX();
		temp = 100;
		//Static methods are called on the class ITSELF 
		double distance = Point.distanceBetweenPoints(p1, p2);
		System.out.println("Distance: " + distance);
		
		//How to get input from a user and repeat the process if
		//they do not follow instructions
		//lets say we want to get X and Y from the user and make a new
		//instance of point
		//to get input from the console we need a scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a value for x");
		//use scanner to get a string from the user
		String inputX = scanner.nextLine();
		//parse this to whatever number type you need
		Double x = tryParseDouble(inputX);
		while(x == null) {
			System.out.println("You messed up! Do better!");
			System.out.println("Please enter a value for x");
			inputX = scanner.nextLine();
			x = tryParseDouble(inputX);
		}
		System.out.println("Please enter a value for y");
		//use scanner to get a string from the user
		String inputY = scanner.nextLine();
		//parse this to whatever number type you need
		Double y = tryParseDouble(inputY);
		while(y == null) {
			System.out.println("You messed up! Do better!");
			System.out.println("Please enter a value for y");
			inputY = scanner.nextLine();
			y = tryParseDouble(inputY);
		}
		//Down here what do I know?
		Point p3 = new Point(x, y);
		//println looks inside of the variable for a method called toString()
		System.out.println(p3);
		//Lets make a line
		Line line = new Line(p1, p2);
		Line line2 = new Line(p1, p2);
		//if you change a ref variable it is changed FOREVER
		//Point linePoint1 = line.getP1();
		//linePoint1 = new Point(100,100);
		System.out.println(line);
		//This calls the .equals method
		Point3d p3d = new Point3d(-5, 4, 10);

	}
	static Double tryParseDouble(String input) {
		//code that might cause an exception is run inside of
		//a try catch
		try {
			Double x = Double.parseDouble(input);
			//if an exception is raised we IMMEDIATELY exit the try block
			return x;
		}
		catch(Exception ex) {
			return null;
		}	
	}
}
