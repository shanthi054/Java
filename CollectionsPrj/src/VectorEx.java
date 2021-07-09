// same as arraylist , synchrnized
import java.util.*;

public class VectorEx {
public static void main (String[] ar) {
	Vector<String> n = new Vector<String>();
	
	n.add("a");
	n.add("b");
	n.add("c");
	n.add("d");
	n.add("e");
	n.add("f");
	n.add("g");
	
	System.out.println("Capacity after adding 6 elements " +n.capacity());
	
	Enumeration<String > en = n.elements();
	
	while(en.hasMoreElements()) {
		System.out.println("Hello "+en.nextElement());
	}
}
}
