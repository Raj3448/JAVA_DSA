//# = = = =
//= # = = =
//= = # = =
//= = = # =
//= = = = #
import java.io.*;
class Pattern{
	public static void main(String [] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Row:");
		int row = Integer.parseInt(Br.readLine());

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i == j){
				     System.out.print("# ");
				}else{
				     System.out.print("= ");
				}
			}
		        System.out.println();
		}
	}
}
