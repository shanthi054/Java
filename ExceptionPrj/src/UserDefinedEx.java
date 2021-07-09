/*
 * User defined exceptions
 */

class MyException extends Exception{
	MyException(){
		System.out.println("This competion is for 10 years");
	}
		MyException(String str){
			super(str);
		}
	
}
public class UserDefinedEx {
	public static void main (String ar[]) throws MyException {
		int age =11;
		if (age>10)
			throw new MyException("Only below age 10 are eligible");
		System.out.println("Helloc");
	}

}