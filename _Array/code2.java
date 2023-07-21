class ArrayDemo{
	void fun(int arr[]){
		arr[2] = 50;
		arr[3] = 70;
	}
	public static void main(String [] args){
		int arr[] = {10,20,30,40};

		for(int i=0;i<arr.length;i++){
			System.out.println(System.identityHashCode(arr[i]));
		}
		ArrayDemo obj = new ArrayDemo();

		obj.fun(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(System.identityHashCode(arr[i]));
		}
		System.out.println();
		System.out.println();
		
		int x = 50;
		int y = 70;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
