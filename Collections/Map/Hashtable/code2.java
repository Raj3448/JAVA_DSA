import java.util.*;
import java.io.*;

class PropertiesDemo {

	public static void main(String [] args) throws IOException{
	
		Properties obj = new Properties();

		FileInputStream fobj = new FileInputStream("friends.properties");

		obj.load(fobj);

		String name = obj.getProperty("Viraj");

		System.out.println(name);

		obj.setProperty("Rajkumar","Berojgar");

		FileOutputStream fout = new FileOutputStream("friends.properties");

		obj.store(fout,"Updated By Raj");


	}
}
