package oopsPrgs;

public class Arithmatic {

	
	//int a,b;
	public int a;
	int b;
	private int c;
	protected int d;
	
	public void setNumbers(int x,int y)
	{
		a = x;
		b = y;
	}
	
	private void test() {
		
	}
	
	protected void test1() {
		
	}
	
	public void printSum()
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
	
	protected void biggestOfThree()
	{
		System.out.println("Biggest of two numbers " + a + " , "  + b + " = " + ((a>b)?a:b));
	}

}
