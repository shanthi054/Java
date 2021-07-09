import java.io.*;
public class FileReadByte {
public static void main(String ar[]) throws IOException {
	
	FileInputStream fin = new FileInputStream("Sample.txt");
	
	int ch;
	while ((ch=fin.read())!=-1){
		System.out.print((char)ch);
	}
	
}	

}
