package completed;

public class Operators {

	public static void main(String args[]){
		int a,b,c,d,i;
		
		a = 10;
		b = 20;
		i = 10;
		
		c = a++;
		System.out.println("C value is " + c);
		System.out.println("A value is " + a);
		
		d = ++b;
		System.out.println("D value is " + d);
		System.out.println("B value is " + b);
		
		i += c;
		System.out.println("I value is " + i);
		
	}	
}
