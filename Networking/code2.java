import java.net.*;
import java.io.*;

class URlDemo {

	public static void main(String [] args)throws IOException{
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Url :");
		String url = br.readLine();

		URL obj = new URL(url);

		System.out.println(obj.getProtocol());
		System.out.println(obj.getHost());
		System.out.println(obj.getFile());
	}
}
