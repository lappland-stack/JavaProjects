import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Converter
{

    //1 GBP = 1.3241 USD as of like the 7th of october, mayhaps theres a way to autoupdate the exchange rate here
    public static final double GBP_TO_USD = 1.3241;

   public double mph2kph(double mph)
   {
	   return mph*1.609;
   }
   

   public String mph2kph_printing(double mph)
   {
	   // the DecimalFormat is needed to configure the precision (number of decimals)
	   // of the double variable when converting to string
	   return Double.toString(mph) + " mph = " + 
			   new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(mph2kph(mph)) + " kph";
   }

   public boolean mph2kph_compare(double mph1, double mph2)
   {
	   return mph2kph(mph1) >= mph2kph(mph2);
   }

   public double celsius2fahrenheit(double celsius)
   {
       return (celsius * 9.0 / 5.0) + 32.0;

   }

   public double pounds2dollars(double pounds)
   {
       return pounds * GBP_TO_USD;
   }

   public double seconds2hours(double seconds)
   {
       return seconds / 3600.0;
   }

   
   public double[] convert_array(String type, double[] values)
   {
	   double[] out_values = new double[values.length];

       if (type.equals("mph2kph")) {
		   for (int i = 0; i < values.length; i++) {
			   out_values[i] = mph2kph(values[i]);
		   }

	   }

       if (type.equals("celsius2fahrenheit")) {
           for (int i = 0; i < values.length; i++ ){
               out_values[i] = mph2kph(values[i]);
           }
       }

       if (type.equals("pounds2dollars")) {
           for (int i = 0; i < values.length; i++) {
               out_values[i] = pounds2dollars(values[i]);

           }
       }

       if (type.equals("seconds2hours")) {
           for (int i = 0; i < values.length; i++) {
               out_values[i] = seconds2hours(values[i]);
           }
       }

	   return out_values;
   }

}
