import java.io.*;
import java.lang.Class;
class Input{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String:");
		String str = br.readLine();
		System.out.println(str);

		br.close();

		String str1 = null;
		System.out.println("Enter String:");
		try{
			str1 = br.readLine();
		}catch(IOException obj){
		
			System.out.println();
			System.out.println("Input nahi gheu shakat lavdya tu stream close keli ahes");
		}
		System.out.println(str1);
	}
}
