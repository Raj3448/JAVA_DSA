import java.io.*;
class Core2web{
	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader Br1 = new BufferedReader(isr);

		System.out.println("Enter Name:");
		String name = Br1.readLine();

		System.out.println("Enter age:");
		int age = Integer.parseInt(Br1.readLine());

		System.out.println(name);
		System.out.println(age);
	}
}
