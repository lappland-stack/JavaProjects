/*
So, i need this to take a digit, stored as m, then generate an array, that is that digit m, in size i mean, and pulling maths here, the i-th position
pretty much refers to the n-th number in highschool math, where you had to do those fuckass calculations to find the n-th value and what the array was,
although not called an array, and example would be something like 2n, which in java would translate to i = 0; i < arrayLength; i++ and array[i] = 2 * i,
unless i misunderstood the gyst of it, which im pretty sure i didnt, but as alwyas IT KEEPS COMING BATH TO MATHS

@Author David/Rofleemo
@Version 1.0
 */


import java.util.Scanner;
import java.util.InputMismatchException;

class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m;

        // Keep asking until the user provides a valid positive integer, just like all the rest
        while (true) {
            try {
                System.out.print("Enter the size of the array: ");
                m = sc.nextInt();

                // An array cannot have a negative size. Duh
                if (m < 0) {
                    System.out.println("Array size cannot be negative. Try again.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter a whole number.");
                sc.next();
            }
        }

        // Create an array with the size specified by the user
        int[] array = new int[m];

        // Fill each position with 2 * i
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i;
        }

        // Display the generated array
        System.out.println("Generated array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + ": " + array[i]);
        }

        sc.close();
    }
}