/*
So this time im meant to do odd or even checks, time to cannibalise old working code, no i am not explaining it all
again

@Author David/Rofleemo (one and teh same oerson please i aint letting anyone do this for me)
@version 1.0 (i will not update the previous program to be 1.0
 */

import java.util.Scanner;
import java.util.InputMismatchException;

class Main2 {
    public static void main (String[] args){
        //Scans for user input
        Scanner sc = new Scanner(System.in);

        //where number is called, stored actually
        double number1;


        //Here we use a try catch loop to give the code some decent input validation as the task specifies floating point data type
        while (true) {
            try {
                System.out.print("Enter your number: ");
                number1 = sc.nextDouble();

                break; //this is here so it leaves the while and try catch loop when input is valid

            } catch (InputMismatchException e) {
                System.out.println("Error: not a number, try again.");
                sc.next();
            }
        }


        //This is where the numbers is odded or evened (dw about it)
        if (number1 % 2 == 0) { //% is the modulus operator, calculates the remainder of a division, so if it equals 0, number divided by 2 properly
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }

        sc.close();


    }

} //yes all of this is copied and pasted from the previous task, all i did was change it for the new task, no you cannot stop me
