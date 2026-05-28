
public class IntroTo2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A 2d array is a grid and each element has two indices
		// rows and columns
		// Every element is still the same data type
		// the indices are aways ints
		// nameArray[row][column]
		
		//dataType[][] grid = new dataType[rows][columns]
		int[][] grid = new int[3][4];
		
		
	}
	
	//lets make a method that displays a 2d int array
	static void displayGrid(int[][] matrix) {
		//.length gives you the number of rows
		for(int i = 0; i < matrix.length; i++) {
			//if you look at matrix[i].length you get the columns
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
