
public class Arrays {

	public static void main(String args[]) {
		int marks[];
		int[] subs;
		
		marks = new int[5];
		
		float[] factors = new float[8];
		
		int arr[] = {12,22,32,43,21,28};
		
		System.out.println("Marks array size " + marks.length);
		
		//System.out.println("Subjects array size " + subs.length);
		
		System.out.println("arr array size " + arr.length);
		
		System.out.println("First element in arrary arr " + arr[0]);
		System.out.println("Last element in arrary arr " + arr[arr.length-1]);
		
		System.out.println("First element in arrary Marks " + marks[0]);
		System.out.println("First element in arrary Factors " + factors[0]);
		//System.out.println("First element in arrary Subjects " + subs[0]);
		
		factors[0] = 22;
		factors[4] = 11.22f;
		
		System.out.println("First element in arrary Factors " + factors[0]);
		System.out.println("Second element in arrary Factors " + factors[2]);
		System.out.println("Fourth element in arrary Factors " + factors[4]);
		
		
		
	}
}
