import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ConverterTest
{
	private static final double ACCURACY = 0.05;

	private static Converter converter;

	@BeforeAll
	public static void setup()
	{
		// This method only setups the unit testing.
		// In other words, this method is responsible for instantiating or initializing 
		// any variables that unit test methods need.
		// There are different annotations as can be seen here
		// https://junit.org/junit5/docs/current/user-guide/
		// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/package-summary.html
		converter = new Converter();		
	}

	@Test
	public void test_mph2kph()
	{
		// Test convert mph to kph -- comparing doubles using assertEquals
		assertEquals(38.6243, converter.mph2kph(24), ACCURACY, "mph2kmh failed:");
		assertEquals(96.5606, converter.mph2kph(60), ACCURACY, "mph2kmh failed:");
	}
	
	@Test
	public void test_mph2kmh_printing()
	{
		// Test convert_array -- comparing Strings using assertEquals
		assertEquals("60.0 mph = 96.5 kph", converter.mph2kph_printing(60),"mph2kmh_printing failed:");
	}

	@Test
	public void test_mph2kph_compare()
	{
		//boolean checking assertion -- assert true and false is the way i found to test for booleans, as i have seen on some stack overflow thread
		assertTrue(converter.mph2kph_compare(60, 30));
		assertFalse(converter.mph2kph_compare(30, 60));
	}

	@Test
	public void test_convert_array()
	{
		//here we test arrays -- basically junit tests every element of the two arrays against the floating point tolerance
		double[] input = {10, 20, 30};
		double[] expected = {16.09, 32.18, 48.27};

		assertArrayEquals(expected, converter.convert_array("mph2kph", input),ACCURACY);
	}

	@Test
	public void test_celcius2farenheit()
	{
		//
		assertEquals(32.0, converter.celsius2fahrenheit(0), ACCURACY);
		assertEquals(212.0, converter.celsius2fahrenheit(100), ACCURACY);
	}

	@Test
	public void test_pounds2dollars()
	{
		assertEquals(13.241, converter.pounds2dollars(10), ACCURACY);
	}

	@Test
	public void test_seconds2hours()
	{
		assertEquals(2.7777, converter.seconds2hours(10000), ACCURACY);
	}

	@Test
	public void test_celcius_array()
	{
		double[] input = {0, 100, 20};
		double[] expected = {32, 212, 68};

		assertArrayEquals(expected, converter.convert_array("celsius2fahrneheit", input), ACCURACY);

	}

	@Test
	public void test_pounds_array()
	{
		//lowkey went onto exchangerates.org.uk to get the numbers for the array
		//
		double[] input = {1, 10, 20};
		double[] expected = {1.3241, 13.241, 26.482};

		assertArrayEquals(expected, converter.convert_array("pounds2dollars", input), ACCURACY);

	}

	@Test
	public void test_seconds_array()
	{
		double[] input = {3600, 7200, 10000};
		double[] expected = {1, 2 ,2.7777};

		assertArrayEquals(expected, converter.convert_array("seconds2hours", input), ACCURACY);

	}
}
