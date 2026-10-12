
/**
 * Write a description of class Recursion here.
 * im deadass too tiered to change any of this here
 * @author David
 * @version 1.0
 * i say as i do, uhuh
 * 
 * howerver i am not commenting this code, actually i should, so i can answer the questions,
 * yeah that sounds like a plan
 */
import java.util.Scanner;

public class Recusion {
    //fro loop for
    public static int factorialFor(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }
    
    //While loop for 
    public static int factorialWhile(int n) {
        int result = 1;
        int i = 1;
        
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
    
    //Recursion timeeee
    public static int factorialRecursive(int n) {
        //Base case
        if (n ==0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorialRecursive(n - 1);
    }
    
    // the fucking end with prints and all (RELEASEEEEE MEEEEEEEEEEEEEE PLEASEEEEEEEEE)
    public static int factorialRecursiveDebug(int n) {
        //Base case
        if (n == 0 || n == 1) {
            System.out.println("Base case reached: " + n + "! = 1");
            return 1;
        }
        
        //Recursive case
        System.out.println("Calculating: " + n + " * factorial(" + (n - 1) + ")");
        
        int result = n * factorialRecursiveDebug(n - 1);
        
        System.out.println("Returning: " + n + "! = " + result);
        
        return result;
    }
    
    /*
     * im writing this at 11 pm, which doesnt sound too bad, however i have been up since 5 am, meaning i have
     * been awake for 18 hours, unlike my record of 144 hours, i dont wanna do that shit again, imma finish all
     * this sniz and fucken go to sleep man
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            System.out.println("For loop result: " + factorialFor(n));
            System.out.println("While loop result: " + factorialWhile(n));
            System.out.println("Recursive result: " + factorialRecursive(n));

            System.out.println("\n--- Recursion Steps ---");
            factorialRecursiveDebug(n);
        }
        sc.close();
    }
}