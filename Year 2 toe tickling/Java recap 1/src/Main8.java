/*
im gonna be honest, this is 2d arrays, pretty cool and all, but man can i not be fucking asked what they do

so user inputs the number of rows and collumns, m and n, the program then generates a 2d array which follows the dimensions
of the input numbers. following a fairly similar principle as the n-th number from high school maths, now we have a finite
set of points, from the user input, the task states i*j, and gives teh example i=0, j=0 => 0*0; i=5, j=3 => 5*3, so what
the task truly needs is every possible (i, j) pair in this finite domain, and evaluate the results and store them at the
position calculated. Also the program could still technically be explained as using the n-th term mathematical idea, just
need 2 n-th terms to give one result, going into 2 dimensions if you may.

this differs from the previous task by essentially needing 2 discrete indexes, here the value is made up of two points
and it turns out learning discrete sturctures last year was perhaps more worth the migraines than i thought


@Author David/Rofflemo
@Version 1.0
 */



import java.util.Scanner;
import java.util.InputMismatchException;

class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m;
        int n;

        // Get the number of rows from the user
        while (true) {
            try {
                System.out.print("Enter the number of rows: ");
                m = sc.nextInt();

                // Make sure the number of rows is not negative
                if (m < 0) {
                    System.out.println("Number of rows cannot be negative. Try again.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter a whole number.");
                sc.next();
            }
        }

        // Get the number of columns from the user
        while (true) {
            try {
                System.out.print("Enter the number of columns: ");
                n = sc.nextInt();

                // Make sure the number of columns is not negative
                if (n < 0) {
                    System.out.println("Number of columns cannot be negative. Try again.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter a whole number.");
                sc.next();
            }
        }

        // Create the two-dimensional array using the user's dimensions
        int[][] array = new int[m][n];

        // Go through every row
        for (int i = 0; i < m; i++) {

            // Go through every column in the current row
            for (int j = 0; j < n; j++) {

                // The value is determined by multiplying the row and column indexes
                array[i][j] = i * j;
            }
        }

        // Display the generated two-dimensional array
        System.out.println("\nGenerated array:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }

            // Move to the next line after finishing a row
            System.out.println();
        }

        sc.close();
    }
}