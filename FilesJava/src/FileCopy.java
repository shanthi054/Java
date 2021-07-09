import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main (String ar[]) throws Exception {
		//open logo.png image file in read mode
		FileInputStream f = new FileInputStream("logo.png");

	    FileOutputStream fout = new FileOutputStream("qlogo.png");
	    
		int ch;
		
		while ((ch= f.read())!=1) {
			fout.write(ch);
			
		}
		fout.close();
		f.close();
	}

}
