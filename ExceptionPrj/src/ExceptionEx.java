/*
 * compile time error
 * Run Time error(Exceptions)
 * Logical Errors
 * 
 * Exception is abnormal condition which will stop the normal execution
 * 
 * Throwable : represents all errors and exceptions in JAVA
 * 
 * Exceptions : super class of all exception in JAVA
 * 
 * try : exception will thrown after creating object
 * catch : handle exception
 * 
 * try with catch or finally is mandatory pair.
 * finally: mandatory statements to execute.
 * ----------------------------------------------
 * Exceptions TypeS: Checked exception, unchecked exceptions
 * 
 * checked exceptions can be identified in compile time, : throws/try-catch
 * unchecked exceptions : try-catch only
 * 
 * throw, throws
 */
public class ExceptionEx {
	public static void main(String ar[]) 
	{
		try {
			System.out.println(1 + 2);
			System.out.println(1 * 2);
			System.out.println(5 / 0); // divided by 0 is infinity : in Java, it is exception

		} catch (ArithmeticException e) 
		{
			System.out.println("divided by 0 is mistake");
		} catch (Exception e)
		{

		} finally {
			System.out.println("Hi");
		}
	}
}
