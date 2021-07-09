
//program to demonstrate  HashSet in Java
import java.util.*;

public class HashSetEx {
	public static void main(String ar[]) {

		HashSet<String> names = new HashSet<String>();

		System.out.println("names.isEmpty() " + names.isEmpty());

		// adding elements or objects

		names.add("John");
		names.add("TWG");

		if (names.isEmpty()) {
			System.out.println("names set is still empty");
		} else {
			System.out.println("Size of elements in HashSet " + names.size());
		}

		if (names.contains("John")) {
			names.remove("John");
			System.out.println("Updated size of the hashset names " + names.size());

			names.clear();

			System.out.println("size after clear method call " + names.size());

		}

		names.add("John");
		names.add("TWG");
		names.add("John1");
		names.add("TWG2");
		names.add("John3");
		names.add("TWG4");
		names.add("John4");
		names.add("TWG5");

		System.out.println(names);
		//for each
	   for(String v :names)
	   {
		   String newvalue = "Welcome " +v;
		   System.out.println(newvalue);
	   }
	   
	   
		//iterator -- hashnext (), next()
	    Iterator<String> newNames = names.iterator();
	    while(newNames.hasNext())
	    {
	    	String n =newNames.next();
	    	String newvalue = "welcome to practice world "+n;
	    	System.out.println(newvalue);
	    }
	    
	    //ListIterator
	    
	//    ListIterator<String> nameslist = new ListIterator;
	    
		
	}

}
 