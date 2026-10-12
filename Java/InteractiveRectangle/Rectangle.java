import java.util.Scanner;

/**
 * This here code is aimed to allow the calculation of the area and 
 * perimiter of a rectangle, even if in 
 * hindsigth it would be easier to just grab pen and paper 
 * and actually calculate it yourself
 *
 * @author (Why do you wanna know?)
 * @version (1.0-there will be no further updates or any kind of support)
 */
public class Rectangle
{
    public static void main(String[] args)
    {
        /**this entire section is where the methods bellow are called essentailly, aldough it seems temporary
         * im not getting paid enough to care tbh
         */

        
        
        
        
        

        
    }
    
    /**
     * Apparently you want me to comment
     * 
     * Returns the area of a rectangle
     * 
     * @param height the height of the rectangle
     * 
     * @param width the width of the rectangle
     */
    public static int area (int height, int width)
    {
        return height * width;
    }
    
    /**
     * heres the other comment
     * 
     * Returns the perimieter of a rectangle
     * 
     * @param height the height of the rectangle
     * 
     * @param width the width of a rectangle
     * 
     * i just realised this sounds like chatgpt wrote it, i swear to whatever is holy this is all 
     * human written 😭😭😭😭😭😭😭😭😭
     */

    public static int perimeter (int height, int width)
    {
        return height * 2 + width * 2;
    }

    /**
     * i may not be doing checkpoint 6 atp ngl, dont quote me on that tho cuz i 
     * may change my mind in the span of the next 45 minutes as of 19:24 on 03/12/25
     * 
     * Read the integer and return its value
     * 
     * @param the prompt to be shown to the user
     * 
     */
    public static void printRectangleDetails (int height, int width)
    {
        int areaResult = area(height, width);
        int perimeterResult = perimeter(height, width);

        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + areaResult);
        System.out.println("Perimeter: " + perimeterResult);

    }
    
    /**
     * using the documentation feature is pretty goated
     * this is where the input is meant to be read and checked wether its
     * positive and above 0
     * input validation as the nerds say
     * 
     */
    public static int readInput(String Prompt)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number: ");
            input.next();
        }
        //int height = input.nextInt();

        System.out.print("Enter width: ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number: ");
            input.next();
        }
        //int width = input.nextInt();

        input.close();
    }

    /**
     * im starting to think sticking with the basic version was gonna cost me less time
     * 
     * Read in an integer greater than 0 and return its value
     * @param the prompt to be shown to the user
     */

    public static int readPositiveInteger(int readInteger)
    {
        boolean isPositive = false;


    }

}