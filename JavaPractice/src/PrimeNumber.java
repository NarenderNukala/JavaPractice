
public class PrimeNumber {

	//2,3,5,7,11,13....
	
	public static void main(String args[]){
		int counter,i,j, iterations=0;;
		
		for (i=2;i<50;i++)
		{
			counter = 0;
			for (j=1;j<=i;j++)
			{
				if (i%j == 0) counter += 1;
				iterations += 1;
				
			} // inner for loop
			if (counter == 2) System.out.print(i + ",");
			
		} // outer for loop
		
		System.out.println(" ");
		System.out.println("Total Number of iterations program has executed " + iterations);
		
	}
}







//for (j=2;j<=i/2;j++)