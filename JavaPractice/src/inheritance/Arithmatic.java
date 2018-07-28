package inheritance;

public class Arithmatic {

	
	//int a,b;
	public int a;
	int b;
	private int c;
	
	public void setNumbers(int x,int y)
	{
		a = x;
		b = y;
	}
	
	public void printSum()
	{
		System.out.println("Sum of two numbers " + a + " + "  + b + " = " + (a+b));
	}
	
	public static void sumOfNumbers(int a,int b)
	{
		System.out.println("Sum of two numbers " + a + " + "  + b + " = " + (a+b));
	}
	
	public static void sumOfNumbers(int a,int b,int c)
	{
		System.out.println("Sum of two numbers " + a + " + "  + b + " = " + (a+b+c));
	}
	
	void printDifference()
	{
		System.out.println("Difference of two numbers " + a + " - "  + b + " = " + (a-b));
	}
	
	void biggestOfTwo()
	{
		System.out.println("Biggest of two numbers " + a + " , "  + b + " = " + ((a>b)?a:b));
	}
	
	public static void main(String args[]) {
		
		Arithmatic math = new Arithmatic();
		math.setNumbers(30, 20);
		math.printSum();
		
		Arithmatic.sumOfNumbers(30, 43);
		Arithmatic.sumOfNumbers(30, 43, 35);
		
	}

}
