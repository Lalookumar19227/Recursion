import java.util.Scanner;
class Program9
{
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		test(n);
		System.out.println("Sum is: "+sum);
		
	} 
	public static void test(int x)
	{
		if(x>0){
			sum=sum+x;
			test(x-1);
		}
	}
}