// Last index of 1's of given given String
import java.io.*;
class StringLastIndex{


        static void printLastIndex(double strNum,int len){
		
		System.out.println("\tLast index of 1's: ");
		
		boolean flag = false;

		while(strNum != 0){

			if(strNum % 10 == 1){

				System.out.println("\n\t"+len);
				flag = true;
				break;
			}
			len--;	
			strNum = strNum / 10;
		}

		if(flag == false)
			System.out.println("\n\t-1");
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Last index of One ..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String:");
		String str = br.readLine();	

		int len = str.length()-1;
		System.out.println("Length : "+len);
		
		long strNum = Long.parseLong(str);
		System.out.println();

		System.out.println("Output:");
		printLastIndex(strNum,len);
	}
}
