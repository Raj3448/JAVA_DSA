//2 5 10                                                                                                //17 26 37                                                                                              //50 65 82 
class Pattern{
	public static void main(String[] args){

		int num = 1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print((+num*num+ + 1 )+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
