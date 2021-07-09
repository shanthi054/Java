package com.learning;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class InputandOutput {

	public static void main(String[] args) throws Exception {
		// read inputs from users using stream concept.
		// stream helps to transmit data
		// inputStreamReader ---> OR -->> SCANNER
		// bufferedReader
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		char c = (char) b.read();
		String test = b.readLine();
		// System.out.println(b.read());
		// System.out.println(test);
		System.out.println("Please enter firstnumber");
		int firstnum = Integer.parseInt(b.readLine());
		System.out.println("Please second firstnumber");
		int secondnum = Integer.parseInt(b.readLine());

		int third = firstnum + secondnum;

		System.out.println("the addition of firstnumber and second number is " + third);

		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter firstnumber");
		int firstnum1 = s.nextInt();
		System.out.println("Please enter secondnumber");
		int secnum = s.nextInt();
		
		int thirdnum = firstnum1 - secnum;
		System.out.println("the substraction of firstnumber and second number is " + thirdnum);
		
		/*
		 * // output statments
		 * 
		 * System.out.println("hello println statment");// after println control comes
		 * to next line and print System.out.print("print statment");
		 * System.out.println("hello println statment");
		 * 
		 * 
		 * System.err.println("message"); //out.println and err.println: both are same
		 * but, err will help programmers to understand the program.
		 */
	}

}
