import java.io.*;
import java.util.*;
class Core2web{

	public static void main(String [] args)throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player info:");
		String str = Br.readLine();

		StringTokenizer st = new StringTokenizer(str," ");

		System.out.println(st.countTokens());

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}
}
