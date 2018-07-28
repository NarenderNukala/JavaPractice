package oopsPrgs;

public class StaticExClass {

	static int x,y, counter = 0;
	
	int a,b;
	
	static {
		System.out.println("Static block");
		counter = counter + 1;
	}
	
	StaticExClass()
	{
		System.out.println("Constructor ");
	}
	
	static void initialzeStaticVars() 	{
		x = 10;
		y = 20;
		//a = 12;
	}
	
	static int sum(int i,int j) {
		return i+j;
	}
	
	public void initalizeNormalVars()
	{
		a = 34;
		b = 23;
		x = 12;
	}
	
	public void displayAllVars()
	{
		System.out.println("Static varaible x = " + x);
		System.out.println("Static varaible y = " + y);
		System.out.println("Normal varaible a = " + a);
		System.out.println("Normal varaible b = " + b);
	}
	
	public static void main(String args[]) {
		
		System.out.println("Counter value " + StaticExClass.counter );
		StaticExClass sec = new StaticExClass();
		sec.initalizeNormalVars();
		sec.x = 21;  // it will allow object to refer the static variables, gives the warning to use with class name
		StaticExClass.y = 23;
		sec.displayAllVars();
		
		System.out.println("Second Object initialization");
		StaticExClass sec1 = new StaticExClass();
		sec1.displayAllVars();
		
		System.out.println("Sum of two numbers " + StaticExClass.sum(30, 40));
		
	}
	
}


