package oops;

public class Calculation {
	
	
	int a;
	int b;
	//without parameters
	/*void sum()
	{
		System.out.println(a+b);
	}*/
	/*void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	 int sum()
	{
		return(a+b);
	}
	
	
	
			

	public static void main(String[] args)
	{
		Calculation cal =new Calculation();
		/*cal.a=10;
		cal.b=20;*/
		cal.a=10;
		cal.b=20;
		int m =cal.sum();
		System.out.println(m);
		
		
		
		
		

	}

}
