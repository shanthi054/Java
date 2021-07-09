package com.learning;

public class Operators {
	public static void main(String c[]) {
		byte x = 100;
		byte y = 100;
		int z = (int) (x+y) ;
		System.out.println(z);
		System.out.println("result of addtion  " +(x + y));
		System.out.println("result of sub  " +(x - y));
		System.out.println("result of mul  " +(x * y));
		System.out.println("result of div  " +(x / y));
		System.out.println("result of mod  " +(x % y));
		/* Unary Operators*/
		byte a = 4;
		System.out.println("Result of - "+(-a));
		System.out.println("Result of post increment is " +(a++));
		System.out.println("increment a value "+a);
		System.out.println("Result of pre increment is " +(++a));
		System.out.println("Result of Post decrement is "+(a--));
		System.out.println("decremented a value "+a);
		System.out.println("Result of Pre decrement is "+(--a));
		
		//assignment operator = 
		
		byte p = a;
		
		System.out.println("assignment operators p = " +p);
		
		//relational operators usually returns true or false
		
		System.out.println("Result of x>y is " +(x>y) );
		System.out.println("Result of x<y is " +(x<y) );
		System.out.println("Result of x>=y is " +(x>=y) );	
		System.out.println("Result of x<=y is " +(x<=y) );
		System.out.println("Result of x==y is " +(x==y) );
		System.out.println("Result of x!=y is " +(x!=y) );
		
		//logical operators && || !
		if (x==y || x>y) {
		System.out.println("Result logical operators " +(x>y) );
				
		}
		// Boolean operators returns true or false & | !
		
		boolean s =true;
		boolean t = false;
		
		boolean u = s&t;
		
		System.out.println(s&t);
		System.out.println(s|t);
		System.out.println(!u);
		
		//bitwise operators ~ & | ^ << >> >>>
		
		System.out.println(~x); // bitwise complement
		System.out.println(x&y); //and on bitwise
		System.out.println(x|y); //or 
		System.out.println(x^y); // Bitwise XOR 
		System.out.println(x<<y); //shift left and shift right
		System.out.println(x>>y); // shift right
		System.out.println(x>>>y); //
		
		//Ternary operators
		
		System.out.println((x==y)? "x and y are equal" : "x and y are not equal");
		
		//test
		System.out.println("x="+(x+y));
		
	
	
	}

}
