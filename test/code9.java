// WAP to take string from user and convert all even indexes of string to uppercase and
// odd indexes of a string to lowercase. 4 pts.
// Input : dfTbnSrOvryt
// Output : DfTbNsRoVrYt
import java.io.*;
class StringDemo {

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String: ");
		String str = br.readLine();

		StringBuilder str2 = new StringBuilder();

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if(i%2==0){
				
				str2.append(Character.toUpperCase(ch));
			}else{
				
				str2.append(Character.toLowerCase(ch));
			}
		}

		System.out.println("Output : "+str2);
	}
}
