import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        //In order to get input from the user we need a scanner object
        Scanner scanner = new Scanner(System.in);

        //Now we need a prompt. A propmpt gives the user instructions and tells them what to do
        System.out.print("Enter some text: ");
        //Scanner.nextLine() is a method that gives us a string
        //String is our first datatype that we will learn about and it is used to store text.
        //In order to create a String variable we type String and then give the variable a name
        String userInput;
        //Once we have a String variable we can assign(store) the return from the nextLine() method in it
        userInput = scanner.nextLine();

        //output you typed and then output userInput
        System.out.print("You typed: ");
        System.out.print(userInput);
        //close the scanner object
        scanner.close();
    }
}

