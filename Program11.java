class Program11
{
	public static void main(String[] args)
	{
		test(3); 
	} 
	public static void test(int x)
	{
		if(x==1){
			System.out.println(" From if  "+x);
			return;
		}
		test(x-1);
		System.out.println("x After if  "+x);
		test(x-1);

	}
}