/*_________________________________________________________________________________________________________________________
   NAME- Namrata Lamba (0595525)                                                       COURSE- COIS 2240H Assignment 1 
   																					   DATE- Jan30,2018 
____________________________________________________________________________________________________________________________*/

import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
public class Fibonacci 
{
	/*_________________________________________________________________________ 
	 Declares static assigned variables required in main & fiboSeriesRec method
	 x, y, z - first, second & third numbers respectively
	 Declares Scanner
	 __________________________________________________________________________*/
	public static int x = 0, y = 1, z = 0; 
	public static Scanner reader = new Scanner(System.in);
	
	/*________________________________________________________________________ 
	 No parameters passed, Does not return value
	 Scans Input (DataType- Integer)
	 Calls fiboSeriesRec Method passing input as parameter	
	 Print Output 
	 _________________________________________________________________________*/
	public static void main(String[] args) 
	{
			System.out.println("Welcome to Fibonacci Series Calculator !!");
			System.out.println("How long would you like the Fibonacci Series to be? "); //prompt user for input
		int length = reader.nextInt(); //assigns input to variable	
		
			System.out.println("Here is your Fibonacci Series upto " + length + " places..."); 
			System.out.println(x); //print first number
		if (length > 1) //prints second number only if user ask series to be more than 1 places
		{
			System.out.println(y); 
		}
       
        long startTime2=  System.nanoTime(); //variable to get time before execution of recursive method
        	fiboSeriesIte(length - 2); //Calls Method
        long endTime2 = System.nanoTime(); //variable to get time before execution of recursive method
        long timeElapsed2 = endTime2 - startTime2; //calculate actual execution time
        	System.out.println("Time taken for execution " + timeElapsed2);
	}

	
	public static void fiboSeriesIte(int length) 
	{
		for(int i= 1; i <= length; i++)
		{
			z = x + y;
			x = y;
			y = z;
			System.out.println(z); //output rest of Fibonacci sequence
		}
	}
}
