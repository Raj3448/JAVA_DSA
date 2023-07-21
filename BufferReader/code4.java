import java.io.*;
class Core2web{
	public static void main(String [] args)throws IOException{

		BufferedReader Br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader Br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name:");
		String str1 = Br1.readLine();
		
		Br1.close();

		System.out.println("Enter Name:");
		String str2 = Br2.readLine();

		System.out.println(str1);
		System.out.println(str2);
	}
}
