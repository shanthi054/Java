/*
 * method, functions are same
 * method/function is defined inside the class
 * method is set of instructions.
 * 
 */
public class MethodInJAVA {
	
	//instance variables

	int a;
	int b;
	
	// instance methods; method overloading - same methodname in different forms
	void add() {
		System.out.println("addition result is :" +(a+b));
	}
	void add(int a) {
		System.out.println("addition result is :" +(a+b));
	}
	void add(String a) {
		System.out.println("addition result is :" +(a+b));
	}
	void mul() {
		System.out.println("mul result is :" +(a*b));
	}
	void sub() {
		System.out.println("sub result is :" +(a-b));
	}
}

 class MethodEx{
	public static void main(String ar[]) {
		int p =25;
		int q = 30;
		
		MethodInJAVA obj = new MethodInJAVA();
		
		obj.a = p;
		obj.b = q;
		
		obj.add();
		obj.mul();
		obj.sub();
		
	}
	
	
}
