
import java.util.Scanner;  

/** 
 * This program reads a student's marks into an array,  
 * discards the lowest mark, adds up the remaining marks 
 * and displays the average. 
 * It is an exercise in a top-down structured development 
 * of the methods in a program. 
 * Hours wasted: 11
 * Headaches: about 4
 * Migraines: 0 (for now) - 9:40 13/02 | make that 1 migraine
 */  
public class Marks  
{  

    /** 
     * The launch method 
     * 
     * @param  args   Command line parameters - not used 
     */  
    public static void main(String[] args)  
    { // Step 1 - Break down the problem into subtasks  
        int numberOfMarks = readInteger("How many marks?");  
        int[] marks = new int[numberOfMarks];  
        readMarks(marks);  
        discardLowestMark(marks);  
        double average = averageTheMarksExceptTheLastOne(marks);  
        System.out.println("The average mark is " + average);  
    }  

    /** 
     * Repeatedly read integers from the user,  
     * to fill all elements of the given marks array 
     * @param marks    An array of marks to be filled up 
     */  
    private static void readMarks(int[] marks)  
    { // Step 1 - outline of subtask as a method  

        for (int i = 0; i < marks.length; i++)
        {
            int mark = readInteger("Enter your marks.");
            marks[i] = mark;
        }

    }  
    // More methods need adding...  
    
    //this section discards the lowest mzrks from the user input array
    private static void discardLowestMark(int[] marks)
    {
        int position = findLowestMark(marks);
        removeMark(position, marks);

        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

    }
    
    //and this section is how the code finds the lowest mark so it can remove it
    private static int findLowestMark(int[] marks)
    {
        int lowest = 0;

        for(int i = 1; i < marks.length; i++)
        {
            if (marks[i] < marks[lowest])
            {
                lowest = i;
            }
        }

        System.out.println(lowest);
        return lowest;

    }
    
    //and this ultimately removes them
    private static void removeMark(int position, int[] marks)
    {
        for (int i = position; i < marks.length - 1; i++)
        {
            marks[i] = marks[i+1];
        }
    }

    //this section gets the marks average
    private static int averageTheMarksExceptTheLastOne(int[] marks)
    {
        int total = 0;
        int average = 0;
        int currentSize = marks.length - 1;
        for (int i = 0; i < marks.length - 1; i++)
        {
            total += marks[i];
        }

        average = total/currentSize;
        return average;
    }

    /** 
     * A standard method: 
     * 
     * Display the prompt and then read lines repeatedly 
     * until a valid integer is found, and return it. 
     * 
     * @param prompt   The prompt to be displayed 
     * @result         A valid integer 
     */  
    private static int readInteger(String prompt)  
    {  
        Scanner scan = new Scanner(System.in);  
        System.out.println(prompt);  
        while (!scan.hasNextInt()) // while non-integers are present...  
        {  
            scan.next();           //...read and discard input, then prompt again  
            System.out.println("Bad input. Please enter an integer");  
        }  
        int input = scan.nextInt();  
        return input;  
    }  

}  