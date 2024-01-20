//Search an minimum and maximum element in an array
import java.io.*;
class MinMaxElem{

        static void minEle(int arr[]){

		int min = arr[0];
		int secMin = arr[arr.length-1];

		int reserveIndex = 0;
		for(int i=0;i<arr.length;i++){
			
			if(min > arr[i]){
				min = arr[i];
				reserveIndex = i;
			}
		}

		System.out.println(reserveIndex);
		for(int i=0;i<arr.length;i++){
		
			if(i == reserveIndex){
				continue;
			}else if (secMin > arr[i]){
					secMin = arr[i];
			}
		}

		System.out.println("First and second minimum element in array : " + min + " & " + secMin);
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Search an minimum and second minimum element in an array..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();

		minEle(arr);
	}
}
