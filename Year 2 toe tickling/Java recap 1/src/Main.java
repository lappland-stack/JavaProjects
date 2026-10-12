/*
in my humblest of defense, simple was not defined in the PDF, sooooooo imma just call this
elegant instead, might as well show off, plus I cannot lie i find this fun

anyway quick rundown of whats happening for my own peace of mind, first the code imports the scanner utility and the input mismatch utility,
then it creates the class Main (or more like initializes the existing file name), then the scanner itself is set to listen for user input,
then the 2 numbers are initialized to be called upon later in the code, after this a while loop is used to hold the try catch statement
that validates all user input is in fact doubles and nothing else, so the code doesnt break or anything, the trey catch block calls upon the
input mismatch exception utility to be able to actually tell when input mismatches the scanner set to nextDouble, rather than nextLine, which
would allow all types of input, and would deadass make the whole while and try catch block useless, and finally after the try catch point breaks
after good input being confirmed a if-else statement is used to decide whether the numbers are equal or nah, and sc closes the scanner, which also finished
the while loop.

@author David (maybe i should use my internet name)
@version 0.1
 */

//where the imported java utils are (I swear if industry doesn't use imports I'm gonna flip, backflip specifically)

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Scans for user input
        Scanner sc = new Scanner(System.in);

        //where numbers are called, stored actually
        double number1;
        double number2;

        //Here we use a try catch loop to give the code some decent input validation as the task specifies floating point data type
        while (true) {
            try {
                System.out.print("Enter first decimal number: ");
                number1 = sc.nextDouble();

                System.out.print("Enter second decimal number:  ");
                number2 = sc.nextDouble();

                break; //this is here so it leaves the while and try catch loop when input is valid

            } catch (InputMismatchException e) {
                System.out.println("Error: not a decimal, try again.");
                sc.next();
            }
        }


        //This is where both numbers are compared
        if (number1 == number2) {
            System.out.println("The numbers are equal");

        } else {
            System.out.println("Numbers do not match");
        }

        sc.close();

    }

}
