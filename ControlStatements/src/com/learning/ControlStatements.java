package com.learning;

public class ControlStatements {
	public static void main(String[] x) {

		//Selection statements
		//if else
		int a = 1555;

		if (a == 1555) {
			System.out.println("a=1555");
		} else {
			System.out.println("a!=1555");
		}
		
		//switch case
		switch (a) {
		case 0:
			System.out.println("a =0");
			break;

		case 1:
			System.out.println("a =1");
			break;
		case 2:
			System.out.println("a =2");
			break;
		case 1555:
			System.out.println("a  matched  case 1555");
			break;

		default:
			System.out.println("default");
		}
		
		
	}
}
