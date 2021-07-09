import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main (String ar[]) throws IOException{
		//FileWriter
		FileWriter fw=  new FileWriter("Sample.txt",true);
		
		fw.write("\n hello world! \n");
		
		//BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
		char c[] = {'d','r','l','g'};
		bw.write(c, 0, 4);
		bw.write("\n HELO!!!!!!!!!!" , 0 , 7);
		bw.close();
		          
	}

}
