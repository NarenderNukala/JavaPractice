
public class ArraysFor {
	
	public static void main(String args[]) {
				
		int arr[] = {12,22,32,43,21,28,32,45};
		
		for(int j=0;j<arr.length;j++)
			System.out.println( (j+1) + " Element is " + arr[j]);
		
		for (int i : arr)
		{
			System.out.println(i);
		}

	}
}
