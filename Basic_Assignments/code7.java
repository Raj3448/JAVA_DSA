//largest number from digits
import java.io.*;
class FormLargeNum{

        static void sortEle(int arr[]){

		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			
			for(int j = i+1;j<arr.length;j++){

				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static int  createNum(int arr[]){

		int max = arr[0];
		int num = 0;
		for(int i=0;i<arr.length;i++){

			num = num*10 + arr[i];

		}
		return num;
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Form largest number from digits..........");
	
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
		sortEle(arr);
		int ret = createNum(arr);
		System.out.println("Generated largest number among the given array: "+ret);
	}
}
