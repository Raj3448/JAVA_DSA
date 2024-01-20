import java.io.FileReader;

class FileReaderDemo {

	public static void main(String [] args){

		try{
		FileReader fr = new FileReader("/root/programming/java/java_dsa/FileHandling/core2web.txt");

		int i = 1;
		while(i != 22){

			char ch = (char)fr.read();
			System.out.println(ch);
			i++;
		}
		fr.close();
		}catch(IOException ie){
		}catch(FileNotFoundException fnfe){
		}



	}
}
