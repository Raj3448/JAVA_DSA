/* Java program to merge two given arrays.
 Array1 = [10, 20, 30, 40, 50]
 Array2 = [9, 18, 27, 36, 45]
 Output :
 Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
 Hint: you can take 3rd array*/
import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two Array's Size:");
		int N1 = Integer.parseInt(Br.readLine());
		int N2 = Integer.parseInt(Br.readLine());

		int arr1[] = new int[N1];
		int arr2[] = new int[N2];

		System.out.println("Enter elements in array1:");
		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(Br.readLine());
		}
		System.out.println("Enter elements in array2:");
		for(int i=0;i<arr2.length;i++){
			arr2[i] = Integer.parseInt(Br.readLine());
		}

		int arr3[] = new int[N1+N2];

		for(int i=0;i<N1;i++){
			arr3[i] = arr1[i];
		}
		int j = N1;
		for(int i=0;i<N2;i++){
			arr3[j++] = arr2[i];
		}
		System.out.println("Merge Array:");
		for(int i=0;i<N1+N2;i++){
			System.out.print(arr3[i]+" ");
		}System.out.println();
	}
}
