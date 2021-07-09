/*
 * Specialized class
 * method with code is concrete method
 * method without code is abstract method
 * 
 * abstract method cannot be initiated  
 */

abstract class CGovt{
	
	void otherdirections() {
		System.out.println("I am from other directions method");
	}
	abstract void actionsofTaken() ;
}

class AP extends CGovt{


	void actionsofTaken() {
		System.out.println("I am from actionsofTaken method AP");
		
	}
	
}

class TG extends CGovt{

	
	void actionsofTaken() {
		System.out.println("I am from actionsofTaken method in TG");
		
	}
	
}

class AbStractClassEx {
	public static void main (String ar[]) {
		
		AP ap = new AP();
		ap.actionsofTaken();
		ap.otherdirections();
		
		TG tg = new TG();
		tg.actionsofTaken();
		tg.otherdirections();
	}

}
