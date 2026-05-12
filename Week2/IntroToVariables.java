public class IntroToVariables {

    // Entry point — Java always starts here
    public static void main(String[] args) {

        // A variable is a named memory location holds a value
        // Java is a strongly typed language — every variable must have a declared type
        // There are two steps to using a variable:
        // 1. Declaration  = giving the variable a name and data type
        // 2. Assignment   = storing a value in the variable
        // Variables can be assigned any number of times but declared only once
        // in Java variable names are camelCase - first letter lowerCase, letters
        // of subsequent words uppper case
        int x = 50;
        //compile error - We already gave x a data type.
        //int x = 100;
        x = 100;


        // WHOLE NUMBER TYPES

        // byte — 8 bit whole number type from -128 to 127
        // useful when you want to save memory and your number stays small
        byte studentGrade = 95;
        System.out.println("byte:  " + studentGrade);

        // short — 16 bit whole number type from -32,768 to 32,767
        short daysInHistory = 30000;
        System.out.println("short: " + daysInHistory);

        // int — 32 bit whole number type
        // range: about -2 billion to 2 billion
        int age = 21;
        int score = 1000000;
        System.out.println("int:   " + age);
        System.out.println("int:   " + score);

        // long — for very large whole numbers (add an L at the end of the value)
        // range: about -9 quintillion to 9 quintillion
        long worldPopulation = 8100000000L;
        System.out.println("long:  " + worldPopulation);

        //compile error: mismatched data types
        //long value1 = 3.5;
        //int value2 = "Hello";



        // FLOATING POINT TYPES (numbers with decimals)
        // Floating point numbers are fundamentally different than whole numbers
        // They do not have an exact range
        // They will round to make a number fit
        // Their capacity is measured in significant digits.

        // double — the most common decimal type, high precision
        // range: up to ~15 significant decimal digits
        double gpa = 3.85;
        double price = 19.99;
        System.out.println("double: " + gpa);
        System.out.println("double: " + price);

        

        // float — less precision than double (add an F at the end of the value)
        // range: up to ~7 significant decimal digits
        float temperature = 98.6F;
        System.out.println("float:  " + temperature);
        //Unlike whole number data types, floating point data types will
        //round a number to make it fit.
        float nationalDebt = 40_000_000_000_000F;
        System.out.println("Debt as a float: " + nationalDebt);

        // NOTE: prefer double over float in most situations
        // Java defaults to double for decimal literals


        // STRING

        // String — stores text (a sequence of characters)
        // String is not a primitive type — it is a class (notice the capital S)
        // Text values must be wrapped in double quotes
        String firstName = "Alice";
        //When we add strings, we do not perform math. We get Concatenation
        String greeting = "Hello, " + firstName + "!";
        System.out.println("String: " + greeting);

        // Strings can also be declared and assigned separately
        String school;
        school = "Tacoma Community College";
        System.out.println("String: " + school);


        // CHAR

        // char — stores a single character
        // char values must be wrapped in single quotes (not double quotes)
        char initial = 'A';
        char symbol = '$';
        System.out.println("char: " + initial);
        System.out.println("char: " + symbol);


        // BOOLEAN

        // boolean — stores only two possible values: true or false
        // very useful for decisions and conditions (covered more in future weeks)
        boolean isEnrolled = true;
        boolean isPassing = false;
        System.out.println("boolean: " + isEnrolled);
        System.out.println("boolean: " + isPassing);

        // CASTING — Implicit and Explicit

        // Casting is converting a value from one data type to another SIMILAR type

        // Implicit Casting (Widening) — Java does this automatically
        // Safe to do because we are going from a smaller type to a larger type
        // No data is lost
        // byte -> short -> int -> long -> float -> double
        int myInt = 42;
        double myDouble = myInt; //automatically converts the type to double
        long bigInt = myInt;  //long can easily story an int, automatic

        long myLong = 100L;
        double myDouble2 = myLong;  // long is widened to double automatically
        System.out.println("double (implicit cast from long): " + myDouble2);

        // Explicit Casting (Narrowing) — you must do this manually
        // Needed when going from a larger type to a smaller type
        // Data CAN be lost — Java forces you to acknowledge that risk
        // Syntax: put the target type in parentheses before the value
        double pi = 3.14159;
        int piAsInt = (int) pi;  // decimal portion is truncated, not rounded
        System.out.println("double: " + pi);
        System.out.println("int (explicit cast from double): " + piAsInt);

        double bigNumber = 9999999999.99;
        int smallBox = (int) bigNumber;  // value is too large — result will overflow
        System.out.println("double: " + bigNumber);
        System.out.println("int (overflow from explicit cast): " + smallBox);

    }//end main

}//end class
