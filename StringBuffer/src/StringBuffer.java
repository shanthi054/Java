
//import java.lang.StringBuffer;

public class StringBuffer {
	/*
	 * String class is a immutable Once string is created, we cannot change value in
	 * that memory location.
	 * ----------------------------------------------------------------------
	 * Stringbuffer class is mutable, can be changed after creation
	 * ---------------------------------------
	 *
	 * StringBuffer append(value); StringBuffer insert(int index, value);
	 *
	 */
	public static void main(String ar[]) {

		// String is immutable
		String str = new String("Hello");

		System.out.println("initially str value is " + str);
		System.out.println("initially str value is " + str.hashCode());

		str = "World";
		System.out.println("after change str value is " + str);
		System.out.println("after change str value is " + str.hashCode());

		str = "welcome";
		System.out.println("after change str value is " + str);
		System.out.println("after change str value is " + str.hashCode());

		// program to demonstrate StringBuffer concept. MUTTABLE

		java.lang.StringBuffer strb = new java.lang.StringBuffer(); // creating string buffer object

		strb.append("shanthi");
		System.out.println("after change str value is " + strb);
		System.out.println("after change str value is " + strb.hashCode());

		strb.append(547);
		System.out.println("after change str value is " + strb);
		System.out.println("after change str value is " + strb.hashCode());

		strb.insert(0, " I am loving java ");
		System.out.println("after change str value is " + strb);
		System.out.println("after change str value is " + strb.hashCode());

		// insert StringBuffer insert (int index, value)

		strb.insert(0, false);
		System.out.println(strb);
		System.out.println("after change str value is " + strb.hashCode());

		strb.insert(0, true);
		System.out.println(strb);
		System.out.println("after change str value is " + strb.hashCode());

		strb.insert(0, "Hello there!!");
		System.out.println(strb);
		System.out.println("after change str value is " + strb.hashCode());

		// StringBuffer delete(int beginindex, endindex)

		strb.delete(0, 22);
		System.out.println(strb);
		System.out.println("after change str value is " + strb.hashCode());
		
		//reverse
		strb.reverse();
		System.out.println(strb);
		System.out.println("after change str value is " + strb.hashCode());

		//convert to String
		strb.toString();
		
		//int length, int indexOf, int lastIndexOf, replace
		
		strb.replace(0, 1, str);
		System.out.println("after change str value is " + strb);
		
		
		
		
	}

}
