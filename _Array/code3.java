import java.io.*;
class ArrayDemo{
	public static void main(String []args)throws IOException{
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.err.println("Enter Row and Column:");
		int row = Integer.parseInt(Br.readLine());
		int col = Integer.parseInt(Br.readLine());

		int arr[][] = new int [row][col];

	
		System.err.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = Integer.parseInt(Br.readLine());
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
