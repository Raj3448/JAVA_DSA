//Largest Element in Array
import java.io.*;
class LargeElement{


	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Largest element in an array..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		int largeEle = 0;
		for(int data:arr){
			if(largeEle < data)
				largeEle = data;
			System.out.print(data+" ");
		}
		System.out.println();
	
			System.out.println("Largest Element in the array : "+ largeEle);
	}
}
