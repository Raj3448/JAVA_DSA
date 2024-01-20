class SelectionSort {

	void sortBySelection(int arr[], int N){
		for(int i=0;i<N;i++) {
			int minIndex = i;
			for(int j=i+1;j<N;j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String [] args){
	
		int arr[] = {78,35,56,22,10,30};
		SelectionSort ss = new SelectionSort();
		ss.sortBySelection(arr,arr.length);
	
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
