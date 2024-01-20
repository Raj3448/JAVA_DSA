class InsertionSort{

	void sortInsertion(int arr[],int N){

		for(int i=0;i<N;i++){
			for(int j = i+1; j >= 1;j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

	public static void main(String [] args){
	
		int arr[] = {5,8,2,9,3,1};
		InsertionSort is = new InsertionSort();
		is.sortInsertion(arr,arr.length-1);

		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
