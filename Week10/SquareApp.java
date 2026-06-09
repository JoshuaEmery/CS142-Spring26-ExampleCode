
public class SquareApp {

	public static void main(String[] args) {
		//If I make a collection of the base class
		//I can add all of these shapes to it
		//creating an array of the base class
		Square[] squares = new Square[3];
		Square sq = new Square(5);
		Rectangle rect = new Rectangle(10, 3);
		Box box = new Box(2, 5, 4);
		squares[0] = sq;
		squares[1] = rect;
		squares[2] = box;
		displaySquares(squares);
	}
	//lets make a displaymethod that takes an array of squares
	static void displaySquares(Square[] squares) {
		//for each loop to go through squares
		System.out.println("---Displaying Squares---");
		for(Square sq : squares) {
			System.out.println("Length: " + sq.getLength());
			System.out.println("Area: " + sq.area());
			//IF I want to be able to access the Child class methods
			//I need to check first
			//lets check if sq is a rectangle
			if(sq instanceof Rectangle) {
				//Inside here we know sq is a rectangle
				//I need to cast it
				Rectangle rect = (Rectangle)sq;
				System.out.println("Rectangles have a width : " + rect.getWidth());
			}
		}
	}

}
