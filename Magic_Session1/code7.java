//write a program to print the following pattern
//Row =5;
//O
//14 13
//L K J
//9 8 7 6
//E D C B A
//
//Row = 4
//10
//I H
//7 6 5
//D C B A
import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Row:");
		int row = Integer.parseInt(Br.readLine());

		int num = row*(row+1)/2;
		int ch1 = 65 + num-1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2 == 1){
					System.out.print((char)ch1+" ");
				}else{
					System.out.print(num+" ");
				}
				ch1--;
				num--;
			}System.out.println();
		}
	}
}
