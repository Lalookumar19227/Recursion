import java.util.Scanner;
class BigNumber1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		int big=a;
		char c;
		do{
			System.out.println("ENter the next Number: ");
			int b=sc.nextInt();
			big=getBig(big, b);
			System.out.println("Press y/y to enter next Number");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("The Biggest Number is: "+big);
	} 
	public static int getBig(int a, int b){
	return a>b?a:b;
	}
}