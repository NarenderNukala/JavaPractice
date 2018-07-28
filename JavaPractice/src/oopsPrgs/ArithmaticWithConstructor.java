package oopsPrgs;

public class ArithmaticWithConstructor {

	int a,b;
	
	ArithmaticWithConstructor()
	{
		a = 30;
		b = 20;
		System.out.println("Default ");
	}
	
	ArithmaticWithConstructor(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void setNumbers(int x,int y)
	{
		a = x;
		b = y;
	}
	
	void printSum()
	{
		System.out.println("Sum of two numbers " + a + " + "  + b + " = " + (a+b));
	}
	
	void printDifference()
	{
		System.out.println("Difference of two numbers " + a + " - "  + b + " = " + (a-b));
	}
	
	void biggestOfTwo()
	{
		System.out.println("Biggest of two numbers " + a + " , "  + b + " = " + ((a>b)?a:b));
	}

}
