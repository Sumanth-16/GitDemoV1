package exceptionhandling;

public class Handlecheckedclassexceptions {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		try
		{
		Thread.sleep(4000);
		
		}
		catch(InterruptedException e)
		
		{
			e.printStackTrace();
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
		
		

	}

}
