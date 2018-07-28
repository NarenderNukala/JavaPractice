public class Break {

	public static void main(String args[]) {
		// While Loop
		System.out.println("WHILE LOOP");
		int i = 0;
		while (i <= 10) {
			i++;
			if (i==2) continue;
			//if (i==2) break;
			System.out.println(i);
						
		}

		/*// Do Loop
		System.out.println("DO LOOP");
		int j = 1;
		do {
			System.out.println(j);
			j++;
			if (j==2) break;
		} while (j <= 10);

		// For Loop
		System.out.println("FOR LOOP");
		for (int k = 1; k < 11; k++) {
			System.out.println(k);
			if (k==2) break;
		}*/
	}
}
