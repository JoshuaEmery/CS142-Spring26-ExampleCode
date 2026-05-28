
public class IntroToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//An array is a fixed size, ordered collection of values of same type
		
		//In JAVA every element MUST BE THE SAME TYPE
		//The length (size, count) of an array is set when created and cannot change
		//Elements are the values in the array
		//Elements are accessed by the index
		//Arrays are zero-indexed (usually) meaning that first element is at index 0
		//The last element is at index length - 1
		
		//Creating an array
		// dataType[] arrayName = new dataType[SIZE];
		
		int[] scores = new int[5];
		
		//You can also create an array AND assign values to the elements at the same
		//time
		int[] grades = {90, 85, 70, 98, 76};
		
		//String array - Days of the week
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
				"Friday", "Saturday"};
		
		//Elements are accessed by index
		//nameOfArray[index]
		System.out.println("First Grade: " + grades[0]);
		System.out.println("Last Grade: " + grades[4]);
		//we can change the elements
		grades[4] = grades[4] + 10;
		System.out.println("Last Grade: " + grades[4]);
		
		System.out.println(days[3]);
		
		//Almost all of the time when you interact with an array
		//You are going to need the arrays BFF - For loop
		//We use i as the default variable in for loop
		//because i stands for index
		//for loop that goes through an array (from beginning)
		//for(int i = 0; i < array.length; i++)
		//a for loop that starts at the end of the array and works
		//backwards to the front
		for(int i = grades.length - 1; i >= 0; i--) {
			System.out.println("Index: " + i + " Element: " + grades[i]);
		}
		//iterating through a loop - going through a array with a loop
		//For Each Loop
		//Read only. You can change elements, No knowledge of an index
		System.out.println("For Each Loop");
		// for (dataType varName : array)
		for (String day : days) {
			System.out.println(day);
		}
		for(int i = grades.length - 1; i >= 0; i--) {
			System.out.println("Index: " + i + " Element: " + grades[i]);
		}
		//lets make some methods
		//I want a method that takes in a size and returns int array
		//with size random numbers between 0 - 99 inclusive		
		int[] numbers = randomNumbers(10);
		int[] numbers2 = randomNumbers(10);
		//I want a method that takes in an int array and prints
		//out each element and its index
		System.out.println("Random Arrays");
		System.out.println("Array 1");
		displayArray(numbers);
		System.out.println("Array 2");
		displayArray(numbers2);
		
        //1. Create a method that takes in an int[] and 
		//returns the sum of all elements in the array

        //2. Create a method that takes in an int[] and 
		//returns the average value of the element in the array


        //3. Create a method that takes in an int[] and a searchValue. 
		//Return the index of the searchValue IF it exists in the array
        //return -1 if it is not found

        //4. Create a method that takes in an int[] and 
		//returns a new int[] with only the values that are above average in value

        //5. Create a method that takes in an int[] and 
		//returns the LARGEST value in the array
		
	}
	
	//calculate the average value of elements in an int[]
	static double calcAverage(int[] numbers) {
		int sum = sumElements(numbers);
		return sum / numbers.length;
	}
	
	//sum all elements in array
	static int sumElements(int[] numbers) {
		//variable to track the total
		int total = 0;
		//for loop to access the elements
		for (int i = 0; i < numbers.length; i++) {
			//add each element to total
			total = total + numbers[i];
		}
		//when we exit the loop the total has been calculated
		return total;
	}
	
	static int[] randomNumbers(int size) {
		//create a new empty array with size length
		int[] result = new int[size];
		//go through result and fill with random numbers
		for (int i = 0; i < result.length; i++) {
			//assign a random number to each index in array
			result[i] = (int)(Math.random() * 100);
		}
		return result;
	}
	static void displayArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			//when you are inside of a for loop
			//i is the index
			//array[i] is the element
			System.out.println("Index: " + i + " Element: " + numbers[i]);
		}
	}
	

}
