//A b C d E
//e D c B
//B c D
//d C
//C
import java.io.*;
class Pattern {

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Row X Col ");
	        int rowCol = Integer.parseInt(br.readLine());	
		
		char ch = (char)(65);
		char temp = ch;
		for(int i=1;i<=rowCol;i++){
			ch = temp;
			for(int j=1;j<=rowCol-i+1;j++){

				if(i%2 != 0){

					if(j%2==0){
						int ch1 = ch+32;
						System.out.print((char)ch1+" ");
					}else{

						System.out.print((char)ch+" ");
					}
					ch++;
				}else{
				
					if(j%2==0){

						System.out.print((char)ch+" ");
					}else{
						int ch2 = ch + 32;
						System.out.print((char)ch2+" ");
					}
					ch--;
				}
			}
			System.out.println();
			
			if(i%2==0)
				ch++;
			else
				ch--;
			temp = ch;
		}

	}
}
