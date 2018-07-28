package completed;

public class FindingResultOfaStudent {

	public static void main(String args[]){
		int sub1,sub2,sub3;
		int total;
		float avg;
		String Result, Division;
		
		sub1=85;
		sub2=98;
		sub3=78;
		
		//Finding the result
		if (sub1>34 && sub2>34 && sub3>34)
			Result = "Pass";
		else
			Result = "Fail";
		
		total = sub1 + sub2 + sub3;
		avg = total /3;
		
		// Finding the Class		
		if (avg > 70)
			Division = "Distinction";
		else if (avg > 60)
			Division = "First";
		else if (avg >50)
			Division = "Second";
		else
			Division = "Third";
		
		System.out.println("Result = " + Result);
		System.out.println("Total Marks = " + total);
		System.out.println("Percentage of Marks = " + avg);
		System.out.println("Division = " + Division);
		
	}	
}
