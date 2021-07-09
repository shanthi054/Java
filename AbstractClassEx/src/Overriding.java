

class A{
	int p,q;
	void add(int p, int q) {
		System.out.println("two parameters "+(p+q));
	}
	
}

class B extends A{
	 
	void add(int p, int q) {
		super.add(p, q);
		System.out.println("two parameters B  =   "+(p+q));
	}
	
}

public class Overriding {
	public static void main (String[] ar) {
		
		B ob = new B();
		ob.add(34, 12);
	}

}
