/*
 * creating a new class from exisiting class
 * All the properties, methods are used in new class from existing classe
 * 
 * object of one class acquiring prop another class.
 */
//single inheritence
class A {
	int p;
	
	A(){} // write default constructor

	A(int a) {
		p = a;
	}

	void display() {
		System.out.println("I am base class method display " + p);
	}
}

class B extends A {
	int q;

	B(int p, int q) {
		this.p = p;
		this.q =q;
	}

	void show() {
		System.out.println("I am B class  " + q);
	}
}

public class InheritanceInJAVA {
	public static void main(String[] ar) {
		B obj = new B(10, 5);
		 
		obj.show();
		obj.display();
	}

}
