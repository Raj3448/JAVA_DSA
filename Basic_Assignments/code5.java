//Replace 5 to 0
import java.io.*;
class Replace5to0{

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Replace 5 to 0 in given number..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int num = Integer.parseInt(br.readLine());	
		
		int ret = 0;
		int count = 0;
		while(num != 0){
			int rem = num % 10;	
			if(rem == 5){
				rem = 0;
			}
			count++;
			ret = 10*ret + rem;
			num = num / 10;
		}

		int replaceNum = 0;
		while(ret != 0 || count != 0){
			
			replaceNum = 10 * replaceNum + (ret % 10);
			ret = ret / 10;
			count--;
		}


		System.out.println("Replaced Number : " + replaceNum);
	}
}
