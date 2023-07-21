//A B C D                                                                                               //B C D E                                                                                               //C D E F                                                                                               //D E F G    
class Pattern{
	public static void main(String [] args){

		char ch = 'A';
		for(int i=1;i<=4;i++){
			char temp = ch;
			for(int j=1;j<=4;j++){
				System.out.print(temp++ +" ");				
			}
			ch++;
			System.out.println();
		}
	}
}
