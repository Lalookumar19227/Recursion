class Program6
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		test(1);
		System.out.println("main method ends");
		
	} 
	public static void test(int x)
	{
		System.out.println("This is test method: "+x);
		if(x<=2){
			test(x+1);
		}
		else{
			System.out.println("From else x is: "+x);
		}
		System.out.println("This statement is out of if else and x is: "+x);
	}
}