/*
 * Static variables & methods, static Blocks, Constructors, this keyword
 * 
 * class variables/methods will used as instance variables/methods
 * 
 * class var/methods can be accessible using objcreated
 * Ex: JavaClass s = new JavaClass();
 * s.test ="test";
 * 
 * STATIC var/methods, shared variables 
 * 
 * JavaClass.test = "test";
 * 
 * 
 * WRITE STATIC BLOCK, to execute something before main method
 * STATIC BLOCK HIGHEST PROIRTY IN ORDER OF EXECUTION
 */

// program to demonstrate static variables and static methods


class JavaClass{
	String name; // instance variable
	void listen() // instance method
	{
		System.out.println(name+" is listening the class");
	}
	
	static String board;// static variable
	static void teaching() // static method
	{
	// trying to acccess instance variable in static method
		//System.out.println(name);
		// non static variable cannot be referenced from static context
		System.out.println("S is teaching static keyword concept on " +board);
	}
}

public class StaticAndConst {
 public static void main (String[] ar) {
	 JavaClass s = new JavaClass();
	 s.name ="ss";
	 s.listen();
	 
	 JavaClass.board = "white board";
	 JavaClass.teaching();
 }
 
 static {
		System.out.println("I am static block");
	}
}
