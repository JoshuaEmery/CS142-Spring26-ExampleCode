public class IntroToLogic {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        //Relational operators. These operators make a comparison between values and
        //evaulate to either true or false
        // == Equality This is not assignment (=)
        // != Not Equal 
        // > Greater than
        // >= GTE
        // < Less than
        // <= LTE

        //using relational operators to create boolean variables
        boolean b1 = x == y;
        boolean b2 = x < y;
        System.out.println("x == y: " + b1);
        System.out.println("x < y: " + b2);
        //it is also possible to embed the boolean expression directly
        System.out.println("x Not Equal y: " + (x != y));

        //if(condition){}
        //If allows for use to create a code block that only runs when the condition is true
        //Should the codition evaluate to false the code block will never run
        if(1 > 0){
            System.out.println("This code block always runs");
        }

        //When an else is attached to an if we get a code block that only runs when the if condition is false
        //This is useful when there are only two possible outcomes.
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        // It is possible to chain another if that will only be evaluated when the previous if failed

        //if(something)
        //else if(somethingElse)-- somethingElse is only checked when something is false
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        //Logical Operators
        //These operations combine multiple boolean statements into one value
        // && : Logical AND - BOTH statements must be true for the combined statement to be true
        // || : Logical OR - BOTH statements must be false for the combined statement to be false

        // T && T = T
        // T && F = F
        // F && F = F
        // T || T = T
        // F || T = T
        // F || F = F

        if(x > 0 && x % 2 == 0){
            System.out.println("X is positive and Even");
        }
        else{
            System.out.println("What do I know here?");
        }

        if(x > 0 || x % 2 == 0){
            System.out.println("X is either positive or Even");
        }
        else{
            System.out.println("What do I know here?");
        }

        // A common use of && is to check if a number is in a range (between 10 - 20)


        //Demorgan 
        //De Morgan's Laws are used when we want to NOT (!) a complex condition
        //Rule: Flip the operator AND negate each part
        // !(A && B)  becomes  !A || !B
        // !(A || B)  becomes  !A && !B
        // In simple terms: NOT of everything together = flip AND/OR and NOT each piece

        if (x > 0 && x < 10) {
            System.out.println("x is between 0 and 10");
        }

        if (x == 5 || y == 5) {
            System.out.println("One of them is 5");
        }

        // Original: NOT (x is zero OR y is zero)
        // Apply De Morgan:
        // !(x == 0 || y == 0)  ->  x != 0 && y != 0
        if (!(x == 0 || y == 0)) {
            System.out.println("Neither x nor y is zero (original)");
        }

        if (x != 0 && y != 0) {
            System.out.println("Neither x nor y is zero (De Morgan)");
        }

        // =========================
        // STUDENT EXERCISES
        // =========================

        System.out.println("\n--- Exercises ---");

        // Exercise 1: Create an age variable and pick a value for it
        // create a check to output you are eligible to vote if the age is >= 18
        // output not able to vote otherwise

        // Exercise 3: Try to predict what the output will be from this. then run it and check to see if you were right
        boolean a = true;
        boolean b = false;
        System.out.println("Ex3: " + (a && b || !b));

        // Exercise 4: Fix the condition so it checks if x is between 1 and 100
        // (currently incorrect)
        if (x > 1 || x < 100) {
            System.out.println("Ex4: x is between 1 and 100 (is this correct?)");
        }

        // Exercise 5: Rewrite using De Morgan’s Law
        // !(x > 0 && y > 0)
        if (!(x > 0 && y > 0)) {
            System.out.println("Ex5: At least one is NOT positive");
        }

        // Exercise 6: Write your own condition below
        // Goal: print "Both even" if BOTH x and y are even

        // TODO: Replace false with your condition
        if (false) {
            System.out.println("Ex6: Both even");
        }
    }
}