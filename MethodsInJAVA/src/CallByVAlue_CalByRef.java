//call by value - even if you are passing variables, method is called with values assigned to variables
// call by reference - object reference is passed as parameters

class MethodEx1 {

	int v1 ,v2;
	void add(int a, int b) {

		int c = a + b;
		System.out.println(c);
		System.out.println("a,b,c values" + a + " ," + b + " , " + c);
		a = 67;
		b = 66;
		c = a + b;
		System.out.println("a,b,c values" + a + " ," + b + " , " + c);
	}
	
	void check(MethodEx1 obj) { //
		obj.v1 =34;
		obj.v2 =34;
		System.out.println("v1,v2 values" + obj.v1 + " ," + obj.v2);
		
	}

}

public class CallByVAlue_CalByRef {
	public static void main(String arr[]) {
		int p = 12;
		int q = 59;
			

		MethodEx1 s = new MethodEx1();
		System.out.println("p,q values" + p + " ," + q);
		s.add(p, q); // call by value
		System.out.println("p,q values" + p + " ," + q);
		
		s.v1 = 11;
		s.v2 =22;
		System.out.println("v1,v2 values" + s.v1 + " ," + s.v2);
		s.check(s); // call by reference
		System.out.println("v1,v2 values" + s.v1 + " ," + s.v2);
	}

}
