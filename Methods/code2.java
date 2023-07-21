import java.util.*;

class Calculator{
	static int Addition(int a,int b){
			return a+b;
	}
	static int Substraction(int a,int b){
			return b-a;
	}
	static int Multiplication(int a,int b){
			return a*b;
	}
	static int Division(int a,int b){
			return a/b;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Input Integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		char choice1;

		do{

			System.out.println("1.Addition");
			System.out.println("2.Substration");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");

		System.out.println("Enter choice from above chart: ");
		int choice2 = sc.nextInt();

		switch(choice2){
			case 1:{
				int ret = Addition(a,b);
				System.out.println("Addition = "+ret);
			       }
				break;
			case 2:{
				int ret = Substraction(a,b);
				System.out.println("Substraction = "+ret);
			       }
				break;
			case 3:{
				int ret = Multiplication(a,b);
				System.out.println("Multiplication = "+ret);
			       }
				break;
			case 4:{
				int ret = Division(a,b);
				System.out.println("Division = "+ret);
			       }
				break;
			default:
				System.out.println("Wrong input");
				break;
		}

		System.out.println("Do you want to continue?");
		choice1 =  sc.next().charAt(0);

		}while(choice1 == 'y'|| choice1 == 'Y');
	}
}
