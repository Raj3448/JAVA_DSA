import java.net.*;
import java.io.*;
class IPAddress {

	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the url of website:");	
		String url = br.readLine();

		InetAddress ip = InetAddress.getByName(url);

		System.out.println("Ip address : "+ip);
		System.out.println("Ip address : "+ip);
		System.out.println("Ip address : "+ip.getHostAddress());
	}
}
