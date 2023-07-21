class ArrayDemo{

	public static void main(String [] args){
	
		int arr1[] = {10,200,300};
		int arr2[] = {10,200,300};
		Integer arr3[] = {10,200,300};

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));

		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));
		
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));
		
		System.out.println(System.identityHashCode(arr3[0]));
		System.out.println(System.identityHashCode(arr3[1]));
		System.out.println(System.identityHashCode(arr3[2]));
		
		System.out.println(System.identityHashCode(arr3[0]));
		System.out.println(System.identityHashCode(arr3[1]));
		System.out.println(System.identityHashCode(arr3[2]));
	}
}
