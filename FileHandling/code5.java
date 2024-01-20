import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class FileDataReadingDemo {

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new FileReader("/root/programming/java/java_dsa/FileHandling/core2web.txt"));

		String lines = "";

		while(lines != null){
			lines = br.readLine();
			if(lines == null)
				break;
			System.out.println(lines);
		}
	}
}
