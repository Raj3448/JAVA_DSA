//1 3 5                                                                                                 //7 9 11                                                                                                //13 15 17                                                                                              //19 21 23
class Pattern{

	public static void main(String [] args){

		int num = 1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){

				System.out.print(num+ "\t");
				num +=2;
			}
			System.out.println();
		}
	}
}
