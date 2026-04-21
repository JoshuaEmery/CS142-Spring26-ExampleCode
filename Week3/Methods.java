public class Methods {

	
	public static void main(String[] args) {
		
		//Methods we have been calling so far
		//Void methods
		//sysout takes a string as a argument and returns nothing
		//calling sysout
		//System.out.println(String input)
		
		//methods with returns - we have used
		//Math.pow takes a double base and a double exp and returns a double
		//Math.pow(base, exp)
		//calling Math.pow and capturing the return in a variable
		//double area = Math.Pow(length, 2);
		//Math library
		//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
	
		//math.sqrt()
		//math.floor()
		//math.ceil()
		
		
		// Calling a void method
		printGreeting();

		// calling a void method that takes an argument
		int y = 25;
		displayNumber(y);

		// calling a method with a return type
		// capture the return in a variable
		// the variable we use to capture the return MUST MATCH the return type
		// of the method
		// When a method is done running all that remains is the return
		int sum = sum(10, 20);
		System.out.println("10 + 20 = " + sum);

		// A method should EITHER DISPLAY OR RETURN
		// not both
		// If a method returns then the display is back in main
		int area = getRectangleArea(5, 3);
		System.out.println("Area of 5x3 rectangle: " + area);

		// using the return value directly
		System.out.println("Area of 10x4 rectangle: " + getRectangleArea(10, sum(2, 2)));

		// double return type
		double circleArea = getCircleArea(7.0);
		System.out.println("Area of circle with radius 7: " + circleArea);

		// boolean return type
		boolean adult = isAdult(20);
		System.out.println("Is 20 an adult? " + adult);
		System.out.println("Is 15 an adult? " + isAdult(15));

		// argument order matters — matched left to right
		double result = doubleDivide(10, 3);
		System.out.println("10 / 3 = " + result);

		double flipped = doubleDivide(2, 10);
		System.out.println("3 / 10 = " + flipped);

		// you can also pass variables as arguments
		int hoursWorked = 40;
		double hourlyRate = 18.50;
		double grossPay = calculatePay(hoursWorked, hourlyRate);
		System.out.println("Gross pay: $" + grossPay);

		// EXERCISE 1 — Celsius to Fahrenheit
		// Write a method called toFahrenheit
		// param: celsius
		// returns: double
		// formula: fahrenheit = (celsius * 9 / 5) + 32
		// Call toFahrenheit(100) from main
		// The display is done in main because we returned

		// EXERCISE 2 — Max of Two Numbers
		// Write a method called max
		// params: a, b
		// returns: whichever is larger

		// EXERCISE 3 — Display Min of Two Numbers
		// Write a method called displayMin
		// params: a, b
		// display to the console "The smaller number is " + value

		// EXERCISE 4 — Greeting Generator
		// Write a method called buildGreeting
		// param: name
		// returns: "Hello, " + name + "! Welcome to CS142."
		// Call it with your name and print the result

		// EXERCISE 5 — Hypotenuse
		// Write a method called hypotenuse
		// params: two non hypotenuse sides of a right triangle
		// returns: double — length of the hypotenuse
		// formula: c = sqrt(a^2 + b^2)
		// hint: Math.sqrt() and Math.pow()
		// hypotenuse(3, 4) should give 5.0

		// Exercise 6 -
		// Write a method that displays a paycheck stub to the console
		// params: hoursWorkd, payRate, taxRate
		// calculate netPay, taxAmount and grossPay
		// Display: hoursWorked, payRate, taxRate, netPay, taxAmount, grossPay

	}// end main

	// Every method has a return type before its name
	// It tells Java what kind of value the method sends back
	// void — sends nothing back
	// int — whole number
	// double — decimal number
	// boolean — true or false
	// String — text

	// void — no return value, just prints
	// void is commonly used to display output
	static void printGreeting() {
		System.out.println("Welcome to the Methods demo!");
	}

	// methods can take in arguments
	// arguments are containers for values to be passed to
	// the datatype of the value MUST MATCH the data type of the parameters
	static void displayNumber(int x) {
		System.out.println("The number is " + x);
	}

	// returns the sum of two ints
	// order matters, the first value provided goes to param1 second to param2
	static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	// returns the area of a rectangle
	static int getRectangleArea(int width, int height) {
		int area = width * height;
		return area;
	}

	// returns the area of a circle
	static double getCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	// returns true if age is 18 or older
	static boolean isAdult(int age) {
		return age >= 18;
	}

	// method that takes two integers and does real division with them
	static double doubleDivide(int numerator, int denominator) {
		return (double) numerator / denominator;
	}

	// returns gross pay
	static double calculatePay(double hours, double rate) {
		return hours * rate;
	}

}// end class
