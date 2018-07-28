
public class StringMethods {
	
	public static void main(String args[]) {
		
		String str = "Hello Narender";
		String str1 = " How are you ? ";
		
		System.out.println("str String length " + str.length());
		
		System.out.println("Name is str String = " + str.substring(6));
		
		System.out.println("First 5 Characters in Name  = " + str.substring(6, 11));
		
		System.out.println("str in lower case letters = " + str.toLowerCase());
		System.out.println("str in lower case letters = " + str.toUpperCase());
		
		System.out.println("Removing spaces = " + str1.trim());
		
		System.out.println("Replace Name in str with Naren = " + str.replace("Narender", "Naren"));
		
		System.out.println("Combination of str & str1 = " + str.concat(str1));
		
		System.out.println("Comparing str with 'hello narender' = " + str.compareTo("hello narender"));
		System.out.println("Comparing str with 'hello narender' = " + str.compareTo("HELLO NARENDER"));
		System.out.println("Comparing str with 'hello narender' = " + str.compareToIgnoreCase("hello narender"));
		
		str1 = str1.trim();
		String strs[] = str1.split(" ");
		System.out.println("String array Length = " + strs.length);
		System.out.println("First String in array = " + strs[0]);
		System.out.println("Last String in array = " + strs[strs.length-1]);
		
		String strs1[] = str1.split(" ",2);
		System.out.println("String array Length = " + strs1.length);
		System.out.println("First String in array = " + strs1[0]);
		System.out.println("Last String in array = " + strs1[strs1.length-1]);
		
	}

}
