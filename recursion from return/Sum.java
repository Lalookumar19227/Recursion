import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("The Sum upto "+n+" Natural Numbers is: "+getSum(n));
		
	} 
	public static int getSum(int n)
	{
		if(n>1)
			return n+getSum(n-1);
		else
			return n;
	}
}