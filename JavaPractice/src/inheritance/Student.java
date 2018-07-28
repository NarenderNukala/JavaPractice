package inheritance;

public class Student {

	private int rollNumber;
	protected String name;
	public String fname,dob;
	
	Student()
	{
		System.out.println("Super class constructor");
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student rollNumber " + rollNumber);
		System.out.println("Student Name " + name);
		System.out.println("Student Father Name " + fname);
		System.out.println("Student DOB " + dob);
	}
	
	private void setStudentInfo(int rno, String sname, String sFname)
	{
		rollNumber = rno;
		name = sname;
		fname = sFname;
		dob = "01-01-1984";
	}
	
	public void setStudentInfo(int rno, String sname, String sFname, String sdob)
	{
		rollNumber = rno;
		name = sname;
		fname = sFname;
		dob = sdob;
	}
	
	public void findTheResult(int sub1,int sub2, int sub3){
		String Result,Division;
		int total;
		float avg;
		
		if (sub1>34 && sub2>34 && sub3>34)
			Result = "Pass";
		else
			Result = "Fail";
		
		total = sub1 + sub2 + sub3;
		avg = total /3;
		
		// Fidning the Divison		
		if (avg > 70)
			Division = "Distinction";
		else if (avg > 60)
			Division = "First";
		else if (avg >50)
			Division = "Second";
		else
			Division = "Third";
		
		System.out.println("Name = " + name);
		System.out.println("Result = " + Result);
		System.out.println("Total Marks = " + total);
		System.out.println("Percentage of Marks = " + avg);
		System.out.println("Division = " + Division);
	}

	public void superClassMethod()
	{
		System.out.println("THIS IS THE SUPER CLASS METHOD");
	}
	
	void sameMethod()
	{
		System.out.println("Super class method");
	}
}
