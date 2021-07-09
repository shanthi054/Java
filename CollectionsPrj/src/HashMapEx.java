import java.util.*;
public class HashMapEx {
	
	public static void main (String ar[]) {
		
		HashMap<String, String> maps= new HashMap<String, String>();
		
		System.out.println("is hashmap empty "+maps.isEmpty());
		
		maps.put("T", "Telugu");
		maps.put("H", "Hindi");
		maps.put("E", "English");
		maps.put("S", "Spanish");
		
		if (maps.isEmpty())
			System.out.println("hashmap is empty ");
		else 
			System.out.println("maps length " +maps.size());
		
		System.out.println(maps.keySet());
		System.out.println(maps.values());

	}

}
