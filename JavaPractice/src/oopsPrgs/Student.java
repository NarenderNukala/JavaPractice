package oopsPrgs;

public class Student {

	int sub1,sub2,sub3;
	int total;
	double avg;
	String Result, Division, Sname;
	
	public Student() {
		sub1 = 30;
		Sname = "temp";
	}
	
	Student(int s1,int s2,int s3){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;	
	}
			
	public void setMarks(int s1,int s2,int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;		
	}
	
	public void setName(String name) {
		Sname = name;	
	}
	
	public void getMarks() {
		System.out.println("Marks in the First subject = " + sub1);
		System.out.println("Marks in the Second subject = " + sub2);
		System.out.println("Marks in the Third subject = " + sub3);
	}
	
	public void getResult() {
		//Finding the result
			if (sub1>34 && sub2>34 && sub3>34)
				Result = "Pass";
			else
				Result = "Fail";
			
			total = sub1 + sub2 + sub3;
			avg = (total /3);
			
			// Fidning the Divison		
			if (avg > 70)
				Division = "Distinction";
			else if (avg > 60)
				Division = "First";
			else if (avg >50)
				Division = "Second";
			else
				Division = "Third";
			
			System.out.println("Name = " + Sname);
			System.out.println("Result = " + Result);
			System.out.println("Total Marks = " + total);
			System.out.println("Percentage of Marks = " + avg);
			System.out.println("Division = " + Division);
	}
	
	
}
