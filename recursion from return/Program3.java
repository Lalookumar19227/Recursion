class Program3
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		String x=test(4);
		System.out.println("x is: "+x);
		System.out.println("main method ends");
		
	} 
	public static String test(int x)
	{
		if(x>1){
			System.out.println("This is test method");
			return test(x-1);
		}
		else{
			return "Mohan is here";
		}
	}
}