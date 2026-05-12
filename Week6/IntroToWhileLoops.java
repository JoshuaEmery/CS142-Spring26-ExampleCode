import java.util.Random;

public class IntroToWhileLoops {

	public static void main(String[] args) {
		// A loop is a code block that runs repeatedly based on a boolean value
		
		//While loop
		// while(condition){
		//  code to repeat
		//}
		
		// while is a pre-check loop - Checks before the loop starts
		// if the condition is false initially it never runs
		// if the condition never becomes false, you have an infinite loop
		
		// three basic parts of a loop
		// Initialization = creating some variable(s) used by the loop
		// Condition = Determines how long our loop runs for
		// Update = Change one or more of the variable(s) involved in the condition
		
		int count = 1;
		while(count <= 5) {
			//do some work
			System.out.println("Count: " + count);
			count++;
		}
		//create a while loop that prints out 10,9,8... 1
		int number = 10;
		while(number >= 1) {
			//do some work
			System.out.println("Counting Down: " + number);
			number--;
		}
		//lets use a while loop to add up all positive numbers 
		//less than equal to 10 1+2+3+4...10
		//STEP 1 create a loop with a variable that starts at 1 and goes to 10
		//and print it out. Once you verify that you have the correct range of values
		//do the calculation.
		int i = 1;
		int total = 0;
		while(i <= 10) {
			//System.out.println("i: " + i);
			//total = total + i;
			total += i;
			i++;
		}
		//When we exit this loop total will be 1+2+3...10
		System.out.println("Total: " + total);
		
		//I want a loop that contains values that vary from [10-20]
		//Add all of the odd numbers between [10and20] to a total
		//Print out all of the even numbers between [10and20]
		int value = 10;
		int oddTotal = 0;
		while(value < 21) {
			//System.out.println("Value: " + value);
			if(value % 2 == 0) {
				System.out.println("Value: " + value);
			}
			else {
				//oddTotal = oddTotal + value
				oddTotal += value;
			}
			value++;
		}
		System.out.println("Odd total: " + oddTotal);
		
		//Break and Continue
		// break keyword immediately exits a loop
		// continue skips to the next iteration
		int counter = 1;
		//infinite loop
		while(true) {
			//when counter gets to 5 we leave
			if(counter == 5) {
				break;
			}
			counter++;
			//if counter is 2 we don't print to the console
			if(counter == 2) {
				continue;
			}
			System.out.println("Break - Continue Demo: " + counter);
		}
		
		//Lets win the powerball 
		//1. Make an instance of the Random class
		Random rand = new Random();
		int myNumber = 5;
		//generate a random number between 1 and 292 million
		int winningNumber = rand.nextInt(292_000_000);
		int ticketsBought = 1;
		while(winningNumber != myNumber) {
			//buy another ticket
			winningNumber = rand.nextInt(292_000_000);
			ticketsBought++;
			//System.out.println("didnt win");
		}
		//If I ever make it down here... I won
		System.out.println("You won.. and you only had to buy " + ticketsBought + " tickets");
		
		
	}

}
