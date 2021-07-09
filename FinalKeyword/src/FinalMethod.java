class A{
   final void show() {
		System.out.println("I am from show method of A Class");
	}
}

class B extends A{
	/*
	 * void show() { System.out.println("I am from show method of B Class"); }
	 */
}

public class FinalMethod {
	
public static void main (String ar[]) {
	B b = new B();
	b.show();
	
}
}
