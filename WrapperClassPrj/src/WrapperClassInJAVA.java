/*
 * Wrapper class can store some value
 * 
 * Number : Integer, Byte, Short, Long, Float, Double
 * int a=10;
 * Integer i = new Integer(a);
 * 
 * Character :to convert char type value
 * Boolean : to convert boolean type value
 * 
 */
//Wrapper classes - Boolean 

public class WrapperClassInJAVA {
public static void main (String ar[]) {
	boolean a = true;
	Boolean b = new Boolean(a);
	System.out.println(b.booleanValue());
	
	//byte
	byte c = 3;
	
	Byte e = new Byte(c);
	System.out.println(e.byteValue());
	System.out.println(e.intValue());
	System.out.println(e.floatValue());
}
}
