package completed;

public class BiggestTwoNumbers {

	public static void main(String args[]){
		int a,b,c;
		a=10;
		b=15;
		c=21;
		
	/*	if (a>b) {
			System.out.println("A is bigger than B " + a);
		}*/
		
	/*	if (a>b) {
			System.out.println("A is bigger than B " + a);
		}
		else {
			System.out.println("B is bigger than A " + b);
		}*/
			
		
		//BIGGEST OF THREE NUMBERS
		if (a>b && a>c) {
			System.out.println("A is Big");
		} else if (b>a && b>c) {
			System.out.println("B is Big");
		} else
			System.out.println("C is Big");
				
	}
}
