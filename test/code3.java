//
import java.io.*;
class Pattern {

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Row X Col :");
		int rowCol = Integer.parseInt(br.readLine());

		int ch = 65 + rowCol - 1;

		for(int i=1;i<=rowCol;i++){
			int temp = ch;
			for(int j=1;j<=rowCol;j++){

				if(i%2 == 0){

					int x = temp + 32;
					System.out.print((char)x+" ");
					temp++;
				}else{
					
					System.out.print((char)temp+" ");
					temp--;
				}
			}
			System.out.println();
			ch++;
		}
	}
}
