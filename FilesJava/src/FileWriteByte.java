import java.io.*;
public class FileWriteByte {
	public static void main (String arp[]) throws Exception {
		
		//open file in write mode
		FileOutputStream fo = new FileOutputStream("File1.txt");
		// write the contents to file
			fo.write((int)'Z');
			
			byte b[] = {67,14,34,54,47};
			fo.write(b);
			fo.close();
		 
	}

}
