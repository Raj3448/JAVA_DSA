import java.util.*;
class SoundSystemInterruptedException extends RuntimeException{

	SoundSystemInterruptedException(String msg){

		super(msg);
	}
}
class Client{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Is Electricity Available for live music concert? (y/n)");
		String str = sc.next();

		char isElectricityAvailable = str.charAt(0);

		if(isElectricityAvailable == 'n'){

			throw new SoundSystemInterruptedException("Sound System connectivity failed live stream terminated");
		}else{
		
			System.out.println("Live Stream Available");
		}

	}
}
