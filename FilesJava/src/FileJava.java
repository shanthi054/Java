import java.io.File;
import java.util.Date;

public class FileJava {
	public static void main(String ar[]) {
		
		File f = new File("File.txt");
		//methods in file class
		System.out.println("exists ():  "+f.exists());
		if (f.exists()==true) {
			
		System.out.println("Canread  " +f.canRead());
		System.out.println("canWrite  " +f.canWrite());
		System.out.println("lastmodified  " +f.lastModified());
		Date d = new Date(f.lastModified()*1000);
			
		System.out.println(d);
		
		}
	
	}

}
