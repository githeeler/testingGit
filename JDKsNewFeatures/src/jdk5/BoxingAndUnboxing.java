package jdk5;

import static java.lang.System.out;

import java.util.Arrays;

public class BoxingAndUnboxing {

	//Class shows new feature of jdk 5 : Boxing and Unboxing
	
	public static void main(String[] args) {
		
		
		Long LNBR = new Long(123);
		long lnbbr = LNBR;    //nnboxing
		
		//boxing
		Integer max = 10;
		
		for(int i = 0; i < max ; i++)  //unboxing (indirect in condition checking)
		{
			printNumber(i); //Boxing
		}
		
		System.out.println("-------------------------------------------");
		//Compiler chooses the most specific ones (the small int)
		printNumber(5);
		
		System.out.println("-------------------------------------------");
		//the same for choosing two arguments method then with varags
		printCoupleOfNumber(111, 666);
		
	}
	
	
	public static void printNumber(Integer number)
	{
		System.out.println("printing with Integer:" + number);
	}
	
	public static void printNumber(int number)
	{
		System.out.println("printing with int:" + number);
	}

	
	public static void printCoupleOfNumber(Integer a, Integer b)
	{
		System.out.println("printing with two arguments method, a:"+ a + " i b:" + b);
	}
	
	public static void printCoupleOfNumber(Integer... ints)
	{
		System.out.println("printing varargs, ints: " + Arrays.asList(ints).toString());
	}
}
