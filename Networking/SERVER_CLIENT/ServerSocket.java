import java.inet.*;
import java.io.*;

class ServerSocketDemo1{

	public static void main(String [] args)throws IOException{
	
		ServerSocket ss = new ServerSocket(1200);

		Socket s = ss.accept();
		System.out.println("Connection Eshtablished");
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);

		ps.println("Hello Client");
		ps.println("Go to Hell");

		os.close();
		ps.close();
		ss.close();
	}
}
