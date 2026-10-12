
/**
 * This tests the car file, i think ?
 * 
 * 
 */
public class CarTester
{
   public static void main (String[] args)
   {
       Car yankHorse = new Car("Ford", "Mustang", 2000, 0);
       
       yankHorse.displayCarInfo();
       yankHorse.start();
       yankHorse.accelerate();
       yankHorse.brake();
       
       System.out.println(yankHorse.getSpeed());
   }
}