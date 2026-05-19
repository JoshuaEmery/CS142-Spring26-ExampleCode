
public class IntroToNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIandJ();
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

}
