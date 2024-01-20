class MergeSorting {

	void merge(int arr[],int start,int mid,int end){
		int arr1[] = new int[mid-start+1];
		int arr2[] = new int[end-mid];


		for(int i=0;i<arr1.length;i++){
			arr1[i] = arr[start+i];
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i] = arr[mid+i+1];
		}

		int itr1 = 0;
		int itr2 = 0;
		int itr3 = start;

		while(itr1 < arr1.length && itr2 < arr2.length){
			
			if(arr1[itr1] < arr2[itr2]){
				arr[itr3] = arr1[itr1];
				itr1++;
			}else{
				arr[itr3] = arr2[itr2];
				itr2++;	
			}
			itr3++;
		}

		while(itr1 < arr1.length){
			arr[itr3] = arr1[itr1];
			itr1++;
			itr3++;	
		}

		while(itr2 < arr2.length){
			arr[itr3] = arr2[itr2];
			itr2++;
			itr3++;
		}
	}
	void sortWithMerge(int arr[],int start,int end){
		if(start < end){
			int mid = start + (end-start) / 2;
			sortWithMerge(arr,start,mid);
			sortWithMerge(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String [] args){
	
		int arr[] = new int[]{8,4,3,1,10,6,7,2,5,9};

		MergeSorting ms = new MergeSorting();
		ms.sortWithMerge(arr,0,arr.length-1);

		System.out.println("Sorted Array With Merge Algoritham");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
