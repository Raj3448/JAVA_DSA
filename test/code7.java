//Take the size of the array from the user. Create two arrays of that size. Initialize all
//second array elements as zero(0). For the first array take all elements from the user.
//Check if the elements in the first array are even or not if it's even then replace the
//value of the second array of that index with 1 and print both the array.
//5 pts.
//Input : Size : 10
//Array 1 Elements : 4 2 3 6 8 7 1 0 9 5
//Output : Array 1 Elements : 4 2 3 6 8 7 1 0 9 5
//Array 2 Elements : 1 1 0 1 1 0 0 1 0 0
import java.io.*;
class ArrayDemo {

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());
		int arr1[] = new int[n];
		int arr2[] = new int[n];

		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(br.readLine());
			if(arr1[i]%2==0){
				arr2[i] = 1;
			}
		}

		System.out.println("Array1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

		System.out.println("Array2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();

	}
}
