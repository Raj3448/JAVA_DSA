class QuickSort{

	int partition(int arr[],int start, int end){
		int pivotElement = arr[end];
		int i = start - 1;

		for(int j = start; j < end; j++){

			if(arr[j] < pivotElement){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp1 = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp1;

		return i+1;
	}
	void sortWithQuickSort(int arr[],int start,int end){
		if(start < end){
			int pivot = partition(arr,start,end);
			sortWithQuickSort(arr,start,pivot-1);
			sortWithQuickSort(arr,pivot+1,end);
		}
	}
	public static void main(String [] args) {
	
		int arr[] = new int[]{9,4,7,2,8,1,5,3,6,10};

		QuickSort qs = new QuickSort();

		qs.sortWithQuickSort(arr,0,arr.length-1);

		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
