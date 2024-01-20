import java.net.*;
import java.io.*;

class SocketDemo {

	public static void main(String [] args) {
	
		Socket s = new Socket("localhost",1200);
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String str = br.readLine();
		while(str != null){
			str = br.readLine();
			System.out.println(str);
		}

		is.close();
		br.close();
	}
}
