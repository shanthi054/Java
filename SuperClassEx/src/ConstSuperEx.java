
class AConst {

	int p, q, r;

	AConst() {
	}

	AConst(int p, int q, int r) {
		this.p = p;
		this.q = q;
		this.r = r;
	}
}

class BConst extends AConst {
	int s, t;

	BConst() {
	}

	BConst(int p, int q, int r, int s, int t) {
		super(p, q, r);

		this.s = s;
		this.t = t;
	}

	void add() {
		System.out.println(p + q + r + s + t + "," + p);
	}

}

public class ConstSuperEx {
	public static void main(String ar[]) {

		BConst b = new BConst(12, 12, 12, 12, 12);
		b.add();
	}

}
