import java.util.Scanner;

/**
 * This program is supposed to show details about a car
 * @version 0.1
 * Hours wasted = 23
 * headaches = 9
 * migraines = 4
 * lowkey feels oddly overcomplicated for something that should be fairly 
 * simple but i may be wrong
 */
public class Car
{
    // these are the attributes
    private String brand;
    private String model;
    private int year;
    private double speed;
    
    //this gets the attributes so they can have values set
    public String getBrand() { return brand;}
    public String getModel() { return model;}
    public int getYear() { return year;}
    public double getSpeed() { return speed;}
    
    public Car (String newBrand, String newModel, int newYear, double newSpeed)
    {
        brand = newBrand;
        model = newModel;
        year = newYear;
        speed = newSpeed;
    }
    
    //this is where the values are set
    public void setBrand(String B)
    {
        this.brand = B;
    }
    
    public void setModel(String M)
    {
        this.model = M;
    }
    
    public void setYear(int Y)
    {
        this.year = Y;
    }
    
    public void setSpeed(double S)
    {
        this.speed = S;
    }
    
    public void displayCarInfo()
    {
        System.out.println(brand + " " + model + " " + year + " " + speed);
    }
     
    public void start()
    {
        System.out.println("The car is starting");
    }
    
    public void accelerate()
    {
        speed = speed + 10;
    }
    
    public void brake()
    {
        speed = 0;
    }
    
    
}