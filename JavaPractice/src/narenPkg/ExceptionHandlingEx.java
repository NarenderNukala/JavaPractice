package narenPkg;

public class ExceptionHandlingEx {
	
	public static void main(String[] args)  throws Exception{
		
		int a=10,b=0,c;
		double balance = 100.50;
		int arr[];
		arr	= new int[3];
		
		
	/*	//single catch block
		try {
			System.out.println("the following line will throw division by error, but it will be caught by catch block");
			c = a / b;
		} catch (java.lang.ArithmeticException e) {
			System.out.println("In the Arithmetic exception Catch block");
			e.printStackTrace();
		}*/
		
		
	/*	//Multiple try catch block
		try {
			arr[0] = 12;
			System.out.println("The below line will throw out of bound exception");
			arr[4] = 32;
			System.out.println("First element in the array " + arr[0]);
		} catch (ArithmeticException e) {
			System.out.println("In the Arithmetic exception Catch block");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the Array Index out of Bound exception Catch block");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("In the Arithmetic exception Catch block");
			e.printStackTrace();
		}
		*/
		
/*		//finally block
		try {
			System.out.println("the following line will throw division by error, but it will be caught by catch block");
			c = a / 2;
		} catch (java.lang.ArithmeticException e) {
			System.out.println("In the Arithmetic exception Catch block");
			//e.printStackTrace();
		} finally {
			System.out.println("Final Block will be executed irrespective catch block and exception caught or not");
		}*/
		
		
		
	/*	 //Super class exception shoudn't come before subclass exception 
		try {
			arr[0] = 12;
			System.out.println("The below line will throw out of bound exception");
			arr[4] = 32;
			System.out.println("First element in the array " + arr[0]);
		} catch (Exception e) {
			System.out.println("In the Arithmetic exception Catch block");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("In the Arithmetic exception Catch block");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the Array Index out of Bound exception Catch block");
			e.printStackTrace();
		}*/
		
	
		
		//UserDefined Exception
		try {
			if (balance < 500) {
				System.out.println("You don't have enough balance exception has to be thrown.");
				throw new Exception("Insufficent balance");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program execution completed successfully.");
		

	}

}
