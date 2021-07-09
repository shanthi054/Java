

class Account{
	int balance =50000;
}

class myAccount extends Account{
	
}
public class FinalClassEx {
	public static void main (String ar[]) {
		myAccount obj = new myAccount();
		obj.balance = 1000;
		System.out.println(obj.balance);
	}

}
