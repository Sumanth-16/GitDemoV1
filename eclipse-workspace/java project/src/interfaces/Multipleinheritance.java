package interfaces;
interface A
{
	int a=10;
	void m1();
}
interface B 
{
	int b=20;
	void m2();
}

public class Multipleinheritance implements A,B
 {
	public void m1()
	{
		System.out.println(a);
	}
public void m2()
{
	System.out.println(b);
}
	public static void main(String[] args)
	{
		
		Multipleinheritance mh=new Multipleinheritance();
		mh.m1();
		mh.m2();
	}

}
