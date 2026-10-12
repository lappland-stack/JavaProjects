
/**
 * here to teach me how exceptions work, im gonna go play minecraft now
 *
 * @author David
 * @version i think 1.0?
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

class ExceptionHandlingStarter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Exception Handling Practical ===");

        // ===============================
        // TASK 1: Division Program
        // ===============================
        System.out.println("\nTASK 1: Division");

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

        }
        catch (ArithmeticException e) {
            System.out.println("Error: cannoot divide by zero.");
            sc.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
            sc.nextLine();
        }

        // ===============================
        // TASK 2: Array Access
        // ===============================
        System.out.println("\nTASK 2: Array Access");

        int[] arr = {10, 20, 30, 40};
        try {
            System.out.print("Enter index (0-3): ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
            sc.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            sc.nextLine();
        }
        // ===============================
        // TASK 3: file not found
        // ===============================
        System.out.println("\nTASK 5: File Handling");

        try {
            FileReader fr = new FileReader("sample.txt");
            System.out.println("File opened successfully");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        finally{
            sc.close();
        }

        sc.close();
    }
}
