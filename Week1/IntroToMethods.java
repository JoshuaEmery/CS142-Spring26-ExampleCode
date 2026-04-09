public class IntroToMethods {

    // Entry point — Java always starts here
    public static void main(String[] args) {
        methodOne();
    }

    // methodOne calls methodTwo
    //A Method is a named Code block that can be called any
    //number of times.
    //There are two distinct steps associated with methods
    //1. Declaration = Creating the method
    //2. Calling = Using the method
    //A method is declared only once but can be called any number of times
    static void methodOne() {
        System.out.println("Inside methodOne");
        methodTwo();
    }

    // methods can in turn call other methods
    // methodTwo calls methodThree and methodFour
    static void methodTwo() {
        System.out.println("Inside methodTwo");
        //The order of the method calls matters
        methodThree();
        methodFour();
    }

    // methodThree does its thing and returns normally
    static void methodThree() {
        System.out.println("Inside methodThree");
    }

    // return is a keyword that will immediately exit a method
    // no code in a method that is below a return will execute
    static void methodFour() {
        System.out.println("Inside methodFour — before return");

        return;  // execution stops here and jumps back to the caller

        // nothing below this line will ever run
        //System.out.println("This line is unreachable");
    }

}
