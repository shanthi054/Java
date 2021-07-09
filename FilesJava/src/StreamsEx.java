import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Stream: Its like a pipe which transfers data.
 *  streams are used to read/write data from one place to another 
 * 
 * --------------------------------------------------------------
 * Types:
 * Byte Streams --> image,audio
 * Char Streams --> txt
 * 
 * FileReader - char by char
 * FileInputStream - byte by byte
 */
//program to demonstrate reading contents from files

public class StreamsEx {

	public static void main(String ar[]) throws IOException {

		// open file in read mode
		FileReader fr = new FileReader("File.txt");
	/*	int ch;
		while ((ch = fr.read()) != -1) {

			System.out.print((char) ch);
		
		}*/
		
		BufferedReader br = new BufferedReader( fr);
		String s;
		while((s=br.readLine())!= null) {
		System.out.print(s);
		System.out.print("\n");
		}

	}

}
