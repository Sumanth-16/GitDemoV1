package interfaces;

interface Testinter
{
	int a=10;//by default the variable is static and final
	void m1();//abstract method
	
		
	
}



public class Interfaceexample implements Testinter
{
	public void m1()
	{
		System.out.println(a);
	
	
}

	public static void main(String[] args) {
		Testinter ie=new Interfaceexample();
				ie.m1();
		

	}

}
