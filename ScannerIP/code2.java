import java.io.*;
class BufferReader{

	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(isr);

		System.out.println("Enter name:");
		String name = Br.readLine();

		System.out.println("Enter your dream company:");
		String Copmn = Br.readLine();

		System.out.println("Enter Package:");
		float pack = Float.parseFloat(Br.readLine());

		System.out.println(name);
		System.out.println(Copmn);
		System.out.println(pack);
	}
}
