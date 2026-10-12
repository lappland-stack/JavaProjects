/**
 * CycleCalculator class which uses Colins top secret rules to calculate the 
 * estimated duration of a cycle given certain information about the cyclist, 
 * the route and the weather.
 */
public class CycleCalculator
{
    // for checkpoint
   public double getDuration(int numMiles, String competency, 
                             int numYearsExperience, boolean cyclingAlone, 
                             int temp, int windSpeed, boolean isRaining)
   {
	  // fill in!

       double speed = 0;

       //Competency
        if (competency.equals ("Beginner")) {
            speed = 10;
        }

        if (competency.equals ("Intermediate")) {
            speed = 15;
        }

        if (competency.equals ("Advanced")) {
            speed = 20;
        }

        //Cycling alone/with someone

       if (!cyclingAlone) {
           speed *= 1.2;
       }

       //Years of experience
       speed += numYearsExperience * 0.2;

       //Weather

       //for every degree lower than 10 celcius, decrese speed by 0.1mph

       if (temp < 10 ) {
           speed -= (temp - 10) * 0.1;
       }

       //for every degree celcius over 20 decrease speed by 0.1mph

       if (temp > 20) {
           speed -= (temp - 20) * 0.1;
       }

       //every set of 15mph winds decrease speed by 1mph
       speed -= windSpeed / 15;

       //if it is raining decrease speed by 7mph

       if (isRaining) {
           speed -= 2;
       }
        //duration formula or smth


       double duration = numMiles / speed;

      return duration;



   }
   
   // advanced work: arrays

    //are we totally sure about that ?
   public double getTotalDuration(double[] durations)
   {
	   // fill in!
       //im fucking trying man

       double total = 0.0;

       for (double duration : durations) {
           total += duration;
       }


	   return total;
   }
   

}
