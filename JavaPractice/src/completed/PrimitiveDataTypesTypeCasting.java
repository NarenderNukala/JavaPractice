package completed;

public class PrimitiveDataTypesTypeCasting {
	
	public static void main(String args[]){
		int a,b,c=30;
		double amt;
		float f1,f2;
		final double PI = 3.1242;
		String str = "Hello World";
		
		a=10;
		b=20;
		amt = 125.23;
		
		f1 = a;
		/*PI = 3.12;*/
		//b=f1;
	/*	f2=amt;*/
		
		b=(int)f1;
		f2=(float)amt;
		
		System.out.println("int a value " + a + " additional text" );
		System.out.println("int b value " + b);
		System.out.println("int c value " + c);
		
		System.out.println("float value f1 " + f1);
		System.out.println("float value f2 " + f2);
		
		System.out.println("double value " + amt);
		
		System.out.println("Constant value PI " + PI);
		
		System.out.println("String value str " + str);
		
	}

}
