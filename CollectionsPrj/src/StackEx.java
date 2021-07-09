import java.util.*;

//program to demonstrate Stack in Java
public class StackEx {
	public static void main(String ar[]) {
		Stack<Integer> marks = new Stack<Integer>();
		marks.push(100);  //6
		marks.push(98);  //5
		marks.push(97);  //4
		marks.push(96);  //3
		marks.push(95); //2
		marks.push(94); //1
		
		
		if (marks.empty())
			System.out.println("stack is empty");
		else
			System.out.println("top element "+marks.peek());
			System.out.println(marks);
			System.out.println("top element "+marks.pop());
			System.out.println(marks.search(95));
			System.out.println("top element "+marks.peek());
			
	}

}
