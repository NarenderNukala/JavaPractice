package narenPkg;

public class ExceptionEx {
	
	public static void main(String[] args) {
		
		int a=10,b=0,c;
		int arr[];
		arr	= new int[3];
		
		/*System.out.println("It will throw division by error");
		c = a / b;
		System.out.println("Execution will be stopped at the above line itself");*/
		
				
		arr[0] = 12;
		System.out.println("The below line will throw exception");
		arr[4] = 32;
		System.out.println("First element in the array " + arr[0]);
		
		System.out.println("Execution completed successfully.");
		

	}

}
