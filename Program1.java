class Program1
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		int x=Power1.getPower(5, 4);
		System.out.println(x);

		test();
		System.out.println("main method ends");
		
	} 
	public static void test()
	{
		System.out.println("This is test method");
		test();
	}
}