class Program7
{
	public static void main(String[] args)
	{
		test(1);
		
	} 
	public static void test(int x)
	{
		if(x<=10){
			System.out.print(x+"  ");
			test(x+1);
		}
	}
}