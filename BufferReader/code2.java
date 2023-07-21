import java.io.*;
class Core2web{
	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader Br1 = new BufferedReader(isr);

		System.out.println("Enter Plyer Name:");
		String Pname = Br1.readLine();

		System.out.println("Enter jersy no. :");
		int jerno = Integer.parseInt(Br1.readLine());

		System.out.println("Enter revenue avarage :");
		float avg = Float.parseFloat(Br1.readLine());

		System.out.println("Player Name = "+Pname);
		System.out.println("Jersy No. = "+jerno);
		System.out.println("Revenue avarage = "+avg);
	}
}
