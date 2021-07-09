class X{
	int p ;
	X(){}
	X(int p){
		this.p =p;
		
	}
	
}

class Y extends X {
	int q ;
	Y(int p, int q){
		this.p =p;
		this.q=q;
	}
	void add1() {
		System.out.println("addition of p and q  in class Y " +(p+q));
	}
}

class Z extends X {
	int r ;
	Z(int p, int r){
		this.p =p;
		this.r=r;
	}
	void add() {
		
		System.out.println("addition of p and r in class Z " +(p+r));
	}
}


class HierarachicalEx {
	public static void main(String[] ar) {
		Y ob = new Y(12,12);
		Z ob1 = new Z(12,454);
		ob.add1();
		ob1.add();
		
	}

	
}
