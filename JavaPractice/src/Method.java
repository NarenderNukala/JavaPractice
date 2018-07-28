
public class Method {

	public static void mulitiplicationTable(int x){
		for (int j=1;j<11;j++)
			System.out.println(x + " * " + j + " = " + (x*j));
	}
	
	public static void main(String[] args) {

		System.out.println("Multiplication Table for 5");
		mulitiplicationTable(5);
		
		System.out.println("Multiplication Table for 13");
		mulitiplicationTable(13);

	}

}
