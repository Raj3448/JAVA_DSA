//write a program to print the following pattern
//Row =8
//$
//@ @
//& & &
//# # # #
//$ $ $ $ $
//@ @ @ @ @ @
//& & & & & & &
//# # # # # # # #
//USE THIS FOR LOOP STRICTLY for the outer loop
import java.io.*;
class Pattern{
	public static void main(String [] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Row:");
		int row = Integer.parseInt(Br.readLine());

		char ch = '$';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
			}
			switch(ch){
				case '$':
					ch = '@';
					break;
				case '@':
					ch = '&';
					break;
				case '&':
					ch = '#';
					break;
				case '#':
					ch = '$';
					break;
				default:
					ch = 'L';
					break;
			}
		System.out.println();
		}
	}
}
