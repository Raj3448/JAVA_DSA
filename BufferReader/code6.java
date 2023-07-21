import java.io.*;
import java.util.*;

class Core2web{
	public static void main(String [] args)throws IOException{
		BufferedReader Br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Match_info , Man of the match, Player runs");
		String info = Br1.readLine();

		System.out.print("Match info : "+info);
		System.out.println();

		StringTokenizer obj = new StringTokenizer(info," ");

		String Token1 = obj.nextToken();
		String Token2 = obj.nextToken();
		int Token3 = Integer.parseInt(obj.nextToken());

		System.out.println("Match Info : "+Token1);
		System.out.println("Man of the match : "+Token2);
		System.out.println("Player Name : "+Token3);

	}
}
