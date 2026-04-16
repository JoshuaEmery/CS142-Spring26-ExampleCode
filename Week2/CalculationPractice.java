public class CalculationPractice {

    public static void main(String[] args) {


		// ============================================================
		// EXERCISE 1 — Temperature Conversion (Fahrenheit to Celsius)
		// ============================================================
		// Formula: celsius = (fahrenheit - 32) * 5 / 9
		// Create a variable to store a temp in fahrenheit, choose any value
		double f = 212.0;
		// Create a variable to store celsius and calculate the value
		//Either the 5 or the 9 must be a double to avoid int division
		double c = (f - 32) * 5 / 9.0; 
		// Output the following
		// fVariable degrees in F is cVariable degrees in C
		//output using concatenation
		System.out.println(f + " degrees in F is " + c + " degrees in C");
		//output using f-strings
		System.out.printf("%f degrees in F is %f degrees in C", f, c);




		// ============================================================
		// EXERCISE 2 — Rectangle Area and Perimeter
		// ============================================================
		// A rectangle has a width and a height.
		// Area = width * height
		// Perimeter = 2 * (width + height)

		// Create variables to store width and height, choose any values
		double width = 100;
		double height = 25;
		// Create a variable for the Area and calculate it
		double area = width * height;
		// Create a variable for the perimeter and calculate it
		double perimeter = 2 * (width + height);
		// Print out the results
		System.out.printf("Width: %f Height: %f Area: %f Perimeter %f", width, height, area, perimeter);
		//Make a new line
		System.out.println();




// ============================================================
		// EXERCISE 3 — Paycheck Calculator
		// ============================================================
		// Given hours worked, an hourly wage, and a tax rate:
		// grossPay = hoursWorked * hourlyRate
		// taxWithheld = grossPay * taxRate
		// netPay = grossPay - taxWithheld
		
		// Create variables for hoursWorked, hourlyRate and taxRate
		// Choose values for them
		double hoursWorked = 40;
		double hourlyRate = 25;
		double taxRate = .12;
		// Create a variable called grossPay and calculate it
		double grossPay = hoursWorked * hourlyRate;
		// Create a variable called taxWithheld and calculate it
		double taxWithheld = grossPay * taxRate;
		// Create a variable called netPay and calculate it
		double netPay = grossPay - taxWithheld;
		// Print out a paycheck stub (hoursWorked, hourlyRate, grossPay
		// , taxWithHeld, netPay)
		System.out.println("==========Paycheck Stub==========");
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Tax Withheld: " + taxWithheld);
		System.out.println("Net Pay: " + netPay);
		// For example 80 hours at $15 / hr = $1200
		// tax rate of 10% = taxWithheld = $120
		// netPay = $1080




        // ============================================================
        // EXERCISE 4 — Area of a Circle
        // ============================================================
        // Formula: area = PI * radius^2
        //   PI is available in Java as Math.PI
        //   To raise a number to a power in Java: Math.pow(base, exponent)
        //   Example: Math.pow(3, 2) gives 9.0

        // Keep in mind that both Math.PI and Math.pow() are doubles

        // Create a variable to store the radius, choose any value


        // Create a variable called area and calculate it


        // Print out the radius and the area
        // For example:
        // A circle with radius 5 has an area of 78.53981633974483




        // ============================================================
        // EXERCISE 5 — Compound Interest
        // ============================================================
        // Formula: A = P * (1 + r/n)^(n*t)
        //   P — principal (starting amount)
        //   r — annual interest rate as a decimal (e.g. 5% = 0.05)
        //   n — number of times interest compounds per year
        //         annually  =  1
        //         monthly   = 12
        //         daily     = 365
        //   t — number of years
        //   A — total amount after interest
        //
        // To raise a number to a power in Java: Math.pow(base, exponent)
        // Example: Math.pow(2, 3) gives 8.0
        // Math.pow gives you a double

        //Create variables for the following and choose values
        //principal, rate, compoundsPerYear, years

        // create a variable called totalAmount and calculate it
        // using the formula above. 
    


        // Create a variable called interest earned and calculate it

        // Print out the starting principal, totalAmount and interestEarned

        // For example:
        // Principal: $1000, Rate: 10% (0.10), compounded annually (n=1), for 1 year
        // A = 1000 * (1 + 0.10/1)^(1*1)
        // A = 1000 * (1.10)^1
        // A = 1000 * 1.10
        // A = $1100.00
        // Total Amount = 1100
        // Interest earned = $1100 - $1000 = $100
        // Starting principal = 1000
     




        // ============================================================
        // EXERCISE 6 — Coin Change (Pennies to Coins)
        // ============================================================
        // Given a total number of pennies, calculate how many of each
        // coin type fit into that amount — use integer division and modulus.
        //
        // Coin values in pennies:
        //   quarter = 25
        //   dime    = 10
        //   nickel  =  5
        //   penny   =  1
        //
        // Strategy: Start with the largest coin and move on down.

        //create a variable for the number of pennies and choose a value


        // Create an int called numQuarters and calculate it 


        // Create an int called numDines and calculate it


        // Create an int called numDimes and calculate it


        // Output The total number of quarters, dimes, nickels and pennies
        // that make up the total starting number

        //For example 87 pennies is 3 Quaters 1 Dime 0 Nickels 2 Pennies


    }//end main

}//end class
