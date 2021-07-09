

public class Strings {
	public static void main(String[] ar) {

		/*
		 * String is a class it belongs to java.lang package
		 * 
		 * in java every class is also a dataype
		 * 
		 * So String is class & datatype
		 * 
		 * String can be created in 3 ways
		 * -------------------------------------------------------- 1. String name =
		 * "test"; -------------------------------------------------------- 2. String
		 * name = new String("test"); --> allocates memory
		 * -------------------------------------------------------- 3. char c[] =
		 * {'t','e','s','t','i','n','g','s'}; String name = new String(c);
		 * --------------------------------------------------------
		 */

		// concat return string type of value
		// String concat(String sp)
		String s = "   Hello";
		String s1 = s.concat(" World  ");
		System.out.println(s1);
		// charAt
		char c = s1.charAt(2);
		System.out.println("character at 2 of String s1 is " + s1.charAt(2));
		// length of String
		int len = s1.length();
		String straw = "strawberries" ;
		String sub = straw.substring(2, 5);
		
		char mycar = "piper".charAt(3);
		System.out.println("here "+mycar);
		System.out.println("length of String s1 is " + len);
		// compare
		String s2 = new String("Hi there");
		String s3 = new String("hi There");
		int comp = s2.compareToIgnoreCase(s1);
		int comp1 = s2.compareToIgnoreCase(s3);
		int comp2 = s1.compareTo(s3);
		int comp3 = s1.compareTo(s2);
		System.out.println("Compare of String " + s2 + "  and is" + s1 + "  " + comp);
		System.out.println("Compare of String " + s2 + "  and is" + s3 + "  " + comp1);
		System.out.println("Compare of String " + s1 + "  and is" + s3 + "  " + comp2);
		System.out.println("Compare of String " + s1 + "  and is" + s2 + "  " + comp3);
		// boolean equalsIgnoreCase

		System.out.println(s2.equalsIgnoreCase(s3));

		// startswith

		boolean result = s1.startsWith("Hello");
		System.out.println(result);
		// endsWith

		boolean resultend = s1.endsWith("Hello");
		System.out.println(resultend);
		// indexOf return int
		System.out.println(s1.indexOf("e"));
		// indexOf return last int

		System.out.println(s1.lastIndexOf("e"));
		
		//replace
		
		System.out.println("replaced   "+s1.replace('e', 'w'));
		
		//Substring 
		
		System.out.println(" " +s1.substring(4));
		System.out.println(" " +s1.substring(0,5));
		
		//toLowerCase.  toUpperCase
		System.out.println(" " +s1.toLowerCase());
		System.out.println(" " +s1.toUpperCase());
		
		//trim starting and ending space
		
		System.out.println(s1.trim());
		
		//spilt String[]
		String[] test = s1.split("e");
		
		System.out.println(test[0]);
		
	}

};