/*
I am once again reusing previous code and adapting it, YOU CANNOT STOP MEEEEEEE
so only part of the code was reused, had to write new code, i overcomplicated it more it may seem
so, i have truly ovecomplicated this, i used a while loop, that holds a try catch loop that then goes into a for loop
all to let a user input 3 numbers and get the biggest one, solid foundation i shall say

i gotta say, alekirser asmr while coding is a unmathced strat, straigh flow state
@Author David/Rofleemo
@Version 1.0 (maybe i should make one main main class and let it call upon all the task main classes and let you just
use them all in some terminal typa shit)
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

class Main3 {
    public static void main(String[] args) {
        //Scans for user input
        Scanner sc = new Scanner(System.in);
        int lengthArgs = 3; //this ensures the array only holds 3 numbers
        int[] array = new int[lengthArgs];  //initializes the array itself

        boolean validInput = false; //for the try catch to ensure valid numerical input

        while (!validInput) { //uses the above boolean value to keep the try catch loop going until both parameters are met

            System.out.println("Please enter " + lengthArgs + " numbers."); //Asks for user input

            String[] enteredChars = sc.nextLine().trim().split("\\s+"); //Removes possible white space that could throw some fuckass errors

            if (enteredChars.length != lengthArgs) { //ensures only 3 numbers are input into the array
                System.out.println("Please enter exactly 3 numbers.");
                continue;
            }

            try {
                for (int i = 0; i < lengthArgs; i++) {
                    array[i] = Integer.parseInt(enteredChars[i]);

                }
                validInput = true;
            } catch (NumberFormatException e) { //cathches non numerical input
                System.out.println("Please enter numbers only.");
            }

        }
        //where the biggest number is stored
        int biggest = array[0];

        //biggest number is found, called and stored to then be output further in the code
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }

        System.out.println("The biggest number is: " + biggest);//outputs biggest number from user input array

        sc.close();//closes scanner and while loop

    }

}