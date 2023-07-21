//Number Formate Exception
import java.io.*;
class Demo{

	public static void main(String[] args){
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int str = 12;
		try{
			str = Integer.parseInt(br.readLine());
		}catch(Exception obj){
	
			System.out.println(obj);	
		}
		System.out.println(str);

	}
}
