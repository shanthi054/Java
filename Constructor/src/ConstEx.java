/*
 * Constructor is also a method in which its name should be class name.
 * 1)It is also same as method
 * 2) Constructor name should be equivalent to it's classname
 * 3) doesnt have any return Type
 * 
 * constructors are used to initialize the instance variables
 * 
 */

class Example {
	String channel;
	//constructor overloading- same name -with diff signatures
	Example()// default constructor
	{
		channel = "Telugu web Guru";
	}
	Example(String name)// parameterized constructor
	{
		this.channel = name;
	}
}

public class ConstEx {
	
	public static void main (String[] ar) {
	Example e = new Example();
	System.out.println("Example value is " +e.channel);
	Example e1 = new Example("TWG");
	System.out.println("Example value is " +e1.channel);
	}
}
