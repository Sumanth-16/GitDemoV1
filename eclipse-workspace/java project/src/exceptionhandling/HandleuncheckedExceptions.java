package exceptionhandling;

public class HandleuncheckedExceptions {

	public static void main(String[] args) {
		System.out.println("program is started");
		/*int a=10;
		try
		{
		
		
		//System.out.println(a/0);//Arithmetic Exception
		//}
		//catch(ArithmeticException e)
		//{
		//	System.out.println(e.getMessage());
		//}*/
		String s=null;
		
	try
	{
		System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
		
		System.out.println("program is in progress");
		System.out.println("program is completed");
		

	}

}
