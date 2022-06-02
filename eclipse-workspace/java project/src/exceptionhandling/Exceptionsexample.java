package exceptionhandling;

public class Exceptionsexample {

	public static void main(String[] args) {
		System.out.println("started");
		int a=10;
		System.out.println(a/0);//ArithmeticException
		//Thread.sleep(4000);//InterruptedException
		System.out.println("stopped");

	}

}
