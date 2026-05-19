
public class IntroToNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIandJ();
		printStars(10, 5);
	}
	static void printIandJ() {
		//when one loop is nested within another
		//the inner loops runs in its entirety for each
		//iteration of the outer loop
		System.out.println("Print I and J Example");
		//outer loop
		for(int i = 0; i < 5; i++) {
			//inner loop runs 5 * 3 times
			for(int j = 0; j < 3; j++) {
				//inner loop does the work
				System.out.print("[i: " + i + ", j: " + j + "], ");
			}
			//the outer loop moves to a new line
			System.out.println();
		}
	}
	//take in parameters for rows and cols
	//change printing of the shape based on rows and cols
	static void printStars(int rows, int cols) {
		System.out.println("Print stars example");
		//outer loop - constrains the number of rows
		for(int i = 0; i < rows; i++) {
			//inner loop - the number of columns
			for(int j = 0; j < cols; j++) {
				//inner loop does the work
				System.out.print("* ");
			}
			//the outer loop moves to a new line
			System.out.println();
		}
	}

}
