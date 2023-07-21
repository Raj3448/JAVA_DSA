//4 3 2 1                                                                                               //5 4 3 2                                                                                               //6 5 4 3                                                                                               //7 6 5 4         
class Pattern{

	public static void main(String []args){

		int row = 4;
		int num = row;

		for(int i=1;i<=row;i++){
			int temp = num;
			for(int j=1;j<=row;j++){
				System.out.print(+temp-- +"\t");
			}	
			num++;
			System.out.println();
		}
	}
}
