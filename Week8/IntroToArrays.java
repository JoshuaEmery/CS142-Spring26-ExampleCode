public class IntroToArrays {

    public static void main(String[] args) {

        // An array is a fixed-size, ordered collection of values that are all the same type
        //
        //Every element in an array must be the same data type
        //The length (count, size) of an array is set when it is created and cannot change
        //Elements are accessed using an index (position number)
        //Arrays are (usually) zero-indexed — the first element is at index 0, not 1


        // DECLARING AND CREATING AN ARRAY

        // Syntax: dataType[] arrayName = new dataType[size];
        // This creates an int array with 5 slots, all initialized to 0
        // the first element is at index 0, the last element at index 4
        // the length/size/count is 5
        int[] scores = new int[5];

        // You can also declare and fill the array at the same time using an initializer list
        // The size is determined automatically by the number of values you provide
        int[] grades = {90, 85, 78, 92, 88};

        // String array using an initializer list
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // double array
        double[] prices = {1.99, 4.50, 12.75, 0.89};


        // Elements are accessed by the index

        // Elements are accessed using square brackets and an index number
        // Index starts at 0 for the first element
        // grades[0] is the first element, grades[4] is the last 

        System.out.println("First grade:  " + grades[0]);   // 90
        System.out.println("Second grade: " + grades[1]);   // 85
        System.out.println("Last grade:   " + grades[4]);   // 88
        //You will get an IndexOutOfBounds Exception if yoy attempt to go to an index
        //that doesnt exist
        // 5 does not exist in our grades array
        //System.out.println("Last grade:   " + grades[5]); 
        // -1 also does not exist. -1 is commonly used to indicate that an element is not present in an array
        //System.out.println("Last grade:   " + grades[-1]);

        System.out.println("First day:  " + days[0]);
        System.out.println("Middle day: " + days[2]);


        // MODIFYING ELEMENTS

        // You can change the value at any index using assignment
        scores[0] = 75;
        scores[1] = 88;
        scores[2] = 91;
        scores[3] = 64;
        scores[4] = 100;

        System.out.println("scores[0] after assignment: " + scores[0]);
        System.out.println("scores[4] after assignment: " + scores[4]);

        // You can also update an element using its current value
        scores[0] = scores[0] + 5;   // give index 0 a 5-point bonus
        System.out.println("scores[0] after bonus: " + scores[0]);


        // THE .length PROPERTY

        // Every array has a .length property that tells you how many elements it holds
        System.out.println("Number of grades:  " + grades.length);




        // ITERATING WITH A FOR LOOP

        // A for loop is the most common way to visit every element in an array
        // i stands for index
        // A for loop that goes through an array starting at the beginning
        // for (int i = 0; i < LENGTH; i++)
        // A for loop that goes through an array starting at the end and going backwards
        // for (int i = LENGTH -1; i >= 0; i--)

        System.out.println("\n--- All Grades ---");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("grades[" + i + "] = " + grades[i]);
        }

        // You can also iterate backwards
        System.out.println("\n--- Grades in Reverse ---");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println("grades[" + i + "] = " + grades[i]);
        }


        // ITERATING WITH A FOR-EACH LOOP

        // FOR EACH loop will READ each element. Read access only
        // FOR EACH has no knowledge of an index.

        System.out.println("\n--- Days of the Week ---");
        for (String day : days) {
            System.out.println(day);
        }

        System.out.println("\n--- All Prices ---");
        for (double price : prices) {
            System.out.println("$" + price);
        }



        //Lets create some methods

        //Create a method that takes in a size and returns an int array of SIZE random values between 0-99 (inclusive)

        //Create a method that takes in an int array and prints out the contents of the array including the index

        //Create a method that takes in an int[] and returns the sum of all elements in the array

        //Create a method that takes in an int[] and returns the average value of the element in the array


        //Create a method that takes in an int[] and a searchValue. Return the index of the searchValue IF it exists in the array
        //return -1 if it is not found

        //Create a method that takes in an int[] and returns a new int[] with only the values that are above average in value

        //Create a method that takes in an int[] and returns the LARGEST value in the array

    }
}// end class
