public class ArithmeticOperators {

    public static void main(String[] args) {

        // An operator is a symbol that performs an operation on one or more values
        // Arithmetic operators work on numeric types (int, double, etc.)

        int a = 20;
        int b = 6;


        // BASIC OPERATORS

        // + addition
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // - subtraction
        int difference = a - b;
        System.out.println("a - b = " + difference);

        // * multiplication
        int product = a * b;
        System.out.println("a * b = " + product);

        // / division
        // When you divide two integers you get an integer result
        // the decimal portion is dropped. not rounded
        int quotient = a / b;
        System.out.println("a / b = " + quotient);  // result: 3, not 3.333...

        // % modulus — returns the REMAINDER of division
        // useful for checking even/odd, cycling through values, etc.
        int remainder = a % b;
        System.out.println("a % b = " + remainder);  // 20 / 6 = 3 remainder 2


        // INTEGER vs FLOATING POINT DIVISION

        // if either operand is a double, Java performs floating point division
        double exactQuotient = (double) a / b;  // explicit cast forces decimal division
        System.out.println("a / b (floating point) = " + exactQuotient);

        double x = 20.0;
        double y = 6.0;
        System.out.println("x / y = " + (x / y));


        // ORDER OF OPERATIONS

        // Java follows standard math order of operations (PEMDAS)
        // 1. Parentheses
        // 2. Multiplication, Division, Modulus  (left to right)
        // 3. Addition, Subtraction (Left to right)
        // 4. Assignment goes last    

        int result1 = 2 + 3 * 4;       // multiplication happens first
        System.out.println("2 + 3 * 4 = " + result1);   // 

        int result2 = (2 + 3) * 4;     // parentheses force addition first
        System.out.println("(2 + 3) * 4 = " + result2); // 

        int result3 = 10 - 5 / 2 + 1;  // division first, then left to right
        System.out.println("10 - 5 / 2 + 1 = " + result3); // 


        // UPDATING A VARIABLE USING ITSELF

        // Variables can appear on both sides of the = sign
        // The right side is evaluated first, then the result is stored back into the variable
        // This is how you accumulate, count, or adjust a value over time

        int points = 100;
        System.out.println("start: " + points);

        points = points + 10;   // add 50 to current value of points
        System.out.println("after + 50: " + points);

        points = points * 2;    // double whatever points currently is
        System.out.println("after * 2: " + points);

        points = points / 50;    // division
        System.out.println("after / 50: " + points);


        // COMPOUND ASSIGNMENT OPERATORS

        // shorthand for updating a variable using itself
        // instead of writing: count = count + 1
        // you can write:      count += 1

        int count = 10;
        System.out.println("start: " + count);

        count += 5;   // same as: count = count + 5
        System.out.println("+= 5: " + count);

        count -= 3;   // same as: count = count - 3
        System.out.println("-= 3: " + count);

        count *= 2;   // same as: count = count * 2
        System.out.println("*= 2: " + count);

        count /= 4;   // same as: count = count / 4
        System.out.println("/= 4: " + count);

        count %= 3;   // same as: count = count % 3
        System.out.println("%= 3: " + count);


        // INCREMENT AND DECREMENT OPERATORS

        // ++ adds 1 to a variable
        // -- subtracts 1 from a variable

        int lives = 3;
        System.out.println("lives: " + lives);

        lives++;  // same as: lives = lives + 1
        System.out.println("after ++: " + lives);

        lives--;  // same as: lives = lives - 1
        System.out.println("after --: " + lives);

    }//end main

}//end class
