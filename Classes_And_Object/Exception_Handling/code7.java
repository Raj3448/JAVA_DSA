import java.io.*;

class Demo{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String : ");
		String str = br.readLine();
		System.out.println(str);

		int num;

		System.out.println("Enter Integer Number :");
		try{
			num = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
		
			System.out.println("Invalid input please enter integer number");
			num = Integer.parseInt(br.readLine());
		}

		System.out.println(num);
	}
}
