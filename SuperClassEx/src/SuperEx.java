/*
 * to access super class members
 * to call superclass constructors
 * super keyword is used in sub-class
 * 
 */

class A {
	int p = 10;

	void show() {
		System.out.println("p from A " + p);
	}
}

class B extends A {
	// p=10,show() from class A will be hiding --> to access them we can use super
	// class
	int q = 20;
	int p = 45;

	void show() {
		super.show();
		System.out.println("p from  super A " + super.p); // super class can be used only in subclass
		System.out.println("p from B " + p);
		System.out.println("q from B " + q);
	}
}

class SuperEx {
	public static void main(String ar[]) {

		B obj = new B();

		obj.show();

	}

}
