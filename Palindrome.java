import java.util.Scanner;
class Palindrome
{
	static int rev=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter number: ");
		int a=sc.nextInt();
		if(a==getRev(a))
			System.out.println(a+" is a Palindrome Number");
		else
			System.out.println(a+" is NOT a Palindrome Number");

	} 
	public static int getRev(int n){
		if(n>0){
			rev=10*rev+n%10;
			getRev(n/10);
		}
	return rev;
	}
}