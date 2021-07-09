
class student {
	String name;
	int age;
	
	student (String n, int a){
		name =n ;
		age =a;
	}
}
public class ArrayObjectsEx {
public static void main (String ar[]) {
	student s1 = new student("smith",36);
	student s2 = new student("john",33);
	student s3 = new student("joe",35);
	student s4 = new student("kate",24);
	student s5 = new student("dreana",29);
	student students[] = new student[5];
	
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	students[3]=s4;
	students[4]=s5;
	
	for (int i=0; i<students.length;i++) {
	 student s = students[i];
		System.out.print(s.name +"\t");
		System.out.println(s.age);
	}
}
}
