// Find common elements in three sorted arrays
import java.io.*;
class CommonElements{


        static void printCommonElements(int arr1[],int arr2[],int arr3[]){

		System.out.println("Common elements of array:");

		int max1 = arr1[0];
		for(int i=0;i<arr1.length;i++){
			
			if(max1 < arr1[i])
				max1 = arr1[i];
		}
		int countArr1[] = new int[max1+1];

		for(int j=0;j<arr1.length;j++){

			countArr1[arr1[j]]++;
		}

		//======================================

		int max2 = arr2[0];
		for(int i=0;i<arr2.length;i++){
			
			if(max2 < arr2[i])
				max2 = arr2[i];
		}
		int countArr2[] = new int[max2+1];
		for(int j=0;j<arr2.length;j++){

			countArr2[arr2[j]]++;
		}

		//======================================

		int max3 = arr3[0];
		for(int i=0;i<arr3.length;i++){
			
			if(max3 < arr3[i])
				max3 = arr3[i];
		}
		int countArr3[] = new int[max3+1];
		for(int j=0;j<arr3.length;j++){

			countArr3[arr3[j]]++;
		}

		//======================================
		
		if(max1 < max2 && max1 < max3){
			
			for(int i=0;i<arr1.length;i++){
				
				if(countArr1[arr1[i]] != 0 && countArr2[arr1[i]] != 0 && countArr3[arr1[i]] != 0){

					System.out.println(arr1[i]);
					countArr1[arr1[i]] = 0;
				}
			}

		}else if(max2 < max1 && max2 < max3){
			for(int i=0;i<arr2.length;i++){
				
				if(countArr2[arr2[i]] != 0 && countArr1[arr2[i]] != 0 && countArr3[arr2[i]] != 0){

					System.out.println(arr2[i]);
					countArr1[arr2[i]] = 0;
				}
			}
		
		}else if(max3 < max1 && max3 < max2){
			for(int i=0;i<arr3.length;i++){
				
				if(countArr3[arr3[i]] != 0 && countArr1[arr3[i]] != 0 && countArr2[arr3[i]] != 0){

					System.out.println(arr3[i]);
					countArr3[arr3[i]] = 0;
				}
			}
		
		}else{
			for(int i=0;i<arr1.length;i++){
				
				if(countArr1[arr1[i]] != 0 && countArr2[arr1[i]] != 0 && countArr3[arr1[i]] != 0){

					System.out.println(arr1[i]);
					countArr1[arr1[i]] = 0;
				}
			}
		
		}
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Find common elements in three sorted arrays .........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array1 Size:");
		int n1 = Integer.parseInt(br.readLine());	
		int arr1[] = new int[n1];
		
		System.out.println("Enter Array2 Size:");
		int n2 = Integer.parseInt(br.readLine());	
		int arr2[] = new int[n2];

		System.out.println("Enter Array3 Size:");
		int n3 = Integer.parseInt(br.readLine());	
		int arr3[] = new int[n3];

		System.out.println("Enter elements in array1:");
		for(int i=0;i<n1;i++){
 
			arr1[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Enter elements in array2:");
		for(int i=0;i<n2;i++){
 
			arr2[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Enter elements in array3:");
		for(int i=0;i<n3;i++){
 
			arr3[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Array1:");
		for(int data:arr1){

			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("Array2:");
		for(int data:arr2){

			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("Array3:");
		for(int data:arr3){

			System.out.print(data+" ");
		}
		System.out.println();

		System.out.println("Output:");
		printCommonElements(arr1,arr2,arr3);
	}
}
