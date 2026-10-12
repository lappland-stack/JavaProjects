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

        printRectangleDetails(10,15);
        

        
    }
    public static int area (int height, int width)
    {
        return height * width;
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

    public static int perimeter (int height, int width)
    {
        return height * 2 + width * 2;
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

    public static void printRectangleDetails (int height, int width)
    {
        int areaResult = area(height, width);
        int perimeterResult = perimeter(height, width);

        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + areaResult);
        System.out.println("Perimeter: " + perimeterResult);

    }

}