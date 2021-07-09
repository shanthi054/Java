
/*
 * Single
 * Multi-level
 * Hierarchical
 * Multiple
 * 
 * A  <--  B 
 * 
 * A is base/super/parent
 * B is derived/sub/child
 * 
 * one super, one child --> single
 * 
 * one super, one sub(this is also sub), one child --> multi-level
 * 
 * one super, two child --> hierarchical
 * 
 * two super, one child --> multiple
 * 
 * 
 */

//mutli level inheritence

class C {
	int p;

	C() {
	}

	C(int p) {

	}
}

class D extends C {
	int q;

	D() 
	{
	}

	D(int p, int q) {
		this.p = p;
		this.q = q;
	}
}

class E extends D {

	int r;

	E(int p, int q, int r) {
		this.p = p;
		this.q = q;
		this.r = r;
	}
	void add() {
		System.out.println(p+q+r);
	}
}

public class TypesOfInheritence {
	public static void main(String ar[])
	{
    E ob = new E(12,6,7);
    
    ob.add();
	}

}
