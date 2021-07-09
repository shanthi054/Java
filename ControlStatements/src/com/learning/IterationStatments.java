package com.learning;

public class IterationStatments {
	// for
	public static void main(String[] x) {

		for (int i = 0; i <= 5; i++) {
			System.out.println("for loop post increment " + i);
		}

		for (int i = 0; i <= 5; ++i) {
			System.out.println("for loop pre increment  " + i);
		}

		int a = 0;
		while (a < 5) {
			a++;
			System.out.println("while loop " + a);

		}
		
		do  {
			
			System.out.println("do while");
			a ++;
		}while(a == 5);

	}

}
