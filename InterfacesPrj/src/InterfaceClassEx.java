/*
 * all the objects in interface are static variables and
 * all the methods in interface are  abstract by default
 *Instance cannot be created
 *IMPLEMENTS
 *
 * c      i       i
 *  extends      implements 
 * c      i       c
 * 
 * all the methods implemented from interface should be public
 * 
 * multiple Inheritance by using interface : two interfaces -1 child
 * 
 * one class, 2 interface , 1 child 
 */

interface InterfaceEx1 {
	int p =10;
	void show();
	void display();
}

interface InterfaceEx2 {
	int p =10;
	void show2();
	void display2();
}

class B {
	void add(int q, int r) {
		System.out.println(q+r);
	}
}

class A extends B implements InterfaceEx1, InterfaceEx2{
	
	public void show() {
		System.out.println(" Class A show method" );
	}
	public void display() {
		System.out.println(" Class A display method" );
	}
	public void show2() {
		System.out.println(" Class A show2 method" );
	}
	public void display2() {
		System.out.println(" Class A display2 method" );
	}
}



public class InterfaceClassEx {
	public static void main(String ar[]) {
		A a = new A();
		a.show();
		a.display();
		a.show2();
		a.display2();
		a.add(45, 455);
	}

}
