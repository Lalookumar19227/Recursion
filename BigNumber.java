import java.util.Scanner;
class BigNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("ENter 3rd Number: ");
		int c=sc.nextInt();
		System.out.println("ENter 4rth Number: ");
		int d=sc.nextInt();
		System.out.println("ENter 5th Number: ");
		int e=sc.nextInt();

		System.out.println("Biggest is: "+big(big(big(a,b),c),big(d,e)));
	} 
	public static int big(int a, int b){
	return a>b?a:b;
	}
}