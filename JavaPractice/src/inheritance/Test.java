package inheritance;

public class Test {

	
	public static void main(String[] args) {
		
	/*	//Constructor calling
		BscStudent bst;
		bst = new BscStudent();*/
		
	/*	//calling sub class methods using subclass variable
		BscStudent bst;
		bst = new BscStudent();
		bst.setStudentInfo();
		bst.displayStudentData();*/
		
	/*	//calling super class methods using subclass variable
		BscStudent bst;
		bst = new BscStudent();
		bst.setStudentInfo(234, "SuperStudent", "SuperFather", "12-10-1999");
		bst.displayStudentInfo();*/
		
	/*	//calling super class methods using super variable and subclass object
		Student std;
		std = new BscStudent();
		std.sameMethod();
		std.setStudentInfo(234, "SuperStudent", "SuperFather", "12-10-1999");
		std.displayStudentInfo();
		//std.displayStudentData();
*/		
		
		/*//Accessing protected and public variables
		BscStudent bst;
		bst = new BscStudent();
		//bst.rollNumber = 456; //Private variable
		bst.name = "test";    //Protected variable
		bst.dob = "21-01-1999"; //public variable
*/		
		
		
		//method overrding
		Student std;
		std = new BscStudent();
		std.sameMethod();
		
		BscStudent bst;
		bst = new BscStudent();
		bst.sameMethod();
		
		Student std1;
		std1 = new Student();
		std1.sameMethod();

	}

}
