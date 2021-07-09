import java.util.*;
public class LinkedListEx {
 public static void main(String ar[]) {
	 LinkedList<String > list = new LinkedList<String>();
	 
	 list.add("John");
	 list.add("mate");
	 list.add(1,"kate");
	 list.add("rat");
	 
	 list.addLast("dad");
	 list.addFirst("MAAA");
	 System.out.println(list);
	 
	 System.out.println("Is list contains : "+list.contains("rat"));
	 System.out.println("get first element : "+list.getFirst());
	 System.out.println("get last element : "+list.getLast());
	 System.out.println("get index 3  element : "+list.get(3));
 }
}
