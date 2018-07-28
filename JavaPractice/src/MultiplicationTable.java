
public class MultiplicationTable {

	public static void main(String args[]) {
		
		first:
		for (int i=1;i<5;i++)
		{
			for (int j=1;j<5;j++)
			{
				//if (j==2) break;
				if (j==2) continue;
				//if (j==2) continue first;
				System.out.println(i +"*" + j + "=" + i*j);
				
			}
		}
	}
}
