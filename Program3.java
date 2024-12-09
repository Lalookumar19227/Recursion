class Program3
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
		if(x<=100){
			test(x+1);
		}
	}
}