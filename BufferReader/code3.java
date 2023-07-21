import java.io.*;
import java.util.*;
class Demo{
	public static void main(String [] args)throws IOException{
	BufferedReader Br1 = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter Building Name:");
	String name = Br1.readLine();

	System.out.println("Enetr Wing Name:");
	char ch = (char) Br1.read();

	skip(1);

	System.out.println("Enter Flat No. :");
	int flatno = Integer.parseInt(Br1.readLine());

	System.out.println(name);
	System.out.println(ch);
	System.out.println(flatno);
	}
}
