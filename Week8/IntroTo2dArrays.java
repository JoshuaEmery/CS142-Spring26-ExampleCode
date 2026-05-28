
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
		grid[0][1] = 10;
		grid[1][1] = 20;
		displayGrid(grid);
		//If the values for your array are known
		int[][] grid2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		displayGrid(grid2);
		
		
	}
	
	//lets make a method that displays a 2d int array
	static void displayGrid(int[][] matrix) {
		//.length gives you the number of rows
		for(int i = 0; i < matrix.length; i++) {
			//if you look at matrix[i].length you get the columns
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//lets make a method that takes in rows and columns and returns
	//a 2d array with random numbers from 0-99
	
	//create a method that takes in a 2d int array and returns the sum
	//of all elements in the array
	
	//Extra Credit Problems
	//1. create a method that takes a 2d int array and returns a single dimension
	//int array where each element is the sum of all elements in the 
	//corresponding column
	
	//for example
	/*
	 * Input
	 * 1, 4, 5
	 * 2, 10, 6
	 * 3, 5, 7
	 * 
	 * 1 + 2 + 3 = 6
	 * 4 + 10 + 5 = 19
	 * 5 + 6 + 7 = 18
	 * output: [6, 19, 18]
	 */
		//Extra Credit Problems
		//2. create a method that takes a 2d char array representing a tic tac toe board
		//return true if the board contains a winner false if it does not
		//either 'X' or 'O' could win.
	/*
	 * 'X', 'O', ''
	 * '', 'X', '0' 
	 * '', '',  'X' 
	 * 
	 * If you want even more extra credit, research how to throw an exception
	 * and throw and exception if the tic tac toe board is in an invalid state
	 * The count of any given character should always be within one of the 
	 * count of the other character... Both characters cannot win
	 */
	

}
