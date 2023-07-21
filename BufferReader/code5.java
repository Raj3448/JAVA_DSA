import java.io.*;
class Core2web{
	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader Br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name:");
		String str1 = Br1.readLine();

		System.out.println("Enter Wing:");
		char ch = (char)isr.read();

		System.out.println(str1);
		System.out.println(ch);
	}
}
