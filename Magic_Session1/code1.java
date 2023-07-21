//D4 C3 B2 A1
//A1 B2 C3 D4
//D4 C3 B2 A1
//A1 B2 C3 D4
import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Row:");
		int row = Integer.parseInt(Br.readLine());

		for(int i=1;i<=row;i++){
		        int ch = 65+row-1;
		        int num = row;
			int num1 = 1;
			int ch1 = 65;
			for(int j=1;j<=row;j++){
				if(i%2 == 0){
				System.out.print((char)(ch1)+""+num1+" ");
				ch1++;
				num1++;
				}else{
				System.out.print((char)(ch)+""+num+" ");
				ch--;
				num--;
				}
			}System.out.println();
		}
	}
}
