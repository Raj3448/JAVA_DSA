//        1                                                                                             //      1 2 3                                                                                           //    1 2 3 4 5                                                                                         //  1 2 3 4 5 6 7                                                                                       //1 2 3 4 5 6 7 8 9   
class Pattern{
	public static void main(String [] args) {

		int row = 4;
		for(int i=1;i<=row;i++){
			int num = 1;
			for(int j=1;j<=row-i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(num++ +"\t");
			}
			System.out.println();
		}
	}
}
