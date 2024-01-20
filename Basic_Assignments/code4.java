//Product of array elements
import java.io.*;
class ProductElement{


	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Product of array elements.........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		int prodEle = 1;
		for(int data:arr){
				prodEle = data*prodEle;
			System.out.print(data+" ");
		}
		System.out.println();
	
			System.out.println("Product of elements of the array : "+ prodEle);
	}
}
