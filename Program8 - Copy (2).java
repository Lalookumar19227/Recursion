class Program8
{
	public static void main(String[] args)
	{
		test(10);
		
	} 
	public static void test(int x)
	{
		if(x>0){
			System.out.print(x+"  ");
			test(x-1);
		}
	}
}