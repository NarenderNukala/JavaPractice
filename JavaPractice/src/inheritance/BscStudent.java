package inheritance;

public class BscStudent extends Student {

	String subjects;
	double labAttendence;
	
/*	BscStudent()
	{
		super();
		System.out.println("First it calls the super class constructor");
		System.out.println("THIS IS THE SUB CLASS CONSTRUCTOR");
	}*/
	
	public void setStudentInfo()
	{
		subjects = "Maths - Physics - Chemistry";
		labAttendence = 68.45;
		setStudentInfo(2345,"Naren","Narender","23-06-1988");
		
	}
	
	public void displayStudentData()
	{
		displayStudentInfo();
		System.out.println("His subjects " + subjects);
		super.sameMethod();
	}
	
	public void calCulateResults()
	{
		
		findTheResult(68,63,98);
	}
	
	public void subClassMethod()
	{
		System.out.println("THIS IS THE SUB CLASS METHOD and can be called using only subclass variable type.");
	}
	
	public void sameMethod()
	{
		System.out.println("Sub class method");
	}

}
