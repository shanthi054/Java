import java.util.*;



public class ArrayListEx {
	public static void main(String ar[]) {
		 ArrayList<String > list = new ArrayList<String>();
		 
		 list.add("John");
		 list.add("mate");
		 list.add(1,"kate");
		 list.add("rat");
		 
		 
		 System.out.println(list);
		 
		 System.out.println("Is list contains : "+list.contains("rat"));
		 
		 System.out.println("get index 3  element : "+list.get(3));

		 ListIterator<String> listAr = list.listIterator() ;
		 while(listAr.hasNext()) {
			 String s = listAr.next();
			 System.out.println("Hello " +s+ " Welcome to practice");
			 
		 }

		 list.remove(2);
		 System.out.println(list);
	}

}
