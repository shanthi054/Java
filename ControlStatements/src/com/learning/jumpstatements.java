package com.learning;

public class jumpstatements {
	public static void main(String[] test) {

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break;

			}
			System.out.println("break statement tested " + i);
		}

		// continue

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;

			}
			System.out.println("Continue statement tested " + i);
		}
		
		
		//return - string get name 
		//From one method , return control to another method
		//String name ="test";
		
		//return name;

	}
}
