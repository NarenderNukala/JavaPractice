
public class Sorting {
	
	public static void main(String args[]) {
		
		//int arr[] = {12,52,32,43,26,28,32,45};
		int arr[] = {12,22,32,43,56,68,72,85};
		int iterations = 0;
		int temp;
		
		int len = arr.length-1;
		int i,j;
		boolean flag=true;
		
	/*	System.out.println("Before sorting");
		for (int k : arr) System.out.print(k + "  ");
		System.out.println(" ");*/
		
	
		
		outer:
		for (i=0;i<len;i++)
		{
			for (j=i+1;j<=len;j++)
			{
				iterations += 1;
				if (arr[i] > arr[j]){
					flag = false;
					break outer;
					
					/*//sorting
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;*/
				}
					
			}//inner for loop
			
		}//outer for loop
		
		/*System.out.println("after sorting");
		for (int k : arr) System.out.print(k + "  ");
		System.out.println(" ");*/
		
		if (flag)
			System.out.println("Array is in sorter order");
		else
			System.out.println("Array is not in sorter order");
		
		System.out.println("Number of iterations " + iterations);
		
	}
}







/*int count = 0;
boolean flag1 = true;
for (int k=0;k<len-1;k++){
	count++;
	if (arr[k] > arr[k+1]) {
		flag1 = false;
		System.out.println("array is not in a sorted order");
	}
}
if (flag1) System.out.println("array is in a sorted order");
System.out.println("Count  " + count);*/
