//Program 7
//WAP to find the common elements between two arrays.
//Input :
//Enter first array : 1 2 3 5
//Enter Second array: 2 1 9 8
//Output: Common elements :
//1
//2
import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array's Size:");
		int n1 = Integer.parseInt(Br.readLine());
		int n2 = Integer.parseInt(Br.readLine());
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		System.out.println("Enter Elements in array1:");
		for(int i=0;i<n1;i++){
			arr1[i] = Integer.parseInt(Br.readLine());
		}
		System.out.println("Enter Elements in array2:");
		for(int i=0;i<n2;i++){
			arr2[i] = Integer.parseInt(Br.readLine());
		}
		int max1 = arr1[0];
		int max2 = arr2[0];

		for(int i=0;i<n1;i++){
			if(max1 < arr1[i]){
				max1 = arr1[i];
			}
		}
		for(int i=0;i<n2;i++){
			if(max2 < arr2[i]){
				max2 = arr2[i];
			}
		}
		
		int lar;
	        if(max1 < max2){
			lar = max2;
		}else{
			lar = max1;
		}

		int countArr1[] = new int[max1+1];
		int countArr2[] = new int[max2+1];

		for(int i=0;i<n1;i++){
			countArr1[arr1[i]]++;
		}
		for(int i=0;i<n2;i++){
			countArr2[arr2[i]]++;
		}
		System.out.println("Matching elements:");
		for(int i=0;i<lar;i++){
			if(countArr1[i] != 0 && countArr2[i] != 0)
				System.out.print(i+" ");
		}System.out.println();

	}
}
