public class IntroToWhileLoops {

    public static void main(String[] args) {

        // A loop is a code block which runs repeatedly based on a boolean value

        // THE WHILE LOOP
        //   while (condition) {
        //       // code to repeat
        //   }
        //
        // While is a PRE CHECK loop - Checked before the loop starts
        // If the condition is false from the start, the body never runs
        // If the condition never becomes false, you get an infinite loop

        // Three parts of a loop:
        // 1. Initialization  — set up a variable(s) before the loop
        // 2. Condition       — when should the loop continue
        // 3. Update          — chage the variable(s) involed in the condition

        // Example: Count from 1 to 5
        int count = 1;              // 1. Initialization
        while (count <= 5) {        // 2. Condition
            System.out.println("Count: " + count);
            count++;                // 3. Update
        }

        // COUNTING DOWN

        int countdown = 5;
        while (countdown > 0) {
            //order matters, do you print before changing or after?
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // A very common use of loops is building up a total
        // We start with 0 and add to it each iteration
        // Iteration - Cycle of a loop

        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;  //add 1 to total
            i++;
        }
        System.out.println("Sum of 1 through 10: " + sum);  // should be 55

        // Loops can also count how many times something is true
        // We use a counter variable and increment it conditionally

        int number = 1;
        int evenCount = 0;
        while (number <= 20) {
            if (number % 2 == 0) {
                evenCount++;    // only count when the number is even
            }
            number++;
        }
        System.out.println("Even numbers between 1 and 20: " + evenCount);


        //Break and Continue
        //break keyword exists a loop. Think of it as Break Out of the loop
        //continue keyword skips to the next iteration of the loop
        int counter = 1;
        //infinite loop
        while(true){
            if(counter == 2){
                continue;
            }
            if (counter==5){
                break;
            }
            System.out.println("Break - Continue Demo: " + counter);
            counter++;
        }

        // COMMON MISTAKE — INFINITE LOOP
        // If you forget to update your loop variable the condition
        // never becomes false and the loop runs forever.
        // The commented code below would be an infinite loop:
        //
        //   int x = 1;
        //   while (x <= 5) {
        //       System.out.println(x);
        //       // x is never changed — x <= 5 is always true
        //   }


        // COMMON MISTAKE — OFF BY ONE
        // An off-by-one error means your loop runs one too many
        // or one too few times. Check your condition carefully.

        // This prints 1, 2, 3, 4, 5  (correct — 5 iterations)
        int val = 1;
        while (val <= 5) {
            System.out.print(val + " ");
            val++;
        }
        System.out.println();

        // This prints 1, 2, 3, 4  (wrong — only 4 iterations, < vs <=)
        val = 1;
        while (val < 5) {
            System.out.print(val + " ");
            val++;
        }
        System.out.println();


        // =========================
        // STUDENT EXERCISES
        // =========================

        System.out.println("\n--- Exercises ---");

        // Exercise 1: Print Multiples
        // Use a while loop to print every multiple of 3 from 3 to 30
        // Expected output: 3 6 9 12 15 18 21 24 27 30


        // Exercise 2: Sum of Odd Numbers
        // Use a while loop to find the sum of all odd numbers from 1 to 99
        // Print the result


        // Exercise 3: Password Gate
        // Prompt the user to enter a password
        // Keep asking until they enter "cs142"
        // Once they get it right, print "Access granted!"


        // Exercise 4: Multiplication Table
        // Pick any whole number and print its multiplication table from 1 to 10
        // For example, for 7:
        //   7 x 1 = 7
        //   7 x 2 = 14
        //   ...
        //   7 x 10 = 70


        // Exercise 5: Digit Sum
        // Given the number 48362, use a while loop and the modulus operator
        // to find and print the sum of its digits (4 + 8 + 3 + 6 + 2 = 23)
        // Hint: use % 10 to get the last digit and / 10 to remove it
        int digits = 48362;


        // Exercise 6: Collatz Conjecture
        // Pick any positive integer n
        // If n is even: n = n / 2
        // If n is odd:  n = n * 3 + 1
        // Repeat until n equals 1, counting the steps
        // Print each value of n and the total number of steps taken
        // Try starting with n = 27
        int n = 27;


    }//end main

}//end class